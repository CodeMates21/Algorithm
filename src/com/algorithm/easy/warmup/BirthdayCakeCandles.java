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
   * Complete the 'birthdayCakeCandles' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY candles as parameter.
   */

  public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int count = 0;
    // 1 3 4 4
    Collections.sort(candles);

    int value = candles.get(candles.size() - 1);

    for (int c : candles) {
      if (value == c) {
        count++;
      }
    }

    return count;
  }

}

public class BirthdayCakeCandles {
  public static void main(String[] args) throws IOException {

    List<Integer> integers = new ArrayList<>();
    int count;
    integers.add(1000);
    integers.add(1000);
    integers.add(1000);
    integers.add(1000);

    count = Result.birthdayCakeCandles(integers);

    System.out.println("count = " + count);


  }
}
