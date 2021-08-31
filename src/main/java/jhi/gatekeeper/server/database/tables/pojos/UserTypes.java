/*
 * This file is generated by jOOQ.
 */
package jhi.gatekeeper.server.database.tables.pojos;


import java.io.Serializable;

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
public class UserTypes implements Serializable {

    private static final long serialVersionUID = -1806781364;

    private Integer id;
    private String  description;

    public UserTypes() {}

    public UserTypes(UserTypes value) {
        this.id = value.id;
        this.description = value.description;
    }

    public UserTypes(
        Integer id,
        String  description
    ) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserTypes (");

        sb.append(id);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
