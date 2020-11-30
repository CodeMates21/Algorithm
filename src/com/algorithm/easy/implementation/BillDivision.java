package com.algorithm.easy.implementation;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {

  static void bonAppetit(List<Integer> bill, int k, int b) {

    int sum = 0;
    for (int i = 0; i < bill.size(); i++) {
      if (bill.get(i) != bill.get(k)) {
        sum += bill.get(i);
      }
    }

    if (sum == 2 * b) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(b-(sum / 2));
    }
  }

  public static void main(String[] args) {

    List<Integer> bill = new ArrayList<>();
    bill.add(3);
    bill.add(10);
    bill.add(2);
    bill.add(9);

    bonAppetit(bill, 1, 12);

  }

}
