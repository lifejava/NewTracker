package ru.lifejava.models;

import java.util.Scanner;

/**
 * Created by sergei on 29.05.16.
 */
  public class ConsoleInput{
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
      System.out.println(question);
      return scanner.nextLine();
    }
  }

