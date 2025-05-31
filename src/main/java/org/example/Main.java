package org.example;

import org.example.Models.*;


public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Armenia", "Yerevan", "Azatutyan str,", "15");
        Address address2 = new Address("Armenia", "Yerevan", "Leo str", "19");
        Address address3 = new Address("USA", "New Castle", "Southgate Blvd C25", "11");
        Address address4 = new Address("Armenia", "Yerevan", "Arshakunyats ave", "15/7");

        Customer orderCustomer = new Customer("John", "Smith", "+37499778866", address1, "johnsmith77@gmail.com");
        Customer expressCustomer = new Customer("Gegham", "Karapetyan", "+37455664385", address2, "geghamkarapetyan@gmail.com");
        Customer internationalCustomer = new Customer("Levon", "Hakobyan", "+12124567890", address3, "levonhakobyan@gmail.com");
        Customer orderCustomer2 = new Customer("Maria", "Harutyunyan", "+37455578787", address4, "mariaharutyunyan@gmail.com");

        Order order = new Order(orderCustomer, 3000);
        Order expressOrder1 = new ExpressOrder(expressCustomer, 8900);
        ExpressOrder expressOrder2 = new ExpressOrder(expressCustomer, 10900);
        Order internationalOrder1 = new InternationalOrder(internationalCustomer, 50000);
        InternationalOrder internationalOrder2 = new InternationalOrder(orderCustomer2, 20500);

        Order[] orderList = {order, expressOrder1, expressOrder2, internationalOrder1, internationalOrder2};

        System.out.println("Order list - today");
        System.out.println();

        for (Order item : orderList) {
            item.getCustomer().printSummary();
            item.getCustomer().getAddress().printSummary();
            item.printSummary();
            System.out.println();
        }

        int expressOrderCount = 0;
        int interOrderCount = 0;

        System.out.println("____________________________________________________________________________________________________________");
        System.out.println("Express order list: ");

        for (Order item : orderList) {
            if (item instanceof ExpressOrder) {
                item.getCustomer().printSummary();
                item.getCustomer().getAddress().printSummary();
                item.printSummary();
                System.out.println();
                expressOrderCount++;
                break;
            } else if(item instanceof InternationalOrder){
                interOrderCount++;
            }
        }

        System.out.println("Express order count: " + expressOrderCount);
        System.out.println("International order count: " + interOrderCount);

    }
}