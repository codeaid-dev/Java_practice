package com.example.utils;

public class Person {
  String name;
  public Person(String name) {
    this.name = name;
  }
  public Person() {
    this.name = "名無し";
  }
  public void showName() {
    System.out.println("名前：" + this.name);
  }
}
