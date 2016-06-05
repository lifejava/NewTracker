package ru.lifejava.start;

/**
 * Created by sergei on 28.05.16.
 */
import ru.lifejava.models.*;

public class StartUI {
  Menu menu;
  Tracker tracker;

  public StartUI(Tracker tracker) {
    this.menu = new Menu(tracker);
    this.tracker = tracker;
  }

  public void displayMenu() {

    while (true) {
      menu.displayMenu();
      int entryNum = menu.entryNum();
      if(entryNum < 7 && entryNum != 0) {
        menu.introducedNumber(entryNum);
      }else if(entryNum == 0 || entryNum > 7) {
        System.out.println("**********Такого пункта меню нет**********");
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
//
  }
  public static void main(String[] args) {
    StartUI startUI = new StartUI(new Tracker(10));
    startUI.tracker.add(new Task("Колонки автомобильные", "Красный цвет"));
    startUI.tracker.add(new Task("Колонки домашние", "Синий цвет"));
    startUI.displayMenu();
  }
}