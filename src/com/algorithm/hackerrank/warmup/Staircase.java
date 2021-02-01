package com.algorithm.hackerrank.warmup;

import java.util.*;

public class Staircase {

  // Complete the staircase function below.
  static void staircase(int n) {
    for(int i =1; i<n+1;i++){
      for(int j=1;j<n+1;j++){
        if(n-i<j){
          System.out.print("#");
        }else{
          System.out.print(" ");
        }

      }
      System.out.println();
    }

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    staircase(n);

    scanner.close();
  }
}
