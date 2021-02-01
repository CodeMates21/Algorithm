package com.algorithm.hackerrank.implementation;
import java.io.*;

public class TimeConversion {

  static String timeConversion(String s) {
    String hours = s.substring(0,2);
    boolean am = s.toLowerCase().contains("am");
    //am 12 = 0, pm 12 = 12
    if(am){
      if(hours.equals("12")){
        return "00"+s.substring(2,s.length()-2);
      }
      return s.substring(0,s.length()-2);
    }else{
      if(!hours.equals("12")) {
        return Integer.parseInt(hours)+12+s.substring(2,s.length()-2);
      }
      return hours+s.substring(2,s.length()-2);
    }
  }




  public static void main(String[] args) throws IOException {
//    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] s=new String[]{"01:05:45PM","02:05:45PM","03:05:45PM","04:05:45PM","05:05:45PM"
    ,"06:05:45PM","07:05:45PM","08:05:45PM","09:05:45PM","10:05:45PM","11:05:45PM","12:05:45PM"};
    for(String a: s) {
      String result = timeConversion(a);
      System.out.println(result);
    }
//    bw.write(result);
//    bw.newLine();
//
//    bw.close();
  }
}