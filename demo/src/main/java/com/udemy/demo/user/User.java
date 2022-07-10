package com.udemy.demo.user;

import javax.validation.constraints.Size;

public class User {
    @Size(min=2,max=25,message="Le nom doit faire entre 2 et 25 caractères")
    private String firstname;
    @Size(min=2,max=25,message="Le nom doit faire entre 2 et 25 caractères")
    private String lastname;
    private String email;
    private String password;

    public User(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
