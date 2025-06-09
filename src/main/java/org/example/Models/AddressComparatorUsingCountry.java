package org.example.Models;

import java.util.Comparator;

public class AddressComparatorUsingCountry implements Comparator<Address> {
    @Override
    public int compare(Address a1, Address a2) {
        return a1.getCountry().compareTo(a2.getCountry());
    }
}
