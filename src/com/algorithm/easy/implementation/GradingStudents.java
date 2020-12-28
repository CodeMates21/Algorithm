package com.algorithm.easy.implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultGrding {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int startnum = 0;
    int endnum = grades.size();
    int searchnum;
    int restnum;
    String s_searchnum;

    List newgrades = new ArrayList<>();

    for (int i=startnum; i<endnum;i++){

      searchnum = grades.get(i);
      restnum = searchnum % 5; //나머지
      //System.out.println(restnum);

      if (searchnum == 100){ //100
        newgrades.add(searchnum);
      } else if (searchnum < 38){ //38
        newgrades.add(searchnum);
      } else {
        if (restnum >= 3){
          newgrades.add(searchnum + (5 - restnum)); // 나머지만큼 add
        }else {
          newgrades.add(searchnum);
        }
      }
    }
    return newgrades;
  }
}

public class GradingStudents {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
      try {
        return bufferedReader.readLine().replaceAll("\\s+$", "");
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = ResultGrding.gradingStudents(grades);

    bufferedWriter.write(
        result.stream()
            .map(Object::toString)
            .collect(joining("\n"))
            + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}
