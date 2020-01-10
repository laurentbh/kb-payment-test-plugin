package org.killbill.plugin.paymenttest.core;

import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.payment.api.PaymentMethodPlugin;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.plugin.api.GatewayNotification;
import org.killbill.billing.payment.plugin.api.HostedPaymentPageFormDescriptor;
import org.killbill.billing.payment.plugin.api.PaymentMethodInfoPlugin;
import org.killbill.billing.payment.plugin.api.PaymentPluginApi;
import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.payment.plugin.api.PaymentTransactionInfoPlugin;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.billing.util.callcontext.TenantContext;
import org.killbill.billing.util.entity.Pagination;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class TestPaymentPluginAPI implements PaymentPluginApi {


    private final State state;

    public TestPaymentPluginAPI(final State state) {
        this.state = state;
    }

    public static Set<String> getAuthorizedMethods() {
        final Class cls = PaymentPluginApi.class;
        final Method[] methods = cls.getMethods();
        return Arrays.stream(methods).map(Method::getName).collect(Collectors.toSet());
    }


    private void getAction() {
        final String nameofCurrMethod = Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    @Override
    public PaymentTransactionInfoPlugin authorizePayment(final UUID uuid,
                                                         final UUID uuid1,
                                                         final UUID uuid2,
                                                         final UUID uuid3,
                                                         final BigDecimal bigDecimal,
                                                         final Currency currency,
                                                         final Iterable<PluginProperty> iterable,
                                                         final CallContext callContext) throws PaymentPluginApiException {
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
    public List<PaymentTransactionInfoPlugin> getPaymentInfo(final UUID kbAccountId,
                                                             final UUID kbPaymentId,
                                                             final Iterable<PluginProperty> properties,
                                                             final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public Pagination<PaymentTransactionInfoPlugin> searchPayments(final String searchKey,
                                                                   final Long offset,
                                                                   final Long limit,
                                                                   final Iterable<PluginProperty> properties,
                                                                   final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public void addPaymentMethod(final UUID kbAccountId,
                                 final UUID kbPaymentMethodId,
                                 final PaymentMethodPlugin paymentMethodProps,
                                 final boolean setDefault,
                                 final Iterable<PluginProperty> properties,
                                 final CallContext context) throws PaymentPluginApiException {

    }

    @Override
    public void deletePaymentMethod(final UUID kbAccountId,
                                    final UUID kbPaymentMethodId,
                                    final Iterable<PluginProperty> properties,
                                    final CallContext context) throws PaymentPluginApiException {

    }

    @Override
    public PaymentMethodPlugin getPaymentMethodDetail(final UUID kbAccountId,
                                                      final UUID kbPaymentMethodId,
                                                      final Iterable<PluginProperty> properties,
                                                      final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public void setDefaultPaymentMethod(final UUID kbAccountId,
                                        final UUID kbPaymentMethodId,
                                        final Iterable<PluginProperty> properties,
                                        final CallContext context) throws PaymentPluginApiException {

    }

    @Override
    public List<PaymentMethodInfoPlugin> getPaymentMethods(final UUID kbAccountId,
                                                           final boolean refreshFromGateway,
                                                           final Iterable<PluginProperty> properties,
                                                           final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public Pagination<PaymentMethodPlugin> searchPaymentMethods(final String searchKey,
                                                                final Long offset,
                                                                final Long limit,
                                                                final Iterable<PluginProperty> properties,
                                                                final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public void resetPaymentMethods(final UUID kbAccountId,
                                    final List<PaymentMethodInfoPlugin> paymentMethods,
                                    final Iterable<PluginProperty> properties,
                                    final CallContext context) throws PaymentPluginApiException {

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
