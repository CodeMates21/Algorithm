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

class Result2 {

  public static int gcd(int a, int b) {
    if (b > a) {
      int temp = b;
      b = a;
      a = temp;
    }
    while (!(b == 0)) {
      int tmp = a % b;
      a = b;
      b = tmp;
    }
    return a;
  }

  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  public static int getTotalX(List<Integer> a, List<Integer> b) {

    int lcm_a = a.get(0);
    int gcd_b = 0;
    int count = 0;
    int number = 1;

    for (int i = 0; i < a.size(); i++) {
      lcm_a = lcm(lcm_a, a.get(i));
    }

    for (int i = b.size() - 1; i >= 0; i--) {
      gcd_b = gcd(b.get(i), gcd_b);
    }

    int num = lcm_a;

    while (num >= lcm_a && num <= gcd_b) {

      if (gcd_b % num == 0) {
        count++;
        number++;
        num = lcm_a * number;
      } else {
        number++;
        num = lcm_a * number;
      }
    }

    return count;
  }
}

public class BetweenTwoSets {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    for(int i=0;i<n;i++)
      a.add(scanner.nextInt());

    for(int i=0;i<m;i++)
      b.add(scanner.nextInt());

    int count = Result2.getTotalX(a,b);

    System.out.println(count);
  }
}
