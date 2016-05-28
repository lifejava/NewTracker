package ru.lifejava.start;

/**
 * Created by sergei on 28.05.16.
 */
import ru.lifejava.models.*;

public class StartUI {
  public static void main(String[] args) {

    Tracker tracker = new Tracker(20);
    tracker.add(new Bug("темный экран", "пропажа изображения"));
    tracker.add(new Bug("тень", "на улице"));
    tracker.add(new Bug("темный экран", "пропажа изображения"));
    tracker.add(new Task("first task", "first desc"));
    //tracker.edit("Bagbag", "fd", "измененый");
    tracker.add(new Bug("нет сигнали", "потеря сигнала"));
    tracker.add(new Bug("сбой", "сбой в системе"));
    tracker.add(new Task("first task", "first desc"));
    //tracker.delete(1);

    System.out.println("Ищу--------------");
    for (Item item : tracker.filter("е")) {
      if(item != null) {
        System.out.printf("Имя: %s. Описание: %s.  Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getCreate(), item.getId());
      }
    }
    System.out.println("-----------------------");


    //Весь вывод
    for (Item item : tracker.getAll()) {
      if(item != null) {
        System.out.printf("Имя: %s. Описание: %s.  Дата создания: %d. Id: %s \n", item.getName(), item.getDescription(), item.getCreate(), item.getId());
      }
    }
  }
}