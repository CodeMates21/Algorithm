package com.algorithm.easy.warmup;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

  static String timeConversion(String s) {

    String time = s.substring(0, s.length()-2);
    String [] timeSplit = time.split(":");
    String hour  = timeSplit[0];
    if (s.contains("PM")) {
      if (Integer.parseInt(hour) != 12) {
        hour  = Integer.toString(Integer.parseInt(timeSplit[0]) + 12);
        time = hour + s.substring(2, s.length()-2);
      }
    } else if (s.contains("AM")) {
      if (Integer.parseInt(hour) + 12 == 24) {
        time = "00" + s.substring(2, s.length()-2);
      }
    }


    return time;
  }


  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    String result = timeConversion("06:12:00PM");

    System.out.println(result);
  }
}
