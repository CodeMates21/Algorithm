package com.algorithm.hackerrank.implementation;

import java.util.PriorityQueue;

public class DiskController {
  class Job implements Comparable<Job>{
    private int inTime;
    private int duringTime;

    public Job(int inTime, int duringTime) {
      this.inTime = inTime;
      this.duringTime = duringTime;
    }

    @Override
    public int compareTo(Job job) {
      if(this.inTime<job.inTime){
        return -1;
      }else if(this.inTime==job.inTime){
        return 0;
      }else{
        return 1;
      }
    }
  }

  public int solution(int[][] jobs) {
    int answer = 0;
    PriorityQueue<Job> priorityQueue = new PriorityQueue<>();
    for(int[] job:jobs) priorityQueue.offer(new Job(job[0],job[1]));




    return answer;
  }

  public void main(String[] args) {

  }
}
