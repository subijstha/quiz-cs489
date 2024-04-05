package edu.miu.subijstha.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
    }

    public void addPhoneNumber(String number, String label) {
        phoneNumbers.add(new PhoneNumber(number, label));
    }

    public void addEmailAddress(String address, String label) {
        emailAddresses.add(new EmailAddress(address, label));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddresses=" + emailAddresses +
                '}';
    }

    //method to update phoneNumber
    public void updatePhoneNumber(int index, String phoneNumber, String label ){
        if(index >= 0 && index < phoneNumbers.size()){
            phoneNumbers.set(index, new PhoneNumber(phoneNumber, label));
        }
    }

    //method to delete phoneNumber
    public void deletePhoneNumber(int index){
        if(index >=0 && index < phoneNumbers.size()){
            phoneNumbers.remove(index);
        }
    }


    //method to update emailAdddress
    public void updateEmailAddress(int index, String email, String label){
        if(index >=0 && index< emailAddresses.size()){
            emailAddresses.set(index, new EmailAddress(email, label));
        }
    }

    //method to delete emailAddress
    public void deleteEmailAddress(int index){
        if(index >= 0 && index < emailAddresses.size()){
            emailAddresses.remove(index);
        }
    }
}
