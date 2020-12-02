package com.algorithm.easy.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FairRations {

  // Complete the fairRations function below.
  static String fairRations(int[] B) {

    List<Integer> where = new ArrayList<>();
    int count = 0;
    int a = 0;
    int b = 1;
    int num = 0;

    for(int i=0;i<B.length;i++){
      if(B[i]%2!=0){
        count++;
        where.add(i);
      }
    }

    if (count % 2 == 1) {
      System.out.println("NO");
      return "NO";
    } else {
      for(int i=0;i<count/2;i++){
        num += where.get(b) - where.get(a);
        a+=2;
        b+=2;
      }
      return  String.valueOf(num*2);
    }

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] B = new int[N];

    String[] BItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < N; i++) {
      int BItem = Integer.parseInt(BItems[i]);
      B[i] = BItem;
    }

    String result = fairRations(B);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}