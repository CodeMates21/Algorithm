package com.algorithm.easy.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            min+=arr[i];
        }

        for(int j= arr.length-1; j>0; j--){
            max+=arr[j];
        }

        System.out.println(min+" "+max);



    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,7,9};

        miniMaxSum(arr);

    }
}