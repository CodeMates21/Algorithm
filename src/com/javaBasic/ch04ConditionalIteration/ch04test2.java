package com.javaBasic.ch04ConditionalIteration;

public class ch04test2 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 != 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
