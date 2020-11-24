package com.algorithm.easy.warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result1 {

  public static int birthdayCakeCandles(List<Integer> candles) {

    int max = candles.get(0);
    int count = 0;

    for(int i=0;i<candles.size();i++){
      if(max<candles.get(i)){
        max = candles.get(i);
        count=1;
      }
      else if(max==candles.get(i))
        count++;
    }

    return count;

  }

}

public class BirthdayCakeCandles {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = Result1.birthdayCakeCandles(candles);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
