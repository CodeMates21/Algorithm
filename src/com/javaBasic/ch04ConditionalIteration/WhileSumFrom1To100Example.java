package com.javaBasic.ch04ConditionalIteration;

public class WhileSumFrom1To100Example {

  public static void main(String[] args) {
    int sum=-0;
    int i=1;

    while(i<=100){
      sum+=i++;
    }
    System.out.println("1부터"+(i-1)+"의 합: "+sum);
  }
}
