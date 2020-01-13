/*
 * This file is generated by jOOQ.
*/
package org.killbill.plugin.paymenttest.dao.gen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.plugin.paymenttest.dao.gen.tables.TestpaymentHppRequests;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestpaymentHppRequestsRecord extends UpdatableRecordImpl<TestpaymentHppRequestsRecord> implements Record8<ULong, String, String, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = -265045231;

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.kb_payment_id</code>.
     */
    public void setKbPaymentId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.kb_payment_id</code>.
     */
    public String getKbPaymentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.kb_payment_transaction_id</code>.
     */
    public void setKbPaymentTransactionId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.kb_payment_transaction_id</code>.
     */
    public String getKbPaymentTransactionId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.session_id</code>.
     */
    public void setSessionId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.session_id</code>.
     */
    public String getSessionId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.additional_data</code>.
     */
    public void setAdditionalData(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.additional_data</code>.
     */
    public String getAdditionalData() {
        return (String) get(5);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>killbill.testpayment_hpp_requests.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>killbill.testpayment_hpp_requests.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, String, String, String, String, Timestamp, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, String, String, String, String, Timestamp, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.KB_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.KB_PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.KB_PAYMENT_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.ADDITIONAL_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.KB_TENANT_ID;
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
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAdditionalData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value3(String value) {
        setKbPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value4(String value) {
        setKbPaymentTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value5(String value) {
        setSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value6(String value) {
        setAdditionalData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value7(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord value8(String value) {
        setKbTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequestsRecord values(ULong value1, String value2, String value3, String value4, String value5, String value6, Timestamp value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestpaymentHppRequestsRecord
     */
    public TestpaymentHppRequestsRecord() {
        super(TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS);
    }

    /**
     * Create a detached, initialised TestpaymentHppRequestsRecord
     */
    public TestpaymentHppRequestsRecord(ULong recordId, String kbAccountId, String kbPaymentId, String kbPaymentTransactionId, String sessionId, String additionalData, Timestamp createdDate, String kbTenantId) {
        super(TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbPaymentId);
        set(3, kbPaymentTransactionId);
        set(4, sessionId);
        set(5, additionalData);
        set(6, createdDate);
        set(7, kbTenantId);
    }
}
