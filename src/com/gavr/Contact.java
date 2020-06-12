package com.gavr;

import java.util.HashMap;
import java.util.Map;

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private Enum group;

    public Contact(String name, String surname, String phoneNumber, Enum group) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public void setGroup(Enum group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return name + surname + "from group " + group + ". " + phoneNumber;
    }
}
