package org.example.Models;

public class CountryException extends RuntimeException {
  public CountryException() {}
  public String toString() {
    return "We're sorry, but we've no delivery to your mentioned country.";
  }
  }

