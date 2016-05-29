package ru.lifejava.start;

/**
 * Created by sergei on 28.05.16.
 */
import ru.lifejava.models.*;

public class StartUI {
  Menu menu;

  public StartUI() {
    this.menu = new Menu(new Tracker(10));
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
  }
}