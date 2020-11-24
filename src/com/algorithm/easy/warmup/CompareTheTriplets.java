package com.algorithm.easy.warmup;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    List<Integer> score = new ArrayList<>();
    int aScore = 0;
    int bScore = 0;

    for(int i=0;i < a.size();i++){
      if(a.get(i)>b.get(i))
        aScore+=1;
      else if(a.get(i)<b.get(i))
        bScore+=1;
    }

    score.add(aScore);
    score.add(bScore);

    return score;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = compareTriplets(a, b);

    bufferedWriter.write(
        result.stream()
            .map(Object::toString)
            .collect(joining(" "))
            + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}
