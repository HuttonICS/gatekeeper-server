/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database;


import javax.annotation.*;

import jhi.gatekeeper.server.database.tables.*;


/**
 * Convenience access to all tables in germinate_gatekeeper
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>germinate_gatekeeper.access_requests</code>.
     */
    public static final AccessRequests ACCESS_REQUESTS = jhi.gatekeeper.server.database.tables.AccessRequests.ACCESS_REQUESTS;

    /**
     * The table <code>germinate_gatekeeper.database_systems</code>.
     */
    public static final DatabaseSystems DATABASE_SYSTEMS = jhi.gatekeeper.server.database.tables.DatabaseSystems.DATABASE_SYSTEMS;

    /**
     * The table <code>germinate_gatekeeper.database_version</code>.
     */
    public static final DatabaseVersion DATABASE_VERSION = jhi.gatekeeper.server.database.tables.DatabaseVersion.DATABASE_VERSION;

    /**
     * The table <code>germinate_gatekeeper.institutions</code>.
     */
    public static final Institutions INSTITUTIONS = jhi.gatekeeper.server.database.tables.Institutions.INSTITUTIONS;

    /**
     * Log table of password reset requests.
     */
    public static final PasswordResetLog PASSWORD_RESET_LOG = jhi.gatekeeper.server.database.tables.PasswordResetLog.PASSWORD_RESET_LOG;

    /**
     * The table <code>germinate_gatekeeper.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = jhi.gatekeeper.server.database.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>germinate_gatekeeper.unapproved_users</code>.
     */
    public static final UnapprovedUsers UNAPPROVED_USERS = jhi.gatekeeper.server.database.tables.UnapprovedUsers.UNAPPROVED_USERS;

    /**
     * The table <code>germinate_gatekeeper.users</code>.
     */
    public static final Users USERS = jhi.gatekeeper.server.database.tables.Users.USERS;

    /**
     * The table <code>germinate_gatekeeper.user_has_access_to_databases</code>.
     */
    public static final UserHasAccessToDatabases USER_HAS_ACCESS_TO_DATABASES = jhi.gatekeeper.server.database.tables.UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES;

    /**
     * The table <code>germinate_gatekeeper.user_types</code>.
     */
    public static final UserTypes USER_TYPES = jhi.gatekeeper.server.database.tables.UserTypes.USER_TYPES;

    /**
     * VIEW
     */
    public static final ViewCounts VIEW_COUNTS = jhi.gatekeeper.server.database.tables.ViewCounts.VIEW_COUNTS;

    /**
     * VIEW
     */
    public static final ViewUserDetails VIEW_USER_DETAILS = jhi.gatekeeper.server.database.tables.ViewUserDetails.VIEW_USER_DETAILS;

    /**
     * VIEW
     */
    public static final ViewUserPermissions VIEW_USER_PERMISSIONS = jhi.gatekeeper.server.database.tables.ViewUserPermissions.VIEW_USER_PERMISSIONS;
}
