package com.algorithm.easy.warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

  public static int diagonalDifference(List<List<Integer>> arr) {

    int firstDiagonalSum = 0;
    int secondDiagonalSum = 0;
    int difference = 0;

    for(int i=0;i<arr.size();i++){
      firstDiagonalSum+=arr.get(i).get(i);
    }
    for(int j=arr.size() - 1; j>=0 ; j--){
      secondDiagonalSum+=arr.get(j).get(arr.size() -j - 1);
    }


//    Math.abs(firstDiagonalSum-secondDiagonalSum);  -> 절댓값
    difference = firstDiagonalSum-secondDiagonalSum;
    if(difference>0)
      return difference;
    else
      return difference*-1;

  }

}

class DiagonalDifference {
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
