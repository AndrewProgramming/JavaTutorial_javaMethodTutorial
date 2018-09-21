package com.andrewProgramming;

// Program to illustrate methods in java

public class MethodDemo {


  //define a method
  private String whoIam() {
    int random = (int) (Math.random() * 2);
    System.out.println("random:" + random);
    String name = null;
    switch (random) {
      case 0:
        name = "kobe";
        break;
      case 1:
        name = "jordan";
        break;

    }
    return name;
  }


  public static void main(String[] args) {

    MethodDemo methodDemo = new MethodDemo();

    //calling the method and print it
    System.out.println(methodDemo.whoIam());


  }
}