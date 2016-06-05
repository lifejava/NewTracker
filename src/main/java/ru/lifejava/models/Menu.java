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
    // switch ()
    switch (num) {
      case 1:
        numberOne();
        break;
      case 2:
        numberTwo();
        break;
      case 3:
        numberThree();
        break;
      case 4:
        numberFour();
        break;
      case 5:
        numberFive();
        break;
      case 6:
        numberSix();
        break;
      default:
        break;
    }
  }

  public void listAppAll(Item[] item) {
    for (Item items : item) {
      if(items != null) {
        System.out.printf("Id: %d. Имя: %s. Описание: %s.  Дата создания: %d. \n",
                items.getId(), items.getName(), items.getDescription(), items.getCreate());
      }
    }
  }

  public void numberOne() {
    System.out.println("Введите имя");
    String name = entryString();
    System.out.println("Описание");
    String description = entryString();
    tracker.add(new Task(name, description));
  }

  public void numberTwo() {         //по айдишнику
    System.out.println("Введите id который хотите редактировать");
    listAppAll(tracker.getAll());
    Item itemId = tracker.findById(entryNum());

    if(itemId != null) {
      System.out.println("Введите имя: ");
      itemId.setName(entryString());
      System.out.println("Введите описание: ");
      itemId.setDescription(entryString());
    } else {
      System.out.println("Такого id несуществует");
    }
  }

  public void numberThree() {
    System.out.println("\nВведите id заявки которую хотите удалить: \n");
    listAppAll(tracker.getAll());
    int id = entryNum();
    if (tracker.findById(id) != null) {
      tracker.delete(id);
    }else {
      System.out.println("\n*************** Ошибка! Неправильный номер зайвки ***************\n");
    }
  }

  public void numberFour() {
    listAppAll(tracker.getAll());
  }

  public void numberFive() {
    System.out.println("Введите подстроку (поиск по имени)");
    String strSearch = entryString();
    Item[] item = tracker.filter(strSearch);
    listAppAll(item);
  }

  public void numberSix() {
    System.out.println("Добавьте коментарий.\n Введите id: \n ");
    listAppAll(tracker.getAll());
    Item itemId = tracker.findById(entryNum());
    if(itemId != null) {
      System.out.println("Пешите коментарий");
      itemId.setComment(new Comment(entryString()));
    } else {
      System.out.println("Неверный id");
    }
  }
}
