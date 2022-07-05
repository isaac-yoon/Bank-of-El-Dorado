package com.eldorado.bank.Models;

import java.sql.Date;
import java.util.Objects;

public class User {
    private int id;
    private String first_name, last_name, email, username, password, address;
    private Date dob;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id && Objects.equals(first_name, user.first_name) && Objects.equals(last_name, user.last_name)
                && Objects.equals(email, user.email) && Objects.equals(username, user.username)
                && Objects.equals(password, user.password) && Objects.equals(address, user.address)
                && Objects.equals(dob, user.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, email, username, password, address, dob);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", first_name='" + getFirst_name() + "'" +
                ", last_name='" + getLast_name() + "'" +
                ", email='" + getEmail() + "'" +
                ", username='" + getUsername() + "'" +
                ", password='" + getPassword() + "'" +
                ", address='" + getAddress() + "'" +
                ", dob='" + getDob() + "'" +
                "}";
    }

    public User(int id, String first_name, String last_name, String email, String username, String password,
            String address, Date dob) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
        this.dob = dob;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
