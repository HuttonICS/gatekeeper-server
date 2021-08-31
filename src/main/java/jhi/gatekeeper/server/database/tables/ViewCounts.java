/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import javax.annotation.Generated;

import jhi.gatekeeper.server.database.GatekeeperDb;
import jhi.gatekeeper.server.database.tables.records.ViewCountsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCounts extends TableImpl<ViewCountsRecord> {

    private static final long serialVersionUID = 1208920230;

    /**
     * The reference instance of <code>gatekeeper_db.view_counts</code>
     */
    public static final ViewCounts VIEW_COUNTS = new ViewCounts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewCountsRecord> getRecordType() {
        return ViewCountsRecord.class;
    }

    /**
     * The column <code>gatekeeper_db.view_counts.users</code>.
     */
    public final TableField<ViewCountsRecord, Long> USERS = createField("users", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>gatekeeper_db.view_counts.requests</code>.
     */
    public final TableField<ViewCountsRecord, Long> REQUESTS = createField("requests", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>gatekeeper_db.view_counts.databases</code>.
     */
    public final TableField<ViewCountsRecord, Long> DATABASES = createField("databases", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>gatekeeper_db.view_counts</code> table reference
     */
    public ViewCounts() {
        this(DSL.name("view_counts"), null);
    }

    /**
     * Create an aliased <code>gatekeeper_db.view_counts</code> table reference
     */
    public ViewCounts(String alias) {
        this(DSL.name(alias), VIEW_COUNTS);
    }

    /**
     * Create an aliased <code>gatekeeper_db.view_counts</code> table reference
     */
    public ViewCounts(Name alias) {
        this(alias, VIEW_COUNTS);
    }

    private ViewCounts(Name alias, Table<ViewCountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewCounts(Name alias, Table<ViewCountsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewCounts(Table<O> child, ForeignKey<O, ViewCountsRecord> key) {
        super(child, key, VIEW_COUNTS);
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
    public ViewCounts as(String alias) {
        return new ViewCounts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewCounts as(Name alias) {
        return new ViewCounts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCounts rename(String name) {
        return new ViewCounts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCounts rename(Name name) {
        return new ViewCounts(name, null);
    }
}
