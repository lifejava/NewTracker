package ru.lifejava.models;
import java.util.*;

public class Item {
  private int id;
  public String name;
  public String description;
  public Comment[] comment = new Comment[10];
  public long createDate;

  public Random random = new Random();

  public Item(String name, String description) {
    this.name = name;
    this.description = description;
    this.id = random.nextInt(100) * 1;
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

  public void setComment(Comment comment) {
    for (int i = 0; i < this.comment.length; i++) {
      if(this.comment[i] == null) {
        this.comment[i] = comment;
        break;
      }
    }
  }

  public Comment[] getComment () {
    return comment;
  }
}