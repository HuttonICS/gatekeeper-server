/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.gatekeeper.server.database.GatekeeperDb;
import jhi.gatekeeper.server.database.Indexes;
import jhi.gatekeeper.server.database.Keys;
import jhi.gatekeeper.server.database.tables.records.AccessRequestsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class AccessRequests extends TableImpl<AccessRequestsRecord> {

    private static final long serialVersionUID = 1200848649;

    /**
     * The reference instance of <code>gatekeeper_db.access_requests</code>
     */
    public static final AccessRequests ACCESS_REQUESTS = new AccessRequests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccessRequestsRecord> getRecordType() {
        return AccessRequestsRecord.class;
    }

    /**
     * The column <code>gatekeeper_db.access_requests.id</code>.
     */
    public final TableField<AccessRequestsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gatekeeper_db.access_requests.user_id</code>.
     */
    public final TableField<AccessRequestsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gatekeeper_db.access_requests.database_system_id</code>.
     */
    public final TableField<AccessRequestsRecord, Integer> DATABASE_SYSTEM_ID = createField("database_system_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gatekeeper_db.access_requests.has_been_rejected</code>.
     */
    public final TableField<AccessRequestsRecord, Byte> HAS_BEEN_REJECTED = createField("has_been_rejected", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gatekeeper_db.access_requests.needs_approval</code>.
     */
    public final TableField<AccessRequestsRecord, Byte> NEEDS_APPROVAL = createField("needs_approval", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gatekeeper_db.access_requests.activation_key</code>.
     */
    public final TableField<AccessRequestsRecord, String> ACTIVATION_KEY = createField("activation_key", org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>gatekeeper_db.access_requests.created_on</code>.
     */
    public final TableField<AccessRequestsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>gatekeeper_db.access_requests</code> table reference
     */
    public AccessRequests() {
        this(DSL.name("access_requests"), null);
    }

    /**
     * Create an aliased <code>gatekeeper_db.access_requests</code> table reference
     */
    public AccessRequests(String alias) {
        this(DSL.name(alias), ACCESS_REQUESTS);
    }

    /**
     * Create an aliased <code>gatekeeper_db.access_requests</code> table reference
     */
    public AccessRequests(Name alias) {
        this(alias, ACCESS_REQUESTS);
    }

    private AccessRequests(Name alias, Table<AccessRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccessRequests(Name alias, Table<AccessRequestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AccessRequests(Table<O> child, ForeignKey<O, AccessRequestsRecord> key) {
        super(child, key, ACCESS_REQUESTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GatekeeperDb.GATEKEEPER_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK1, Indexes.ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK2, Indexes.ACCESS_REQUESTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AccessRequestsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCESS_REQUESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccessRequestsRecord> getPrimaryKey() {
        return Keys.KEY_ACCESS_REQUESTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccessRequestsRecord>> getKeys() {
        return Arrays.<UniqueKey<AccessRequestsRecord>>asList(Keys.KEY_ACCESS_REQUESTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccessRequestsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccessRequestsRecord, ?>>asList(Keys.ACCESS_REQUESTS_IBFK_1, Keys.ACCESS_REQUESTS_IBFK_2);
    }

    public Users users() {
        return new Users(this, Keys.ACCESS_REQUESTS_IBFK_1);
    }

    public DatabaseSystems databaseSystems() {
        return new DatabaseSystems(this, Keys.ACCESS_REQUESTS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequests as(String alias) {
        return new AccessRequests(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessRequests as(Name alias) {
        return new AccessRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccessRequests rename(String name) {
        return new AccessRequests(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccessRequests rename(Name name) {
        return new AccessRequests(name, null);
    }
}
