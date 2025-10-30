package com.supportsystem;
public class user {
    protected String name;
    protected String email;

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
