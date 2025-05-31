package org.example.Models;

public class InternationalOrder extends Order implements Deliverable {

    public InternationalOrder(String customerName, String customerSurname, double price) {
        super(customerName, customerSurname, price);
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;
    }


    public void printSummary() {
        super.printSummary();
        System.out.print(" Type: International order. Delivery Price: AMD " + calculateDeliveryPrice());
    }
}
