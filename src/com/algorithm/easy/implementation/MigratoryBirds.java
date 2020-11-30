package com.algorithm.easy.implementation;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
/*
  arr: an array of integers representing types of birds sighted
*/

  static int migratoryBirds(List<Integer> arr) {

    int[] birdTypeArr = new int[5];

    for (int i = 0; i < arr.size(); i++) {
      birdTypeArr[arr.get(i) - 1]++;
    }

    int result = 0;
    int birdCount = 0;

    for (int i = 0; i < birdTypeArr.length; i++) {
      if (birdCount < birdTypeArr[i]) {
        birdCount = birdTypeArr[i];
        result = i + 1;
      }
    }

    return result;
  }

  public static void main(String[] args) {

    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(4);
    arr.add(4);
    arr.add(4);
    arr.add(5);
    arr.add(3);

    int result = migratoryBirds(arr);

    System.out.println(result);
  }

}
