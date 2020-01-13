package org.killbill.plugin.paymenttest.dao;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.killbill.billing.plugin.dao.payment.PluginPaymentDao;
import org.killbill.plugin.paymenttest.dao.gen.tables.TestpaymentPaymentMethods;
import org.killbill.plugin.paymenttest.dao.gen.tables.TestpaymentResponses;
import org.killbill.plugin.paymenttest.dao.gen.tables.records.TestpaymentPaymentMethodsRecord;
import org.killbill.plugin.paymenttest.dao.gen.tables.records.TestpaymentResponsesRecord;

import java.sql.SQLException;

import javax.sql.DataSource;

import static org.killbill.plugin.paymenttest.dao.gen.tables.TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS;
import static org.killbill.plugin.paymenttest.dao.gen.tables.TestpaymentResponses.TESTPAYMENT_RESPONSES;

public class PaymentTestDao extends PluginPaymentDao<TestpaymentResponsesRecord, TestpaymentResponses, TestpaymentPaymentMethodsRecord, TestpaymentPaymentMethods> {

    public PaymentTestDao(final DataSource dataSource) throws SQLException {
        super(TESTPAYMENT_RESPONSES, TESTPAYMENT_PAYMENT_METHODS, dataSource);
        // Save space in the database
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

    }
}
