/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.gatekeeper.server.database.GerminateGatekeeper;
import jhi.gatekeeper.server.database.tables.records.ViewAccessRequestUserDetailsRecord;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ViewAccessRequestUserDetails extends TableImpl<ViewAccessRequestUserDetailsRecord>
{

    /**
     * The reference instance of <code>germinate_gatekeeper.view_access_request_user_details</code>
     */
    public static final  ViewAccessRequestUserDetails                         VIEW_ACCESS_REQUEST_USER_DETAILS = new ViewAccessRequestUserDetails();
    private static final long                                                 serialVersionUID                 = 847985626;
    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.has_been_rejected</code>.
     */
    public final         TableField<ViewAccessRequestUserDetailsRecord, Byte> HAS_BEEN_REJECTED                = createField("has_been_rejected", SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.id</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, Integer> ID = createField("id", SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.username</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> USERNAME = createField("username", SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.full_name</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> FULL_NAME = createField("full_name", SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.email_address</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> EMAIL_ADDRESS = createField("email_address", SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.created_on</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, Timestamp> CREATED_ON = createField("created_on", SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.institution_id</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, Integer> INSTITUTION_ID = createField("institution_id", SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.name</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> NAME = createField("name", SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.acronym</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> ACRONYM = createField("acronym", SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.address</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> ADDRESS = createField("address", SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.database_system_name</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> DATABASE_SYSTEM_NAME = createField("database_system_name", SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.database_server_name</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> DATABASE_SERVER_NAME = createField("database_server_name", SQLDataType.VARCHAR(64), this, "");
    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.needs_approval</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, Byte>   NEEDS_APPROVAL       = createField("needs_approval", SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");
    /**
     * The column <code>germinate_gatekeeper.view_access_request_user_details.activation_key</code>.
     */
    public final TableField<ViewAccessRequestUserDetailsRecord, String> ACTIVATION_KEY       = createField("activation_key", SQLDataType.VARCHAR(36), this, "");

    /**
     * Create a <code>germinate_gatekeeper.view_access_request_user_details</code> table reference
     */
    public ViewAccessRequestUserDetails()
    {
        this(DSL.name("view_access_request_user_details"), null);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.view_access_request_user_details</code> table reference
     */
    public ViewAccessRequestUserDetails(String alias)
    {
        this(DSL.name(alias), VIEW_ACCESS_REQUEST_USER_DETAILS);
    }

    /**
     * Create an aliased <code>germinate_gatekeeper.view_access_request_user_details</code> table reference
     */
    public ViewAccessRequestUserDetails(Name alias)
    {
        this(alias, VIEW_ACCESS_REQUEST_USER_DETAILS);
    }

    private ViewAccessRequestUserDetails(Name alias, Table<ViewAccessRequestUserDetailsRecord> aliased)
    {
        this(alias, aliased, null);
    }

    private ViewAccessRequestUserDetails(Name alias, Table<ViewAccessRequestUserDetailsRecord> aliased, Field<?>[] parameters)
    {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewAccessRequestUserDetails(Table<O> child, ForeignKey<O, ViewAccessRequestUserDetailsRecord> key)
    {
        super(child, key, VIEW_ACCESS_REQUEST_USER_DETAILS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewAccessRequestUserDetailsRecord> getRecordType()
    {
        return ViewAccessRequestUserDetailsRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema()
    {
        return GerminateGatekeeper.GERMINATE_GATEKEEPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewAccessRequestUserDetails as(String alias)
    {
        return new ViewAccessRequestUserDetails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewAccessRequestUserDetails as(Name alias)
    {
        return new ViewAccessRequestUserDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewAccessRequestUserDetails rename(String name)
    {
        return new ViewAccessRequestUserDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewAccessRequestUserDetails rename(Name name)
    {
        return new ViewAccessRequestUserDetails(name, null);
    }
}