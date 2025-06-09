package org.example.Models;

public class ExpressOrder extends Order implements Deliverable {
    private static String expressVendor = "DHL";

    public ExpressOrder(Customer customer, double price) {
        super(customer, price);
        this.customer = customer;
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }

    public static String getExpressVendor() {
        return expressVendor;
    }

    public static void setExpressVendor(String expressVendor) {
        ExpressOrder.expressVendor = expressVendor;
    }

    public void printSummary() {
        super.printSummary();
        System.out.print("Type: Express order. Delivery Price: AMD " + calculateDeliveryPrice() + " Vendor: " +  expressVendor);
        System.out.println();
    }


}
