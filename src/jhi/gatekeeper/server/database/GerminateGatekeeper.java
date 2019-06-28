/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database;


import org.jooq.*;
import org.jooq.impl.*;

import java.util.*;

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
public class GerminateGatekeeper extends SchemaImpl {

    private static final long serialVersionUID = 1297546346;

    /**
     * The reference instance of <code>germinate_gatekeeper</code>
     */
    public static final GerminateGatekeeper GERMINATE_GATEKEEPER = new GerminateGatekeeper();

    /**
     * The table <code>germinate_gatekeeper.access_requests</code>.
     */
    public final AccessRequests ACCESS_REQUESTS = jhi.gatekeeper.server.database.tables.AccessRequests.ACCESS_REQUESTS;

    /**
     * The table <code>germinate_gatekeeper.database_systems</code>.
     */
    public final DatabaseSystems DATABASE_SYSTEMS = jhi.gatekeeper.server.database.tables.DatabaseSystems.DATABASE_SYSTEMS;

    /**
     * The table <code>germinate_gatekeeper.database_version</code>.
     */
    public final DatabaseVersion DATABASE_VERSION = jhi.gatekeeper.server.database.tables.DatabaseVersion.DATABASE_VERSION;

    /**
     * The table <code>germinate_gatekeeper.institutions</code>.
     */
    public final Institutions INSTITUTIONS = jhi.gatekeeper.server.database.tables.Institutions.INSTITUTIONS;

    /**
     * Log table of password reset requests.
     */
    public final PasswordResetLog PASSWORD_RESET_LOG = jhi.gatekeeper.server.database.tables.PasswordResetLog.PASSWORD_RESET_LOG;

    /**
     * The table <code>germinate_gatekeeper.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = jhi.gatekeeper.server.database.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>germinate_gatekeeper.unapproved_users</code>.
     */
    public final UnapprovedUsers UNAPPROVED_USERS = jhi.gatekeeper.server.database.tables.UnapprovedUsers.UNAPPROVED_USERS;

    /**
     * The table <code>germinate_gatekeeper.users</code>.
     */
    public final Users USERS = jhi.gatekeeper.server.database.tables.Users.USERS;

    /**
     * The table <code>germinate_gatekeeper.user_has_access_to_databases</code>.
     */
    public final UserHasAccessToDatabases USER_HAS_ACCESS_TO_DATABASES = jhi.gatekeeper.server.database.tables.UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES;

    /**
     * The table <code>germinate_gatekeeper.user_types</code>.
     */
    public final UserTypes USER_TYPES = jhi.gatekeeper.server.database.tables.UserTypes.USER_TYPES;

    /**
     * VIEW
     */
    public final ViewAccessRequestUserDetails VIEW_ACCESS_REQUEST_USER_DETAILS = jhi.gatekeeper.server.database.tables.ViewAccessRequestUserDetails.VIEW_ACCESS_REQUEST_USER_DETAILS;

    /**
     * VIEW
     */
    public final ViewCounts VIEW_COUNTS = jhi.gatekeeper.server.database.tables.ViewCounts.VIEW_COUNTS;

    /**
     * VIEW
     */
    public final ViewUnapprovedUserDetails VIEW_UNAPPROVED_USER_DETAILS = jhi.gatekeeper.server.database.tables.ViewUnapprovedUserDetails.VIEW_UNAPPROVED_USER_DETAILS;

    /**
     * VIEW
     */
    public final ViewUserDetails VIEW_USER_DETAILS = jhi.gatekeeper.server.database.tables.ViewUserDetails.VIEW_USER_DETAILS;

    /**
     * VIEW
     */
    public final ViewUserPermissions VIEW_USER_PERMISSIONS = jhi.gatekeeper.server.database.tables.ViewUserPermissions.VIEW_USER_PERMISSIONS;

    /**
     * No further instances allowed
     */
    private GerminateGatekeeper() {
        super("germinate_gatekeeper", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AccessRequests.ACCESS_REQUESTS,
            DatabaseSystems.DATABASE_SYSTEMS,
            DatabaseVersion.DATABASE_VERSION,
            Institutions.INSTITUTIONS,
            PasswordResetLog.PASSWORD_RESET_LOG,
            SchemaVersion.SCHEMA_VERSION,
            UnapprovedUsers.UNAPPROVED_USERS,
            Users.USERS,
            UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES,
            UserTypes.USER_TYPES,
            ViewAccessRequestUserDetails.VIEW_ACCESS_REQUEST_USER_DETAILS,
            ViewCounts.VIEW_COUNTS,
            ViewUnapprovedUserDetails.VIEW_UNAPPROVED_USER_DETAILS,
            ViewUserDetails.VIEW_USER_DETAILS,
            ViewUserPermissions.VIEW_USER_PERMISSIONS);
    }
}
