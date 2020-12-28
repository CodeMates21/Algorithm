package com.algorithm.easy.warmup;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

  static String timeConversion(String s) {
    /*
     * Write your code here.
     */

    String hr = "";
    String min = "";
    String sec = "";
    String amPm = "";

    String[] time = s.split(":");
    hr = time[0];
    min = time[1];
    sec = time[2].substring(0, 2);
    amPm = time[2].substring(2, 4);

    if ("PM".equals(amPm) && !("12".equals(hr))) {
      hr = String.valueOf(Integer.parseInt(hr) + 12);
    } else if ("AM".equals(amPm) && "12".equals(hr)) {
      hr = "00";
    }
    hr = hr + ":" + min + ":" + sec;

    return hr;

  }

  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    String result = timeConversion("10:12:00AM");

    System.out.println(result);
  }
}