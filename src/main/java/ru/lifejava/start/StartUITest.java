package ru.lifejava.start;

import ru.lifejava.models.Comment;
import ru.lifejava.models.Menu;
import ru.lifejava.models.Task;
import ru.lifejava.models.Tracker;

/**
 * Created by sergei on 06.06.16.
 */
//в классе StartUITest эмулировать поведение пользователя.
// То есть за счет статических данных, пользователь выбирает
// пункты меню. Вводить данные, выводить данные, и выходит из приложение.
public class StartUITest {
  public static void main(String[] args) {
    Menu menu = new Menu(new Tracker(10));
    //Добовляем
    System.out.println("Добовляем: ");
    menu.tracker.add(new Task("Телевизор", "Синий цвет"));
    menu.tracker.add(new Task("Колонки", "Красный цвет"));
    menu.tracker.add(new Task("Музыкальный плеер", "Красный цвет"));
    menu.tracker.add(new Task("Телефон", "Желтый цвет"));
    menu.listAppAll(menu.tracker.getAll());
    System.out.println();

    //Редактируем
    System.out.println("Редактируем:");
    menu.tracker.findById(menu.tracker.getAll()[0].getId()).setName("Музыкальный центр");
    menu.tracker.findById(menu.tracker.getAll()[0].getId()).setDescription("Черный цвет");
    menu.listAppAll(menu.tracker.getAll());
    System.out.println();

    //Удаляем
    System.out.println("Удаляем: ");
    menu.tracker.delete(menu.tracker.getAll()[0].getId());
    menu.listAppAll(menu.tracker.getAll());
    System.out.println();

    //Отоброжаем список всех заявок
    System.out.println("Отоброжаем список всех заявок: ");
    menu.listAppAll(menu.tracker.getAll());
    System.out.println();


    //Отображение заявок с условием фильтра
    System.out.println("Отображение заявок с условием фильтра: ");
    menu.listAppAll(menu.tracker.filter("Тел"));
    System.out.println();

    //Добовляем коментарии
    System.out.println("Добовляем коментарии");
    menu.tracker.getAll()[1].setComment(new Comment("Супер"));
    menu.tracker.getAll()[1].setComment(new Comment("Лучшие"));
    menu.listAppAll(menu.tracker.getAll());

    //Выходим из приложения
    menu.introducedNumber(7);
  }
}
