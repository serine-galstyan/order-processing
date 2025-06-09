package org.example;

import org.example.Models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        ExpressOrder expressOrder2 = new ExpressOrder(expressCustomer, 0);
        Order internationalOrder1 = new InternationalOrder(internationalCustomer, 50000);
        InternationalOrder internationalOrder2 = new InternationalOrder(orderCustomer2, 20500);

//        Order[] orderList = {order, expressOrder1, expressOrder2, internationalOrder1, internationalOrder2};

        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(order);
        orderList.add(expressOrder1);
        orderList.add(expressOrder2);
        orderList.add(internationalOrder1);
        orderList.add(internationalOrder2);

        ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(orderCustomer, expressCustomer, internationalCustomer, orderCustomer2));

        List<Address> addresses = new ArrayList<>(Arrays.asList(address1, address2, address3, address4));


        System.out.println(orderList);
        System.out.println(expressCustomer);
        System.out.println(order.getCustomer());

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
            } else if (item instanceof InternationalOrder) {
                interOrderCount++;
            }
        }

        System.out.println("Express order count: " + expressOrderCount);
        System.out.println("International order count: " + interOrderCount);


        expressOrder2.shipOrder();
//    Address address5 = new Address("Georgia", "Yerevan", "Arshakunyats ave", "15/7");


        Collections.sort(orderList);
        System.out.println(orderList);
        orderList.sort(Collections.reverseOrder());
        System.out.println(orderList);
        System.out.println();
        System.out.println("Customers sorted by first name:");
        Collections.sort(customers);
        System.out.println(customers);
        System.out.println();
        System.out.println("Customers sorted by first name DESC:");
        customers.sort(Collections.reverseOrder());
        System.out.println(customers);

        System.out.println();
        System.out.println("Addresses sorted by country:");
        Collections.sort(addresses, new AddressComparatorUsingCountry());
        System.out.println(addresses);
        System.out.println();
        System.out.println("Addresses sorted by city:");
        Collections.sort(addresses, new AddressComparatorUsingCity());
        System.out.println(addresses);


    }
}