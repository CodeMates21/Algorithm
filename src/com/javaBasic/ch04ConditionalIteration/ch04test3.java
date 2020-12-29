package com.javaBasic.ch04ConditionalIteration;

public class ch04test3 {

  public static void main(String[] args) {
    while(true) {
      int eye1 = (int) (Math.random() * 6) + 1;
      int eye2 = (int) (Math.random() * 6) + 1;
      System.out.println("(" + eye1 + ")" + "(" + eye2 + ")");
      if ((eye1 + eye2) == 5) {
        break;
      }
    }
  }
}
//    오답
//    int eyeSum=0;
//    int eye1;
//    int eye2;
//
//    while(eye1)+(eye2)!=5){
//      eye1=(int)(Math.random()*6)+1;
//      eye2=(int)(Math.random()*6)+1;
//      System.out.println("("+eye1+")"+"("+eye2+")");
//      if(((eye1)+(eye2))=5){
//        break;
//      }
//    }
