package me.arkadiy.gumenniy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arkadiy on 19.05.2016.
 */
public class Notebook {
    private List<Contact> contacts;

    public Notebook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
