package com.algorithm.easy.implementation;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 입력 된 값이 인접한 숫자중 가장 큰 경우 X로 바꿔 출력
// 단, 가장자리에 있는 수는 제외한다
public class CavityMap {

  static String[] cavityMap(String[] grid) {

    String[][] input = new String[grid.length][grid.length];
    String[] result = new String[grid.length];

    ArrayList<Integer> row = new ArrayList<>();
    ArrayList<Integer> column = new ArrayList<>();

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        input[i][j] = String.valueOf(grid[i].charAt(j));
      }
    }

    for (int i = 1; i < grid.length - 1; i++) {
      for (int j = 1; j < grid.length - 1; j++) {
        if (Integer.parseInt(input[i][j]) > Integer.parseInt(input[i - 1][j])
            && Integer.parseInt(input[i][j]) > Integer.parseInt(input[i + 1][j])
            && Integer.parseInt(input[i][j]) > Integer.parseInt(input[i][j - 1])
            && Integer.parseInt(input[i][j]) > Integer.parseInt(input[i][j + 1])) {
            input[i][j] = String.valueOf(input[i][j]);
            row.add(i);
            column.add(j);
        }
      }
    }

    for(int i=0;i<row.size();i++){
      input[row.get(i)][column.get(i)] = "X";
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
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String[] grid = new String[n];

    for (int i = 0; i < n; i++) {
      String gridItem = scanner.nextLine();
      grid[i] = gridItem;
    }

    String[] result = cavityMap(grid);

    for (int i = 0; i < result.length; i++) {
      bufferedWriter.write(result[i]);

      if (i != result.length - 1) {
        bufferedWriter.write("\n");
      }
    }

    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
