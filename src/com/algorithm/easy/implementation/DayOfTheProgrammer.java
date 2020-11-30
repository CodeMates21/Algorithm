package com.algorithm.easy.implementation;

public class DayOfTheProgrammer {

  static String dayOfProgrammer(int year) {
    String date = "";
    if (year < 1918) {
      date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
    } else if (year == 1918) {
      date += "26.09." + year;
    } else {
      date += (year % 400 == 0) || (year % 4 == 0) && (year % 100) != 0 ? "12.09." + year : "13.09." + year;
    }

    return date;
  }
  /*
  year = 1800
  result = 12.09.1800

  year = 2017
  result = 13.09.2017

  year = 2016
  result = 12.09.2016
  */

  public static void main(String[] args) {

    int year = 1700;

    String result = dayOfProgrammer(year);

    System.out.println(result);
  }
}
