package com.algorithm.easy.implementation;

public class BreakingTheRecords {

  static int[] breakingRecords(int[] scores) {
    int highest = scores[0];
    int lowest = scores[0];

    int highestCount = 0;
    int lowestCount = 0;

    for (int i=1; i < scores.length; i++) {
      if(highest < scores[i]) {
        highestCount++;
        highest = scores[i];
      }

      if(scores[i] < lowest) {
        lowestCount++;
        lowest = scores[i];
      }
    }

    return new int[]{highestCount, lowestCount};
  }


  public static void main(String[] args) {

    int[] scores = new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1};

    int[] result = breakingRecords(scores);

    System.out.println(result[0] + " " + result[1]);
  }

}
