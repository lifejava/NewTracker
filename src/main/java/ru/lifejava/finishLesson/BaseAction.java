package ru.lifejava.finishLesson;

/**
 * Created by sergei on 09.06.16.
 */
public abstract class BaseAction implements UserAction{
  public BaseAction(String name) {
  }
  abstract void a();
  abstract void b();

  public void info() {
    System.out.println("info()");
  }
}
