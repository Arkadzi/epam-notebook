package me.arkadiy.gumenniy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * class that stores contacts
 *
 * @see Contact
 */
public class Notebook {
    /**
     * list of contacts
     */
    private List<Contact> contacts;

    public Notebook() {
        contacts = new ArrayList<>();
    }

    /**
     * adds new contact to list of contact
     *
     * @param contact - new contact
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
