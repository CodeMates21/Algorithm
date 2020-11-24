package com.algorithm.easy.warmup;

import java.io.*;
import java.text.*;
import java.util.*;

public class TimeConversion {

  static String timeConversion(String s) {

    String time = "";
    time = s.substring(0,8);

    if(s.contains("PM")){
      if(!s.substring(0,2).equals("12")) {
        String hour = s.substring(0, 2);
        time = (Integer.parseInt(hour) + 12) + time.substring(2, 8);
      }
    }
    else if(s.contains("AM")){
      String hour = s.substring(0,2);
      time = String.format("%02d", Integer.parseInt(hour)%12) +time.substring(2,8);
    }

    return time;
  }

  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args)  {

    String s = scan.nextLine();

    System.out.println(timeConversion(s));


  }
}