package com.javaBasic.ch04ConditionalIteration;

public class ch04test5 {

  public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
        System.out.print(j);
        System.out.print("#");
        if (j == i) {
          System.out.println();
        }
      }
    }
  }
}
