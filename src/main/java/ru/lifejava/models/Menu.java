package ru.lifejava.models;

import java.util.Scanner;

/**
 * Created by sergei on 29.05.16.
 */
public class Menu {
  Tracker tracker;
  private Scanner scanner = new Scanner(System.in);
  private String oneMenu = "\nВведите число для выбора элемента меню:\n " +
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
      numberOne();
    } else if(num == 2) {

    }else if(num == 3) {
      numberThree();
    }else if(num == 4) {
      numberFour();
    }else if(num == 5) {
      numberFive();
    }else if(num == 6) {

    }else if(num == 7) {

    }
  }

  public void listApp(Item[] item) {
    for (int i = 0; i < item.length; i++) {
      if (item[i] != null) {
        System.out.printf("%d. Имя: %s. Описание: %s.  Дата создания: %d. Id: %s \n", i+1,
                item[i].getName(), item[i].getDescription(),
                item[i].getCreate(), item[i].getId());
      } else if (item[i] == null){
        System.out.println(i+1 + " ______________________");
      }
    }
  }

  public void numberOne() {
    System.out.println("Введите имя");
    String name = entryString();
    System.out.println("Описание");
    String description = entryString();
    this.tracker.add(new Task(name, description));
  }

  public void numberTwo() {

  }

  public void numberThree() {
    System.out.println("\nВведите число заявки которую хотите удалить: \n");

    listApp(tracker.getAll());

    int num = entryNum();
    if(num >= 1 && tracker.getAll()[num - 1] != null) {
      tracker.delete(tracker.getAll()[num - 1]);
    } else {
      System.out.println("\n*************** Ошибка! Неправильный номер зайвки ***************\n");
    }
  }

  public void numberFour() {
    listApp(tracker.getAll());
  }

  public void numberFive() {
    System.out.println("Введите подстроку (поиск по имени)");
    String strSearch = entryString();
    Item[] item = tracker.filter(strSearch);
    listApp(item);
  }

  public void numberSix() {

  }
  public void numberSeven() {

  }

  public void setTracker(Tracker tracker) {
    this.tracker = tracker;
  }
}
