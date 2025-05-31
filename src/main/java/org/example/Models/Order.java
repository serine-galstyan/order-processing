package org.example.Models;

public class Order {
    protected String customerName;
    protected String customerSurname;
    protected double price;

    public Order(String customerName, String customerSurname) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.price = 0;
    }

    public Order(String customerName, String customerSurname, double price) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.price = price;
    }

    public void printSummary() {
        System.out.println();
        System.out.print("Customer: " + customerName + " " + customerSurname + " Price: AMD " + price);
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
