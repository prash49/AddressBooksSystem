package com.bridgelabz.addressbookssystem;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<ContactPerson> contactBook ;

    public AddressBook(ArrayList<ContactPerson> contactBook) {
        this.contactBook = contactBook;
    }

    public ArrayList<ContactPerson> getContactBook() {
        return contactBook;
    }

    public void setContactBook(ArrayList<ContactPerson> contactBook) {
        this.contactBook = contactBook;
    }
}
