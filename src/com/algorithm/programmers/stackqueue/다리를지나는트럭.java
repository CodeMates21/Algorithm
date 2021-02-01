package com.algorithm.programmers.stackqueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class 다리를지나는트럭 {
  public static int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    Queue<Integer> q = new ConcurrentLinkedQueue<>();
    int sum = 0;
    for(int t : truck_weights) {
      while(true) {
        if(q.isEmpty()) {
          q.add(t);
          sum += t;
          answer++;
          break;
        } else if(q.size() == bridge_length) {
          sum -= q.poll();
        } else {
          if(sum + t > weight) {
            answer++;
            q.add(0);
          } else {
            q.add(t);
            sum+=t;
            answer++;
            break;
          }
        }
      }
    }
    return answer + bridge_length;
  }

  public static void main(String[] args) {
    solution(13,40,new int[]{4,7,3,12,3,5,4,7,3,2});
  }
}
