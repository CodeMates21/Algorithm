package com.algorithm.easy.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //int result[] = new int[a.size()+1];
        List<Integer> result = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.add(0, ++count1);
            } else if (a.get(i) < b.get(i)) {
                result.add(1, ++count2); //여기 안에서 add를 하면 runtime error 발생
            } else if (a.get(i) == b.get(i)) {
                continue;
            }
        }

        return result;

    }

    public static void main(String[] args) throws IOException {

        List<Integer> integer1 = new ArrayList<>();
        List<Integer> integer2 = new ArrayList<>();

        integer1.add(5);
        integer1.add(6);
        integer1.add(7);

        integer2.add(3);
        integer2.add(6);
        integer2.add(10);

        List<Integer> result = compareTriplets(integer1, integer2);

        System.out.println(result);
    }
}