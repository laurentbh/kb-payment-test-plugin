/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.payment.dao.gen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentResponses;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TestpaymentResponsesRecord extends UpdatableRecordImpl<TestpaymentResponsesRecord> implements Record10<ULong, String, String, String, String, BigDecimal, String, String, Timestamp, String> {

    private static final long serialVersionUID = 1538709;

    /**
     * Setter for <code>killbill.testpayment_responses.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.kb_payment_id</code>.
     */
    public void setKbPaymentId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.kb_payment_id</code>.
     */
    public String getKbPaymentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.kb_payment_transaction_id</code>.
     */
    public void setKbPaymentTransactionId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.kb_payment_transaction_id</code>.
     */
    public String getKbPaymentTransactionId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.transaction_type</code>.
     */
    public void setTransactionType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.transaction_type</code>.
     */
    public String getTransactionType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.currency</code>.
     */
    public void setCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.currency</code>.
     */
    public String getCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.additional_data</code>.
     */
    public void setAdditionalData(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.additional_data</code>.
     */
    public String getAdditionalData() {
        return (String) get(7);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>killbill.testpayment_responses.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>killbill.testpayment_responses.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, String, String, String, String, BigDecimal, String, String, Timestamp, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, String, String, String, String, BigDecimal, String, String, Timestamp, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.KB_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.KB_PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.KB_PAYMENT_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.TRANSACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.ADDITIONAL_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TestpaymentResponses.TESTPAYMENT_RESPONSES.KB_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKbAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKbPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKbPaymentTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTransactionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAdditionalData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value3(String value) {
        setKbPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value4(String value) {
        setKbPaymentTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value5(String value) {
        setTransactionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value7(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value8(String value) {
        setAdditionalData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value9(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord value10(String value) {
        setKbTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponsesRecord values(ULong value1,
                                             String value2,
                                             String value3,
                                             String value4,
                                             String value5,
                                             BigDecimal value6,
                                             String value7,
                                             String value8,
                                             Timestamp value9,
                                             String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestpaymentResponsesRecord
     */
    public TestpaymentResponsesRecord() {
        super(TestpaymentResponses.TESTPAYMENT_RESPONSES);
    }

    /**
     * Create a detached, initialised TestpaymentResponsesRecord
     */
    public TestpaymentResponsesRecord(ULong recordId,
                                      String kbAccountId,
                                      String kbPaymentId,
                                      String kbPaymentTransactionId,
                                      String transactionType,
                                      BigDecimal amount,
                                      String currency,
                                      String additionalData,
                                      Timestamp createdDate,
                                      String kbTenantId) {
        super(TestpaymentResponses.TESTPAYMENT_RESPONSES);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbPaymentId);
        set(3, kbPaymentTransactionId);
        set(4, transactionType);
        set(5, amount);
        set(6, currency);
        set(7, additionalData);
        set(8, createdDate);
        set(9, kbTenantId);
    }
}
