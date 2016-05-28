package ru.lifejava.models;
import java.util.*;

public class Item {
  private int id;
  public String name;
  public String description;
  public Comment[] comment;
  public long createDate;

  public Item() {
    this.createDate = new Date().getTime();
  }

  public String getName() {
    return this.name;
  }
  public void setName(String str) {
    this.name = str;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String str) {
    this.description = str;
  }

  public long getCreate() {
    return this.createDate;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }
}