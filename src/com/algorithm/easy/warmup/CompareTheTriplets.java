package com.algorithm.easy.warmup;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CompareTheTriplets {

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> pointList = new ArrayList<>();
    int aPoint=0;
    int bPoint=0;
    for(int i=0; i<a.size(); i++){
      if(a.get(i)<b.get(i)) {
        bPoint++;
      }else if(a.get(i)>b.get(i)){
        aPoint++;
      }
    }
    pointList.add(aPoint);
    pointList.add(bPoint);

    return pointList;
  }

  public static void main(String[] args) throws IOException {

    List<Integer> integer1 = new ArrayList<>();
    List<Integer> integer2 = new ArrayList<>();

    integer1.add(2);
    integer1.add(3);
    integer1.add(9);

    integer2.add(7);
    integer2.add(1);
    integer2.add(10);

    List<Integer> result = compareTriplets(integer1, integer2);

    System.out.println(result);
  }
}