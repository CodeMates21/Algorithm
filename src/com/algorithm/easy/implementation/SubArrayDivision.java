package com.algorithm.easy.implementation;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SubArrayDivision {

  // Complete the birthday function below.
  static int birthday(List<Integer> s, int d, int m) {

    int sum = 0;
    int count = 0;

    for(int i=0;i<s.size()-m+1;i++){
      sum = 0;
      for(int j=i;j<i+m;j++){
        sum+=s.get(j);
      }
      if(d==sum)
        count++;
    }

    return count;
  }

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    List<Integer> s = new ArrayList<>();

    for(int i=0;i<n;i++) {
      int a = scanner.nextInt();
      s.add(a);
    }

    int d = scanner.nextInt();

    int m = scanner.nextInt();

    int result = birthday(s, d, m);

    System.out.println(result);
  }
}
