package com.javaBasic.ch05Array;

public class AdvancedForExample {

  public static void main(String[] args) {
    int scores[] = {95, 72, 84, 93, 87};
    int sum = 0;
    for (int score : scores) {
      sum = sum + score;
    }
    System.out.println("총 합 : " + sum);

  double avg = (double) sum / scores.length;
    System.out.println("점수 평균: " + avg);
}
}


