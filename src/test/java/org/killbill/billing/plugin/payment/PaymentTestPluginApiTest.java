package org.killbill.billing.plugin.payment;

import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.osgi.libs.killbill.OSGIConfigPropertiesService;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillLogService;
import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.payment.plugin.api.PaymentPluginStatus;
import org.killbill.billing.payment.plugin.api.PaymentTransactionInfoPlugin;
import org.killbill.billing.plugin.api.PluginCallContext;
import org.killbill.billing.plugin.payment.dao.PaymentTestDao;
import org.killbill.clock.Clock;
import org.mockito.Mock;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.killbill.billing.plugin.payment.PaymentTestActivator.PLUGIN_NAME;

public class PaymentTestPluginApiTest {

    @Mock
    OSGIKillbillAPI             killbillAPI;
    @Mock
    OSGIConfigPropertiesService configProperties;
    @Mock
    OSGIKillbillLogService      logService;
    @Mock
    Clock                       clock;
    @Mock
    PaymentTestDao              paymentTestDao;


    TestingStates        testingStates;
    PaymentTestPluginApi paymentTestPugin;
    PluginCallContext    pluginCallContext;
    UUID                 accountId;
    UUID                 tenantId;

    @BeforeMethod
    public void setUp() {

        this.tenantId = UUID.randomUUID();
        this.accountId = UUID.randomUUID();
        this.pluginCallContext = new PluginCallContext(PLUGIN_NAME, DateTime.now(), this.accountId, this.tenantId);
        this.testingStates = new TestingStates();
        this.paymentTestPugin = new PaymentTestPluginApi(this.killbillAPI,
                                                         this.configProperties,
                                                         this.logService,
                                                         this.clock,
                                                         this.paymentTestDao,
                                                         this.testingStates);
    }

    @AfterMethod
    public void tearDown() {
    }

    @BeforeMethod
    void beforeMethod() {
        this.testingStates = new TestingStates();
    }

    @Test
    public void testReturnNull() throws PaymentPluginApiException {
        this.testingStates.add(TestingStates.Actions.RETURN_NIL, null);
        final PaymentTransactionInfoPlugin ret = this.paymentTestPugin.authorizePayment(
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                BigDecimal.TEN,
                Currency.EUR,
                null,
                this.pluginCallContext);
    }

    @Test(expectedExceptions = PaymentPluginApiException.class)
    public void testThrowException() throws PaymentPluginApiException {
        this.testingStates.add(TestingStates.Actions.ACTION_THROW_EXCEPTION, null);

        final PaymentTransactionInfoPlugin ret = this.paymentTestPugin.authorizePayment(
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                BigDecimal.TEN,
                Currency.EUR,
                null,
                this.pluginCallContext);
        Assert.assertNull(ret);
    }

    @Test
    public void testInfoPluginStatus() throws PaymentPluginApiException {
        this.testingStates.add(TestingStates.Actions.ACTION_RETURN_PLUGIN_STATUS_PENDING, "authorizePayment");
        this.testingStates.add(TestingStates.Actions.ACTION_RETURN_PLUGIN_STATUS_CANCELED, "capturePayment");
        this.testingStates.add(TestingStates.Actions.ACTION_RETURN_PLUGIN_STATUS_ERROR, "purchasePayment");

        PaymentTransactionInfoPlugin ret = this.paymentTestPugin.authorizePayment(
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                BigDecimal.TEN,
                Currency.EUR,
                null,
                this.pluginCallContext);
        Assert.assertEquals(ret.getStatus(), PaymentPluginStatus.PENDING);

        ret = this.paymentTestPugin.capturePayment(
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                BigDecimal.TEN,
                Currency.EUR,
                null,
                this.pluginCallContext);
        Assert.assertEquals(ret.getStatus(), PaymentPluginStatus.CANCELED);

        ret = this.paymentTestPugin.purchasePayment(
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                BigDecimal.TEN,
                Currency.EUR,
                null,
                this.pluginCallContext);
        Assert.assertEquals(ret.getStatus(), PaymentPluginStatus.ERROR);
    }
}