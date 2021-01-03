package com.javaBasic.ch05ReferenceType;

public class ch05test4 {
  public static void main(String[] args){
    int max = 0;
    int[] array = {1, 5, 3, 8, 2};
    //작성 위치
    //주어진 배열 항목의 최대값
    for(int i=0; i<array.length; i++){
      if(max<array[i]){
        max=array[i];
      }
    }
    System.out.println("max: " + max);
  }

}
