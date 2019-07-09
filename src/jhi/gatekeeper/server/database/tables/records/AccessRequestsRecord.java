/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.gatekeeper.server.database.tables.*;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccessRequestsRecord extends UpdatableRecordImpl<AccessRequestsRecord> implements Record7<Integer, Integer, Integer, Byte, Byte, String, Timestamp> {

    private static final long serialVersionUID = -1161223311;

    /**
     * Create a detached AccessRequestsRecord
     */
    public AccessRequestsRecord() {
        super(AccessRequests.ACCESS_REQUESTS);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised AccessRequestsRecord
     */
    public AccessRequestsRecord(Integer id, Integer userId, Integer databaseSystemId, Byte hasBeenRejected, Byte needsApproval, String activationKey, Timestamp createdOn) {
        super(AccessRequests.ACCESS_REQUESTS);

        set(0, id);
        set(1, userId);
        set(2, databaseSystemId);
        set(3, hasBeenRejected);
        set(4, needsApproval);
        set(5, activationKey);
        set(6, createdOn);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.database_system_id</code>.
     */
    public void setDatabaseSystemId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.database_system_id</code>.
     */
    public Integer getDatabaseSystemId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.has_been_rejected</code>.
     */
    public Byte getHasBeenRejected() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.needs_approval</code>.
     */
    public Byte getNeedsApproval() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.has_been_rejected</code>.
     */
    public void setHasBeenRejected(Byte value) {
        set(3, value);
    }

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.needs_approval</code>.
     */
    public void setNeedsApproval(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.activation_key</code>.
     */
    public String getActivationKey() {
        return (String) get(5);
    }

    /**
     * Getter for <code>germinate_gatekeeper.access_requests.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Byte, Byte, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Byte, Byte, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AccessRequests.ACCESS_REQUESTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AccessRequests.ACCESS_REQUESTS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AccessRequests.ACCESS_REQUESTS.DATABASE_SYSTEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return AccessRequests.ACCESS_REQUESTS.HAS_BEEN_REJECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return AccessRequests.ACCESS_REQUESTS.NEEDS_APPROVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AccessRequests.ACCESS_REQUESTS.ACTIVATION_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return AccessRequests.ACCESS_REQUESTS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDatabaseSystemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getHasBeenRejected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getNeedsApproval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getActivationKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDatabaseSystemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getHasBeenRejected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getNeedsApproval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getActivationKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value3(Integer value) {
        setDatabaseSystemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value4(Byte value) {
        setHasBeenRejected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value5(Byte value) {
        setNeedsApproval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value6(String value) {
        setActivationKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequestsRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Byte value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.activation_key</code>.
     */
    public void setActivationKey(String value) {
        set(5, value);
    }

    /**
     * Setter for <code>germinate_gatekeeper.access_requests.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }
}
