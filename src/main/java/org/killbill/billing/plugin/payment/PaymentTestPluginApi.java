package org.killbill.billing.plugin.payment;

import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.osgi.libs.killbill.OSGIConfigPropertiesService;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillLogService;
import org.killbill.billing.payment.api.PaymentMethodPlugin;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.plugin.api.GatewayNotification;
import org.killbill.billing.payment.plugin.api.HostedPaymentPageFormDescriptor;
import org.killbill.billing.payment.plugin.api.PaymentMethodInfoPlugin;
import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.payment.plugin.api.PaymentTransactionInfoPlugin;
import org.killbill.billing.plugin.api.payment.PluginPaymentPluginApi;
import org.killbill.billing.plugin.payment.dao.PaymentTestDao;
import org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentPaymentMethods;
import org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentResponses;
import org.killbill.billing.plugin.payment.dao.gen.tables.records.TestpaymentPaymentMethodsRecord;
import org.killbill.billing.plugin.payment.dao.gen.tables.records.TestpaymentResponsesRecord;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.clock.Clock;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.UUID;

public class PaymentTestPluginApi extends PluginPaymentPluginApi<TestpaymentResponsesRecord, TestpaymentResponses, TestpaymentPaymentMethodsRecord, TestpaymentPaymentMethods> {

    private final PaymentTestDao dao;
    private final TestingStates  testingStates;

    public PaymentTestPluginApi(final OSGIKillbillAPI killbillAPI,
                                final OSGIConfigPropertiesService configProperties,
                                final OSGIKillbillLogService logService,
                                final Clock clock,
                                final PaymentTestDao dao,
                                final TestingStates testingStates) {
        super(killbillAPI, configProperties, logService, clock, dao);
        this.dao = dao;
        this.testingStates = testingStates;
    }

    @Override
    public void addPaymentMethod(final UUID kbAccountId,
                                 final UUID kbPaymentMethodId,
                                 final PaymentMethodPlugin paymentMethodProps,
                                 final boolean setDefault,
                                 final Iterable<PluginProperty> properties,
                                 final CallContext context) throws PaymentPluginApiException {
        try {
            this.dao.addPaymentMethod(kbAccountId,
                                      kbPaymentMethodId,
                                      null,
                                      this.clock.getUTCNow(),
                                      context.getTenantId());
        }
        catch (final SQLException e) {
            throw new PaymentPluginApiException("Unable to add payment method", e);
        }
    }

    @Override
    public void deletePaymentMethod(final UUID kbAccountId,
                                    final UUID kbPaymentMethodId,
                                    final Iterable<PluginProperty> properties,
                                    final CallContext context) throws PaymentPluginApiException {
        final DateTime utcNow = this.clock.getUTCNow();
        try {
            this.dao.deletePaymentMethod(kbPaymentMethodId, utcNow, context.getTenantId());
        }
        catch (final SQLException e) {
            throw new PaymentPluginApiException("Unable to delete payment method for kbPaymentMethodId " + kbPaymentMethodId,
                                                e);
        }
    }

    @Override
    protected PaymentTransactionInfoPlugin buildPaymentTransactionInfoPlugin(final TestpaymentResponsesRecord testpaymentResponsesRecord) {
        return null;
    }

    @Override
    protected PaymentMethodPlugin buildPaymentMethodPlugin(final TestpaymentPaymentMethodsRecord testpaymentPaymentMethodsRecord) {
        return null;
    }

    @Override
    protected PaymentMethodInfoPlugin buildPaymentMethodInfoPlugin(final TestpaymentPaymentMethodsRecord testpaymentPaymentMethodsRecord) {
        return null;
    }

    @Override
    protected String getPaymentMethodId(final TestpaymentPaymentMethodsRecord testpaymentPaymentMethodsRecord) {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin authorizePayment(final UUID kbAccountId,
                                                         final UUID kbPaymentId,
                                                         final UUID kbTransactionId,
                                                         final UUID kbPaymentMethodId,
                                                         final BigDecimal amount,
                                                         final Currency currency,
                                                         final Iterable<PluginProperty> properties,
                                                         final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin capturePayment(final UUID kbAccountId,
                                                       final UUID kbPaymentId,
                                                       final UUID kbTransactionId,
                                                       final UUID kbPaymentMethodId,
                                                       final BigDecimal amount,
                                                       final Currency currency,
                                                       final Iterable<PluginProperty> properties,
                                                       final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin purchasePayment(final UUID kbAccountId,
                                                        final UUID kbPaymentId,
                                                        final UUID kbTransactionId,
                                                        final UUID kbPaymentMethodId,
                                                        final BigDecimal amount,
                                                        final Currency currency,
                                                        final Iterable<PluginProperty> properties,
                                                        final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin voidPayment(final UUID kbAccountId,
                                                    final UUID kbPaymentId,
                                                    final UUID kbTransactionId,
                                                    final UUID kbPaymentMethodId,
                                                    final Iterable<PluginProperty> properties,
                                                    final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin creditPayment(final UUID kbAccountId,
                                                      final UUID kbPaymentId,
                                                      final UUID kbTransactionId,
                                                      final UUID kbPaymentMethodId,
                                                      final BigDecimal amount,
                                                      final Currency currency,
                                                      final Iterable<PluginProperty> properties,
                                                      final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin refundPayment(final UUID kbAccountId,
                                                      final UUID kbPaymentId,
                                                      final UUID kbTransactionId,
                                                      final UUID kbPaymentMethodId,
                                                      final BigDecimal amount,
                                                      final Currency currency,
                                                      final Iterable<PluginProperty> properties,
                                                      final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public HostedPaymentPageFormDescriptor buildFormDescriptor(final UUID kbAccountId,
                                                               final Iterable<PluginProperty> customFields,
                                                               final Iterable<PluginProperty> properties,
                                                               final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public GatewayNotification processNotification(final String notification,
                                                   final Iterable<PluginProperty> properties,
                                                   final CallContext context) throws PaymentPluginApiException {
        return null;
    }
}
