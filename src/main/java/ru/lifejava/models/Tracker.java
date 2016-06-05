package ru.lifejava.models;

/**
 * Created by sergei on 28.05.16.
 */
public class Tracker {
  private Item[] items;

  public Tracker(int size) {
    this.items = new Item[size];
  }

  public void add(Item item) {
    for (int i = 0; i < this.items.length; i++) {
      if (this.items[i] == null) {
        this.items[i] = item;
        break;
      }
    }
  }

  public Item findById(int numId) {
    for (Item item : getAll()) {
      if(item != null && item.getId() == numId) {
        return item;
      }
    }
    return null;
  }

  public void delete(int numId) {
    for (int i = 0; i < items.length; i++) {
      if(items[i] != null && items[i].getId() == numId) {
        this.items[i] = null;
        break;
      }
    }
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