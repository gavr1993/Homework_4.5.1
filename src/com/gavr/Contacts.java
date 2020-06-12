package com.gavr;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
    public static void addContact(Contact contact) {
        Map<String, Contact> contacts = new HashMap<>();
        String phoneNumber = contact.getPhoneNumber();
        contacts.put(phoneNumber, contact);
    }
    public static void deleteContact(Map<String, Contact> contacts, String name, String surName) {

    }
}

