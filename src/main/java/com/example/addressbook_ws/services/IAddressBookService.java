package com.example.addressbook_ws.services;

import com.example.addressbook_ws.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
class IAddressBookService implements AddressBookService {

    List<Contact> list;

    public IAddressBookService() {
        list = new ArrayList<>();
        list.add(new Contact( "Gagan",121, "Heelalige", "Bangalore", "Karnataka", "872289619", 560099));
        list.add(new Contact( "Shravya", 231,"Hosur", "channai", "Tamilnadu", "7019329791", 526879));
        list.add(new Contact( "Swaroop", 341,"rajendranagar","Delhi","Delhi", "9901014451", 856974 ));
    }

    @Override
    public List<Contact> getContacts() {
        return list;
    }

    @Override
    public Contact getContacts(long contactId) {
        Contact c = null;
        for (Contact contact : list) {
            if (contact.getId() == contactId) {
                c = contact;
                break;
            }
        }
        return c;
    }

    @Override
    public Contact addContact(Contact contact) {
        list.add(contact);
        return contact;

    }

    @Override
    public Contact updateContact(Contact contact) {
        list.forEach(e -> {
            if (e.getId() == contact.getId()) {
                e.setName(contact.getName());
                e.setPhoneno(contact.getPhoneno());
                e.setAddress(contact.getAddress());
                e.setCity(contact.getCity());
                e.setState(contact.getState());
                e.setZip(contact.getZip());
            }
        });

        return contact;
    }

}