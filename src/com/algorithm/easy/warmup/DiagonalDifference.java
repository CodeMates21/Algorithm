package com.algorithm.easy.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here

    int sum1=0;
    int sum2=0;

    for(int i=0; i<arr.size(); i++){
      sum1+=arr.get(i).get(i);
      sum2+=arr.get(arr.size()-1-i).get(i);
    }
    return Math.abs(sum1-sum2);
  }

}

class diagonalDifference {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n).forEach(i -> {
      try {
        arr.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = Result.diagonalDifference(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}