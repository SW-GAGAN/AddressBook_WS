package com.example.addressbook_ws.services;

import com.example.addressbook_ws.model.Contact;

import java.util.List;

public interface AddressBookService {
    public List<Contact> getContacts();

    public Contact getContacts(long contactId);

    public Contact addContact(Contact contact);

    public Contact updateContact(Contact contact);

}

