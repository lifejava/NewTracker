package ru.lifejava.models;

public class Task extends Item{

  public Task(String name, String description) {
    super(name, description);
  }

  public String calculatePrice() {
    return "100%";
  }
}