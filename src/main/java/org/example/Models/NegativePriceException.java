package org.example.Models;

public class NegativePriceException extends RuntimeException {
    public NegativePriceException(){}
    public String toString() {
        return "For shipping the order it should be payed.";
    }
    }
