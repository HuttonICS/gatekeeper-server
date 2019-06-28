/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.gatekeeper.server.database.*;
import jhi.gatekeeper.server.database.tables.records.*;


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
public class ViewUserDetails extends TableImpl<ViewUserDetailsRecord> {

    private static final long serialVersionUID = 1948119313;

    /**
     * The reference instance of <code>germinate_gatekeeper.view_user_details</code>
     */
    public static final ViewUserDetails VIEW_USER_DETAILS = new ViewUserDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewUserDetailsRecord> getRecordType() {
        return ViewUserDetailsRecord.class;
    }

    /**
     * The column <code>germinate_gatekeeper.view_user_details.id</code>.
     */
    public final TableField<ViewUserDetailsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.username</code>.
     */
    public final TableField<ViewUserDetailsRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.full_name</code>.
     */
    public final TableField<ViewUserDetailsRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.email_address</code>.
     */
    public final TableField<ViewUserDetailsRecord, String> EMAIL_ADDRESS = createField("email_address", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.created_on</code>.
     */
    public final TableField<ViewUserDetailsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.gatekeeper_access</code>.
     */
    public final TableField<ViewUserDetailsRecord, Byte> GATEKEEPER_ACCESS = createField("gatekeeper_access", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.name</code>.
     */
    public final TableField<ViewUserDetailsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.acronym</code>.
     */
    public final TableField<ViewUserDetailsRecord, String> ACRONYM = createField("acronym", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_user_details.address</code>.
     */
    public final TableField<ViewUserDetailsRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>germinate_gatekeeper.view_user_details</code> table reference
     */
    public ViewUserDetails() {
        this(DSL.name("view_user_details"), null);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.view_user_details</code> table reference
     */
    public ViewUserDetails(String alias) {
        this(DSL.name(alias), VIEW_USER_DETAILS);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.view_user_details</code> table reference
     */
    public ViewUserDetails(Name alias) {
        this(alias, VIEW_USER_DETAILS);
    }

    private ViewUserDetails(Name alias, Table<ViewUserDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewUserDetails(Name alias, Table<ViewUserDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewUserDetails(Table<O> child, ForeignKey<O, ViewUserDetailsRecord> key) {
        super(child, key, VIEW_USER_DETAILS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateGatekeeper.GERMINATE_GATEKEEPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewUserDetails as(String alias) {
        return new ViewUserDetails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewUserDetails as(Name alias) {
        return new ViewUserDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewUserDetails rename(String name) {
        return new ViewUserDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewUserDetails rename(Name name) {
        return new ViewUserDetails(name, null);
    }
}
