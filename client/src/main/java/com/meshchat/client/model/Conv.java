package com.meshchat.client.model;

import com.meshchat.client.db.entities.UserEntity;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Conversation
 */
public class Conv extends ChatGen {
    public long id;
    //
    private UserEntity admin = new UserEntity();
    //
    private SimpleStringProperty name = new SimpleStringProperty();

    public Conv() {
    }

    public Map<Long, UserProfile> members = new HashMap<>();

    public void setAdmin(UserEntity admin) {
        this.admin = admin;
    }

    public UserEntity getAdmin() {
        return this.admin;
    }

    public void addMember(long id, UserProfile mem) {
        this.members.put(id, mem);
    }

    public void removeMember(long id) {
        this.members.remove(id);
    }

    public StringProperty getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
