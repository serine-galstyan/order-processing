package org.example.Models;

public class InternationalOrder extends Order implements Deliverable {
    private static String interVendor = "DHL";

    public InternationalOrder(Customer customer, double price) {
        super(customer, price);
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;
    }

    public static String getInterVendor() {
        return interVendor;
    }

    public static void setInterVendor(String interVendor) {
        InternationalOrder.interVendor = interVendor;
    }

    public void printSummary() {
        super.printSummary();
        System.out.print("Type: International order. Delivery Price: AMD " + calculateDeliveryPrice() + " Vendor: " + getInterVendor());
        System.out.println();
    }

}
