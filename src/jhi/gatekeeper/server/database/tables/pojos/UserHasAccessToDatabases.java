/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.*;

import javax.annotation.*;


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
public class UserHasAccessToDatabases implements Serializable {

    private static final long serialVersionUID = 200292881;

    private Integer userId;
    private Integer databaseId;
    private Integer userTypeId;

    public UserHasAccessToDatabases() {}

    public UserHasAccessToDatabases(UserHasAccessToDatabases value) {
        this.userId = value.userId;
        this.databaseId = value.databaseId;
        this.userTypeId = value.userTypeId;
    }

    public UserHasAccessToDatabases(
        Integer userId,
        Integer databaseId,
        Integer userTypeId
    ) {
        this.userId = userId;
        this.databaseId = databaseId;
        this.userTypeId = userTypeId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDatabaseId() {
        return this.databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserHasAccessToDatabases (");

        sb.append(userId);
        sb.append(", ").append(databaseId);
        sb.append(", ").append(userTypeId);

        sb.append(")");
        return sb.toString();
    }
}
