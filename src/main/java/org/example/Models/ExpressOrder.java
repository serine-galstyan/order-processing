package org.example.Models;

public class ExpressOrder extends Order implements Deliverable {

    public ExpressOrder(String customerName, String customerSurname, double price) {
        super(customerName, customerSurname, price);
        this.customerName = customerName;
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }

    public void printSummary() {
        super.printSummary();
        System.out.print(" Type: Express order. Delivery Price: AMD " + calculateDeliveryPrice());
    }

}
