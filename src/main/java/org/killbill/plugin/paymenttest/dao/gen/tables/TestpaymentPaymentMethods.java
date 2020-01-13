/*
 * This file is generated by jOOQ.
*/
package org.killbill.plugin.paymenttest.dao.gen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.killbill.plugin.paymenttest.dao.gen.Keys;
import org.killbill.plugin.paymenttest.dao.gen.Killbill;
import org.killbill.plugin.paymenttest.dao.gen.tables.records.TestpaymentPaymentMethodsRecord;


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
public class TestpaymentPaymentMethods extends TableImpl<TestpaymentPaymentMethodsRecord> {

    private static final long serialVersionUID = 426372146;

    /**
     * The reference instance of <code>killbill.testpayment_payment_methods</code>
     */
    public static final TestpaymentPaymentMethods TESTPAYMENT_PAYMENT_METHODS = new TestpaymentPaymentMethods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestpaymentPaymentMethodsRecord> getRecordType() {
        return TestpaymentPaymentMethodsRecord.class;
    }

    /**
     * The column <code>killbill.testpayment_payment_methods.record_id</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, ULong> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.kb_account_id</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.kb_payment_method_id</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, String> KB_PAYMENT_METHOD_ID = createField("kb_payment_method_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.is_deleted</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, Short> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.additional_data</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, String> ADDITIONAL_DATA = createField("additional_data", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.created_date</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.updated_date</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, Timestamp> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_payment_methods.kb_tenant_id</code>.
     */
    public final TableField<TestpaymentPaymentMethodsRecord, String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * Create a <code>killbill.testpayment_payment_methods</code> table reference
     */
    public TestpaymentPaymentMethods() {
        this("testpayment_payment_methods", null);
    }

    /**
     * Create an aliased <code>killbill.testpayment_payment_methods</code> table reference
     */
    public TestpaymentPaymentMethods(String alias) {
        this(alias, TESTPAYMENT_PAYMENT_METHODS);
    }

    private TestpaymentPaymentMethods(String alias, Table<TestpaymentPaymentMethodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestpaymentPaymentMethods(String alias, Table<TestpaymentPaymentMethodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Killbill.KILLBILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestpaymentPaymentMethodsRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TESTPAYMENT_PAYMENT_METHODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestpaymentPaymentMethodsRecord> getPrimaryKey() {
        return Keys.KEY_TESTPAYMENT_PAYMENT_METHODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestpaymentPaymentMethodsRecord>> getKeys() {
        return Arrays.<UniqueKey<TestpaymentPaymentMethodsRecord>>asList(Keys.KEY_TESTPAYMENT_PAYMENT_METHODS_PRIMARY, Keys.KEY_TESTPAYMENT_PAYMENT_METHODS_RECORD_ID, Keys.KEY_TESTPAYMENT_PAYMENT_METHODS_TESTPAYMENT_PAYMENT_METHODS_KB_PAYMENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentPaymentMethods as(String alias) {
        return new TestpaymentPaymentMethods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestpaymentPaymentMethods rename(String name) {
        return new TestpaymentPaymentMethods(name, null);
    }
}
