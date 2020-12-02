package com.algorithm.easy.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 모든 입력 값들 중 가장 큰 수를 X 표시로 바꿔 출력
// 단, 가장자리에 있는 수는 제외한다
public class CavityMap1 {

  static String[] cavityMap(String[] grid) {

    String[][] input = new String[grid.length][grid.length];
    String[] result = new String[grid.length];

    int max = -1;
    ArrayList<Integer> row = new ArrayList<>();
    ArrayList<Integer> column = new ArrayList<>();

    for (int i=0;i<grid.length;i++){
      for (int j=0;j<grid.length;j++){
        input[i][j] = String.valueOf(grid[i].charAt(j));
        if(max<Integer.parseInt(input[i][j])){
          max = Integer.parseInt(input[i][j]);

          row.clear();
          column.clear();

          row.add(i);
          column.add(j);
        }else if(max==Integer.parseInt(input[i][j])){
          row.add(i);
          column.add(j);
        }
      }
    }

    for(int i=0;i<row.size();i++){
      if(row.get(i)!=0&&row.get(i)!=grid.length-1&&column.get(i)!=0&&column.get(i)!=grid.length-1){
        input[row.get(i)][column.get(i)] = "X";
      }
    }

    for(int i=0;i<grid.length;i++){
      result[i] = "";
      for(int j=0;j<grid.length;j++){
        result[i] += input[i][j];
      }
    }

    return result;

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
 //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String[] grid = new String[n];

    for (int i = 0; i < n; i++) {
      String gridItem = scanner.nextLine();
      grid[i] = gridItem;
    }

    String[] result = cavityMap(grid);


    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]);

      if (i != result.length - 1) {
        System.out.println();
      }
    }

//    bufferedWriter.newLine();
//
//    bufferedWriter.close();

    scanner.close();
  }
}
