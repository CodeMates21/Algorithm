package com.algorithm.programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수 {
  public int[] solution2(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for(int i=0; i<commands.length; i++){
      int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
      Arrays.sort(temp);
      answer[i] = temp[commands[i][2]-1];
    }

    return answer;
  }

  public int[] solution(int[] array,  int[][] commands){
    ArrayList<Integer> resultArrayList = new ArrayList<>();
    for(int[] command:commands){
        ArrayList<Integer> tempArrayList = new ArrayList<>();
        for(int i=command[0]-1;i<command[1];i++){
          tempArrayList.add(array[i]);
        }
        Collections.sort(tempArrayList);
        resultArrayList.add(tempArrayList.get(command[2]-1));
    }
    int[] array2 = new int[resultArrayList.size()];

    int size=0;

    for(int temp : resultArrayList){

      array2[size++] = temp;

    }
    return array2;
  }
  public static void main(String[] args) {
    K번째수 k번째수 = new K번째수();

    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
    k번째수.solution(array,commands);
    System.out.println("awefawef");
  }
}
