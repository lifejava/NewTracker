package ru.lifejava.models;

public class Bug extends Item {

  public Bug(String name, String description) {
    super(name, description);
  }

  public String calculatePrice() {
    return "70%";
  }
}