/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class ViewUserPermissions implements Serializable {

    private static final long serialVersionUID = 709074092;

    private Integer userId;
    private String  username;
    private Integer databaseId;
    private String  systemName;
    private String  serverName;
    private Integer userTypeId;
    private String  userType;

    public ViewUserPermissions() {}

    public ViewUserPermissions(ViewUserPermissions value) {
        this.userId = value.userId;
        this.username = value.username;
        this.databaseId = value.databaseId;
        this.systemName = value.systemName;
        this.serverName = value.serverName;
        this.userTypeId = value.userTypeId;
        this.userType = value.userType;
    }

    public ViewUserPermissions(
        Integer userId,
        String  username,
        Integer databaseId,
        String  systemName,
        String  serverName,
        Integer userTypeId,
        String  userType
    ) {
        this.userId = userId;
        this.username = username;
        this.databaseId = databaseId;
        this.systemName = systemName;
        this.serverName = serverName;
        this.userTypeId = userTypeId;
        this.userType = userType;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDatabaseId() {
        return this.databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getSystemName() {
        return this.systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getServerName() {
        return this.serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewUserPermissions (");

        sb.append(userId);
        sb.append(", ").append(username);
        sb.append(", ").append(databaseId);
        sb.append(", ").append(systemName);
        sb.append(", ").append(serverName);
        sb.append(", ").append(userTypeId);
        sb.append(", ").append(userType);

        sb.append(")");
        return sb.toString();
    }
}
