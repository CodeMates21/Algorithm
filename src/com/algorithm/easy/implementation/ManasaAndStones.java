package com.algorithm.easy.implementation;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManasaAndStones {

  // Complete the stones function below.
  static int[] stones(int n, int a, int b) {

//    int[] whereStone = n
    List<Integer> sumList = new ArrayList<>();
    int[] where = new int[n];

    for(int i=0;i<n;i++){
      where[i] = a*i + b*(n-i-1);
      if(!sumList.contains(where[i]))
        sumList.add(where[i]);
    }

    Collections.sort(sumList);

    int[] result = new int[sumList.size()];

    for(int i=0;i<sumList.size();i++)
      result[i] = sumList.get(i);

    return result;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int T = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int TItr = 0; TItr < T; TItr++) {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int a = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int b = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int[] result = stones(n, a, b);

      for (int i = 0; i < result.length; i++) {
        bufferedWriter.write(String.valueOf(result[i]));

        if (i != result.length - 1) {
          bufferedWriter.write(" ");
        }
      }

      bufferedWriter.newLine();
    }

    bufferedWriter.close();

    scanner.close();
  }
}
