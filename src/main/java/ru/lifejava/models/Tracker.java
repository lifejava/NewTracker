package ru.lifejava.models;

import java.util.*;

/**
 * Created by sergei on 28.05.16.
 */
public class Tracker {
  private Item[] items;

  public Tracker(int size) {
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

  public void delete(Item item) {
    for (int i = 0; i < this.items.length; i++) {
      if (this.items[i].getId() == item.getId()) {
        this.items[i] = null;
        break;
      }
    }
  }

  public void edit(int id) {
    Item idX = this.findById(id);
  }

  public Item findById(int id) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] != null) {
        int idX = items[i].getId();
        if (id == idX) {
          return items[i];
        }
      }
    }
    System.out.println("Объект ненайден");
    return null;
  }

  public Item[] filter(String str) { //имени
    char[] arrSearch = str.toCharArray();
    Item[] result = new Item[items.length];

    for (int i = 0; i < this.items.length && items != null; i++) { //проверяем по порядку каждое имя из массива items[]
      if (this.items[i] != null) {
        String s = this.items[i].getName();
        char[] arr = s.toCharArray();             //попорядку делем на символы имя каждого объекта

        for (int j = 0; j < arr.length; j++) {
          if (arr[j] == arrSearch[0]) {               // когда символ станет равен первому символу искомой строки

            for (int a = j, b = 0; b < arrSearch.length && a < arr.length; a++, b++) { //проверяем каждый символ попарно
              if (arr[a] == arrSearch[b]) {            //проверяем что бы символы были равны

                if (b == (arrSearch.length - 1)) {   //когда b станет равен последнему символу искомой строки

                  for (int d = 0; d < result.length; d++) {

                    if (result[d] == null) {
                      result[d] = items[i];
                      break;
                    }
                  } // end for
                } // end if

              } // end if
            }// end for
          }// end if
        }// end for
      } // end for
    }
    return result;
  }// end filter()

  public Item[] getAll() {
    return items;
  }
}