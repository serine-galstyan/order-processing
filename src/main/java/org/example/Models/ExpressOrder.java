package org.example.Models;

public class ExpressOrder extends Order implements Deliverable{

    public ExpressOrder(String customerName, double price){
        super(customerName,price);
    }

    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }


    public void printSummary(){
        super.printSummary();
        System.out.println("Type: Express order. Delivery Price $" + calculateDeliveryPrice());
    }

}
