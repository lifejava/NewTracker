package ru.lifejava.models;

import java.util.Scanner;

/**
 * Created by sergei on 29.05.16.
 */
public class Menu {
  Tracker tracker;
  private Scanner scanner = new Scanner(System.in);
  private String oneMenu = "Введите число для выбора элемента меню\n " +
                          "1. Добавление новой заявки\n " +
                          "2. Редактирования заявки.\n " +
                          "3. Удаления заявки.\n " +
                          "4. Отображение списка всех заявок.\n " +
                          "5. Отображения заявок с условием фильтра.\n " +
                          "6. Добавлять к заявки комментарий.\n " +
                          "7. Выход";

  public Menu(Tracker tracker) {
    this.tracker = tracker;
  }

  public void displayMenu() {
    System.out.println(oneMenu);
  }

  public String ask(String question) {
    System.out.println(question);
    return scanner.nextLine();
  }

  public int entryNum() {
    int num = Integer.parseInt(scanner.nextLine());
    return num;
  }

  public String entryString() {
    String str = scanner.nextLine();
    return str;
  }
  public void introducedNumber (int num){
    if(num == 1) {
      System.out.println("Введите имя");
      String name = entryString();
      System.out.println("Описание");
      String description = entryString();
      this.tracker.add(new Task(name, description));
    } else if(num == 2) {

    }else if(num == 3) {

    }else if(num == 4) {

    }else if(num == 5) {

    }else if(num == 6) {

    }else if(num == 7) {

    }
  }

  public void setTracker(Tracker tracker) {
    this.tracker = tracker;
  }
}
