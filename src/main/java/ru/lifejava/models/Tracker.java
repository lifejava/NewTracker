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

  public int generateId() {
    id++;
    return id;
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
    //noo
    return null;
  }

  public Item[] filter(long a, long b) { //имени
    int k = 0;
    Item[] result = new Item[items.length];
    for(int i = 0; items[i] != null && i < items.length; i++) {
      if((items[i].getCreate() >= a) && (items[i].getCreate() <= b)) {
        result[k] = items[i];
        k++;
      }
    }
    return result;
  }

  public Item[] getAll() {
    return items;
  }
}