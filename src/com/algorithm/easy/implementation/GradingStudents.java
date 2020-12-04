package com.algorithm.easy.implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

  static class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
      List<Integer> finalGrade = new ArrayList<>();

      for (int i = 0; i < grades.size(); i++) {
        int remainder = grades.get(i) % 5;
        if (grades.get(i) < 33 || remainder <= 2) {
          finalGrade.add(grades.get(i));
        } else {
          finalGrade.add(grades.get(i) + 5 - remainder);
        }
      }

      return finalGrade;
    }

  }

  public static void main(String[] args){
    List<Integer> grades = new ArrayList<>();
    grades.add(73);
    grades.add(67);
    grades.add(38);
    grades.add(33);
    List<Integer> result = Result.gradingStudents(grades);
    System.out.println(result);

  }
}
