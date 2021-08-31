/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class AccessRequests implements Serializable {

    private static final long serialVersionUID = 2084229583;

    private Integer   id;
    private Integer   userId;
    private Integer   databaseSystemId;
    private Byte      hasBeenRejected;
    private Byte      needsApproval;
    private String    activationKey;
    private Timestamp createdOn;

    public AccessRequests() {}

    public AccessRequests(AccessRequests value) {
        this.id = value.id;
        this.userId = value.userId;
        this.databaseSystemId = value.databaseSystemId;
        this.hasBeenRejected = value.hasBeenRejected;
        this.needsApproval = value.needsApproval;
        this.activationKey = value.activationKey;
        this.createdOn = value.createdOn;
    }

    public AccessRequests(
        Integer   id,
        Integer   userId,
        Integer   databaseSystemId,
        Byte      hasBeenRejected,
        Byte      needsApproval,
        String    activationKey,
        Timestamp createdOn
    ) {
        this.id = id;
        this.userId = userId;
        this.databaseSystemId = databaseSystemId;
        this.hasBeenRejected = hasBeenRejected;
        this.needsApproval = needsApproval;
        this.activationKey = activationKey;
        this.createdOn = createdOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDatabaseSystemId() {
        return this.databaseSystemId;
    }

    public void setDatabaseSystemId(Integer databaseSystemId) {
        this.databaseSystemId = databaseSystemId;
    }

    public Byte getHasBeenRejected() {
        return this.hasBeenRejected;
    }

    public void setHasBeenRejected(Byte hasBeenRejected) {
        this.hasBeenRejected = hasBeenRejected;
    }

    public Byte getNeedsApproval() {
        return this.needsApproval;
    }

    public void setNeedsApproval(Byte needsApproval) {
        this.needsApproval = needsApproval;
    }

    public String getActivationKey() {
        return this.activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AccessRequests (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(databaseSystemId);
        sb.append(", ").append(hasBeenRejected);
        sb.append(", ").append(needsApproval);
        sb.append(", ").append(activationKey);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}
