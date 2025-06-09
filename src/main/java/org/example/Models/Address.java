package org.example.Models;

import java.util.Comparator;

public class Address{
    private String country;
    private String city;
    private String street;
    private String house;


    public Address(String country, String city, String street, String house) throws CountryException{
        if(country.equals("Georgia")){
            throw new CountryException();
        }else{
            this.country = country;
        }
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public void setCountry(String country) {
        try {
            country.equals("Georgia");
            this.country = country;
        } catch (CountryException e) {
            System.out.println(e.toString());
        }
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }


    public void printSummary(){
        System.out.println("Address: " + country + ", " + city + ", " + street + ", " + house);
    }

    public String toString(){
        return country + " " + city + " " + street + " " + house;
    }
}
