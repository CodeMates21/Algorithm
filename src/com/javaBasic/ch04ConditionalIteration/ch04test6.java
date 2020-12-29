package com.javaBasic.ch04ConditionalIteration;

public class ch04test6 {

  public static void main(String[] args) {
    for(int i=1; i<5; i++){
      for(int j=4; j>0; j--){
        if(i<j){
          System.out.print(" ");
        }else{
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }
}
//  int n = 4;
//    for(int i=1; i<=n; i++){
//        for (int j = 1; j <= n; j++) {
//        if ((i + j) > n) {
//        System.out.print("#");
//        } else {
//        System.out.print(" ");
//        }
//        }
//        System.out.println();
//        }