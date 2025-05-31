package org.example.Models;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;


    public Customer(String firstName, String lastName, String phoneNumber, Address address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

//    public Customer(String customerName, String customerSurname, String customerPhoneNumber) {
//        this.customerName = customerName;
//        this.customerSurname = customerSurname;
//        this.customerPhoneNumber = customerPhoneNumber;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printSummary(){
        System.out.println("Customer: " + firstName + " " + lastName + " " + email + " " + phoneNumber);
    }

}



