/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database;


import javax.annotation.Generated;

import jhi.gatekeeper.server.database.tables.AccessRequests;
import jhi.gatekeeper.server.database.tables.DatabaseSystems;
import jhi.gatekeeper.server.database.tables.Institutions;
import jhi.gatekeeper.server.database.tables.PasswordResetLog;
import jhi.gatekeeper.server.database.tables.SchemaVersion;
import jhi.gatekeeper.server.database.tables.UnapprovedUsers;
import jhi.gatekeeper.server.database.tables.UserHasAccessToDatabases;
import jhi.gatekeeper.server.database.tables.UserTypes;
import jhi.gatekeeper.server.database.tables.Users;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>gatekeeper_db</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK1 = Indexes0.ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK1;
    public static final Index ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK2 = Indexes0.ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK2;
    public static final Index ACCESS_REQUESTS_PRIMARY = Indexes0.ACCESS_REQUESTS_PRIMARY;
    public static final Index DATABASE_SYSTEMS_PRIMARY = Indexes0.DATABASE_SYSTEMS_PRIMARY;
    public static final Index INSTITUTIONS_PRIMARY = Indexes0.INSTITUTIONS_PRIMARY;
    public static final Index PASSWORD_RESET_LOG_PRIMARY = Indexes0.PASSWORD_RESET_LOG_PRIMARY;
    public static final Index PASSWORD_RESET_LOG_USER_ID_USERS_USER_ID_IDX = Indexes0.PASSWORD_RESET_LOG_USER_ID_USERS_USER_ID_IDX;
    public static final Index SCHEMA_VERSION_PRIMARY = Indexes0.SCHEMA_VERSION_PRIMARY;
    public static final Index SCHEMA_VERSION_SCHEMA_VERSION_S_IDX = Indexes0.SCHEMA_VERSION_SCHEMA_VERSION_S_IDX;
    public static final Index UNAPPROVED_USERS_PRIMARY = Indexes0.UNAPPROVED_USERS_PRIMARY;
    public static final Index UNAPPROVED_USERS_UNAPPROVED_USERS_IBFK_1 = Indexes0.UNAPPROVED_USERS_UNAPPROVED_USERS_IBFK_1;
    public static final Index UNAPPROVED_USERS_UNAPPROVED_USERS_IBFK_2 = Indexes0.UNAPPROVED_USERS_UNAPPROVED_USERS_IBFK_2;
    public static final Index USERS_FK_USERS_INSTITUTIONS1_IDX = Indexes0.USERS_FK_USERS_INSTITUTIONS1_IDX;
    public static final Index USERS_PRIMARY = Indexes0.USERS_PRIMARY;
    public static final Index USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_ACCESS_TO_DATABASES_USER_TYPES1_IDX = Indexes0.USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_ACCESS_TO_DATABASES_USER_TYPES1_IDX;
    public static final Index USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_DATABASES_DATABASES1_IDX = Indexes0.USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_DATABASES_DATABASES1_IDX;
    public static final Index USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_DATABASES_USERS1_IDX = Indexes0.USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_DATABASES_USERS1_IDX;
    public static final Index USER_HAS_ACCESS_TO_DATABASES_PRIMARY = Indexes0.USER_HAS_ACCESS_TO_DATABASES_PRIMARY;
    public static final Index USER_TYPES_PRIMARY = Indexes0.USER_TYPES_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK1 = Internal.createIndex("access_requests_ibfk1", AccessRequests.ACCESS_REQUESTS, new OrderField[] { AccessRequests.ACCESS_REQUESTS.USER_ID }, false);
        public static Index ACCESS_REQUESTS_ACCESS_REQUESTS_IBFK2 = Internal.createIndex("access_requests_ibfk2", AccessRequests.ACCESS_REQUESTS, new OrderField[] { AccessRequests.ACCESS_REQUESTS.DATABASE_SYSTEM_ID }, false);
        public static Index ACCESS_REQUESTS_PRIMARY = Internal.createIndex("PRIMARY", AccessRequests.ACCESS_REQUESTS, new OrderField[] { AccessRequests.ACCESS_REQUESTS.ID }, true);
        public static Index DATABASE_SYSTEMS_PRIMARY = Internal.createIndex("PRIMARY", DatabaseSystems.DATABASE_SYSTEMS, new OrderField[] { DatabaseSystems.DATABASE_SYSTEMS.ID }, true);
        public static Index INSTITUTIONS_PRIMARY = Internal.createIndex("PRIMARY", Institutions.INSTITUTIONS, new OrderField[] { Institutions.INSTITUTIONS.ID }, true);
        public static Index PASSWORD_RESET_LOG_PRIMARY = Internal.createIndex("PRIMARY", PasswordResetLog.PASSWORD_RESET_LOG, new OrderField[] { PasswordResetLog.PASSWORD_RESET_LOG.USER_ID, PasswordResetLog.PASSWORD_RESET_LOG.TIMESTAMP }, true);
        public static Index PASSWORD_RESET_LOG_USER_ID_USERS_USER_ID_IDX = Internal.createIndex("user_id_users_user_id_idx", PasswordResetLog.PASSWORD_RESET_LOG, new OrderField[] { PasswordResetLog.PASSWORD_RESET_LOG.USER_ID }, false);
        public static Index SCHEMA_VERSION_PRIMARY = Internal.createIndex("PRIMARY", SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK }, true);
        public static Index SCHEMA_VERSION_SCHEMA_VERSION_S_IDX = Internal.createIndex("schema_version_s_idx", SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.SUCCESS }, false);
        public static Index UNAPPROVED_USERS_PRIMARY = Internal.createIndex("PRIMARY", UnapprovedUsers.UNAPPROVED_USERS, new OrderField[] { UnapprovedUsers.UNAPPROVED_USERS.ID }, true);
        public static Index UNAPPROVED_USERS_UNAPPROVED_USERS_IBFK_1 = Internal.createIndex("unapproved_users_ibfk_1", UnapprovedUsers.UNAPPROVED_USERS, new OrderField[] { UnapprovedUsers.UNAPPROVED_USERS.INSTITUTION_ID }, false);
        public static Index UNAPPROVED_USERS_UNAPPROVED_USERS_IBFK_2 = Internal.createIndex("unapproved_users_ibfk_2", UnapprovedUsers.UNAPPROVED_USERS, new OrderField[] { UnapprovedUsers.UNAPPROVED_USERS.DATABASE_SYSTEM_ID }, false);
        public static Index USERS_FK_USERS_INSTITUTIONS1_IDX = Internal.createIndex("fk_users_institutions1_idx", Users.USERS, new OrderField[] { Users.USERS.INSTITUTION_ID }, false);
        public static Index USERS_PRIMARY = Internal.createIndex("PRIMARY", Users.USERS, new OrderField[] { Users.USERS.ID }, true);
        public static Index USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_ACCESS_TO_DATABASES_USER_TYPES1_IDX = Internal.createIndex("fk_users_has_access_to_databases_user_types1_idx", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, new OrderField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_TYPE_ID }, false);
        public static Index USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_DATABASES_DATABASES1_IDX = Internal.createIndex("fk_users_has_databases_databases1_idx", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, new OrderField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID }, false);
        public static Index USER_HAS_ACCESS_TO_DATABASES_FK_USERS_HAS_DATABASES_USERS1_IDX = Internal.createIndex("fk_users_has_databases_users1_idx", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, new OrderField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID }, false);
        public static Index USER_HAS_ACCESS_TO_DATABASES_PRIMARY = Internal.createIndex("PRIMARY", UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES, new OrderField[] { UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.USER_ID, UserHasAccessToDatabases.USER_HAS_ACCESS_TO_DATABASES.DATABASE_ID }, true);
        public static Index USER_TYPES_PRIMARY = Internal.createIndex("PRIMARY", UserTypes.USER_TYPES, new OrderField[] { UserTypes.USER_TYPES.ID }, true);
    }
}
