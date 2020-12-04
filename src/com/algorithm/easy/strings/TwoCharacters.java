package com.algorithm.easy.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharacters {


  static int alternate(String s) {

    Set set = new HashSet();
    for (int i = 0; i < s.length(); i++) {
      set.add(s.charAt(i));
    }

    List<Character> characterList = new ArrayList<>(set);

    int result = 0;

    for (int i = 0; i < characterList.size(); i++) {
      for (int j = i + 1; j < characterList.size(); j++) {
        char c1 = characterList.get(i);
        char c2 = characterList.get(j);
        String replaceString = s.replaceAll("[^" + c1 + c2 + "]", "");
        if (isAlternating(replaceString)) {
          int l = replaceString.length();
          result = l > result ? l : result;
        }
      }
    }
    return result;
  }

  private static boolean isAlternating(String s) {
    for(int i = 0; i < s.length() - 1; i++) {
      if(s.charAt(i) == s.charAt(i + 1)) {
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {

    int result;
    // 5
//    result = alternate("beabeefeab");
//    System.out.println(result);

    // 8
    result = alternate("asdcbsdcagfsdbgdfanfghbsfdab");
    System.out.println(result);

  }
}
