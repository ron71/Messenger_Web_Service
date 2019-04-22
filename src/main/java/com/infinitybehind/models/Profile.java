package com.infinitybehind.models;

import java.util.Date;

public class Profile {

    private long id;
    private String firstName;
    private String lastName;
    private Date created;
    private String profileName;

    public Profile(long id, String firstName, String lastName, String profileName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileName = profileName;
    }

    public Profile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
