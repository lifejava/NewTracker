package ru.lifejava.models;

public class Comment {
  String comment;

  public Comment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return " -Коментарий : " + comment;
  }
}