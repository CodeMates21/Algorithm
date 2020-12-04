package com.algorithm.easy.warmup;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BirthdayCakeCandles {


  public static void main(String[] args) throws IOException {
    List<Integer> candles = new ArrayList<>();
    candles.add(3);
    candles.add(2);
    candles.add(1);
    candles.add(3);

    int result = Result.birthdayCakeCandles(candles);
    System.out.println(result);
  }


  static class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {

      Collections.sort(candles);
      int count = 0;
      int heightCandle = candles.get(candles.size()-1);

      for (int i = 0; i < candles.size(); i++) {
        if (heightCandle == candles.get(i)) {
          count ++;
        }
      }

      return count;

    }

  }
}
