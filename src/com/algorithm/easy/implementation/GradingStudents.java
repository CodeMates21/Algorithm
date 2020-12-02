package com.algorithm.easy.implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

  public static List<Integer> gradingStudents(List<Integer> grades) {

    List<Integer> finalGrade = new ArrayList();

    for(int i=0;i<grades.size();i++){
      if(grades.get(i)<38||grades.get(i)%5<3){
        finalGrade.add(grades.get(i));
      }else if(grades.get(i)%5>2){
        finalGrade.add(grades.get(i)+(5-grades.get(i)%5));
      }

    }
    return finalGrade;
  }

}

public class GradingStudents {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

    List<Integer> result = Result3.gradingStudents(grades);

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
