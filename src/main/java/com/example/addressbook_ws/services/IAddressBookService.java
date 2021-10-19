package com.example.addressbook_ws.services;

import com.example.addressbook_ws.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
class IAddressBookService implements AddressBookService {

    List<Contact> list;

    //creating list of contacts
    public IAddressBookService() {
        list = new ArrayList<>();
        list.add(new Contact("Gagan", 121, "Heelalige", "Bangalore", "Karnataka", "872289619", 560099));
        list.add(new Contact("Shravya", 231, "Hosur", "channai", "Tamilnadu", "7019329791", 526879));
        list.add(new Contact("Swaroop", 341, "rajendranagar", "Delhi", "Delhi", "9901014451", 856974));
    }

    /**
     * getcontacts from contact list
     *
     * @return Contacts
     */
    @Override
    public List<Contact> getContacts() {
        return list;
    }

    /**
     * geting contacts by Id in contact list
     *
     * @param contactId
     * @return
     */
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

    /**
     * Adding contacts in to the list
     *
     * @param contact
     * @return contact list
     */
    @Override
    public Contact addContact(Contact contact) {
        list.add(contact);
        return contact;

    }

    /**
     * update contacts in the contact list
     *
     * @param contact
     * @return
     */
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

    @Override
    public Contact deleteContact(long parseLong) {
        list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
    return null;
    }
}
