package ru.lifejava.start;

/**
 * Created by sergei on 28.05.16.
 */
import ru.lifejava.models.*;

public class StartUI {
  Menu menu;

  public StartUI() {
    this.menu = new Menu(new Tracker(20));
  }

  public void displayMenu() {
    while (true) {
      this.menu.displayMenu();
      int entryNum = this.menu.entryNum();
      if(entryNum != 7) {
        this.menu.introducedNumber(entryNum);
      } else {
        break;
      }
    }

//    String name = input.ask("Please, enter the taks's name: ");
//    Tracker tracker = new Tracker(20);
//    tracker.add(new Item(name, "first desk"));
//    for (Item item : tracker.getAll()){
//      if (item != null){
//        System.out.println(item.getName());
//      }
//    }
  }
  public static void main(String[] args) {
    Menu menu = new Menu(new Tracker(20));
    Tracker tracker = new Tracker(20);
    StartUI startUI = new StartUI();
    menu.setTracker(tracker);
    startUI.displayMenu();

    //String name = menu.ask("Введите цифру для выбора меню");
    //System.out.println(name);


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