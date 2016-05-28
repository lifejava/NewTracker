package ru.lifejava.models;
import java.util.*;
/**
 * Created by sergei on 28.05.16.
 */
public class Tracker {
  private Item[] items;
  private static int id = 0;

  public Tracker (int size){
    this.items = new Item[size];
  }

  public void add(Item item) {
    //this.items[items.length+1] = item;
    for (int i = 0; i < this.items.length; i++) {
      if (this.items[i] == null) {
        this.items[i] = item;
        break;
      }
    }
  }

  public void delete(Item item) {//удаляем по айдишники
    for (int i = 0; i < items.length; i++) {
      if(this.items[i].getId() == item.getId()) {
        this.items[i] = null;
      }
    }
  }

  public void edit(int id) {
    Item idX = this.findById(id);
  }

  public Item findById(int id) {
    for (int i = 0; i < items.length; i++) {
      if(items[i] != null) {
        int idX = items[i].getId();
        if(id == idX) {
          return items[i];
        }
      }
    }
    System.out.println("Объект ненайден");
    return null;
  }

  public Item[] filter(String str) { //имени
    char[] arrSearch = str.toCharArray();
    for (int i = 0; i < arrSearch.length; i++) {

    }
    
    return items;
  }

  public Item[] getAll() {
    return items;
  }
}