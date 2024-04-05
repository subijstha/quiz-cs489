package edu.miu.subijstha;

import edu.miu.subijstha.model.Contact;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactManagerApp {

    private List<Contact> contacts;
    public ContactManagerApp(){
        this.contacts= new ArrayList<>();
    };

    //method to add contact
    public void addContact(Contact contact){
        contacts.add(contact);
    }


    //method to search contact by name
    public List<Contact> searchContactsByName(String name){
        List<Contact> result = new ArrayList<>();
        for(Contact contact : contacts){
            if((contact.getFirstName() + " " + contact.getLastName()).equalsIgnoreCase(name)) {
                result.add(contact);
            }
        }
        return result;
    }


    //method to search contact by company
    public List<Contact> searchContactsByCompany(String company) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getCompany().equalsIgnoreCase(company)) {
                result.add(contact);
            }
        }
        return result;
    }

    //method to  search contact by jobTitle
    public List<Contact> searchContactsByJobTitle(String jobTitle) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getJobTitle().equalsIgnoreCase(jobTitle)) {
                result.add(contact);
            }
        }
        return result;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void sortContactsByName() {
        Collections.sort(contacts, Comparator.comparing(Contact::getFirstName));
    }


    public static void main(String[] args) {
        ContactManagerApp contactManager = new ContactManagerApp();

        Contact contact1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        contact1.addPhoneNumber("240-133-0011", "Home");
        contact1.addPhoneNumber("240-112-0123", "Mobile");
        contact1.addEmailAddress("dave.sang@gmail.com", "Home");
        contact1.addEmailAddress("dsanger@argos.com", "Work");

        Contact contact2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");

        Contact contact3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        contact3.addPhoneNumber("412-116-9988", "Work");
        contact3.addEmailAddress("ali@bmi.com", "Work");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);


        System.out.println("Search by name:");
        System.out.println(contactManager.searchContactsByName("David Sanger"));
        System.out.println("\nSearch by company:");
        System.out.println(contactManager.searchContactsByCompany("Zappos"));
        System.out.println("\nSearch by job title:");
        System.out.println(contactManager.searchContactsByJobTitle("HR Manager"));


        System.out.println("--------------------------------------------------------");
        System.out.println("sorted name");
        contactManager.sortContactsByName();



        // Print sorted contacts
        List<Contact> sortedContacts = contactManager.getContacts();
        for (Contact contact : sortedContacts) {
            System.out.println(contact);
        }
    }





}