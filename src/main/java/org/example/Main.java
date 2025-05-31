package org.example;

import org.example.Models.Customer;
import org.example.Models.ExpressOrder;
import org.example.Models.InternationalOrder;
import org.example.Models.Order;


public class Main {
    public static void main(String[] args) {

        Customer orderCustomer = new Customer("John", "Smith", "+37499778866");
        Customer expressOrderCustomer = new Customer("Gegham", "Karapetyan", "+37455664385");
        Customer internationalOrderCustomer = new Customer("Levon", "Hakobyan", "+12124567890");
        Customer orderCustomer2 = new Customer("Maria", "Harutyunyan", "+37455578787");

        Order order = new Order(orderCustomer.getCustomerName(), orderCustomer.getCustomerSurname(), 3000);
        Order expressOrder1 = new ExpressOrder(expressOrderCustomer.getCustomerName(), expressOrderCustomer.getCustomerSurname(), 8900);
        ExpressOrder expressOrder2 = new ExpressOrder(expressOrderCustomer.getCustomerName(), expressOrderCustomer.getCustomerSurname(), 10900);
        Order internationalOrder1 = new InternationalOrder(internationalOrderCustomer.getCustomerName(), internationalOrderCustomer.getCustomerSurname(), 50000);
        InternationalOrder internationalOrder2 = new InternationalOrder(internationalOrderCustomer.getCustomerName(), internationalOrderCustomer.getCustomerSurname(), 20500);

        Order[] orderList = {order, expressOrder1, expressOrder2, internationalOrder1, internationalOrder2};

        System.out.println("Order list - today");
        for (Order item : orderList) {
            item.printSummary();
            System.out.println();
        }

        System.out.println("____________________________________________________________________________________________________________");
        System.out.println("Express order list:");
        for (Order item : orderList) {
            if (item instanceof ExpressOrder) {
                item.printSummary();
                System.out.println();
            }
        }


    }

}