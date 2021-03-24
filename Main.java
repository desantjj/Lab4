/*
Lab 4
Partners: Mengfan Lyu and Joseph DeSantis
Date: 2/9/21
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {

    int max = 50;
    int min = 1;
    Random randomNum = new Random();

    int s = randomNum.nextInt (max) % (max - min + 1) + min;
    System.out.println("The random number is: " + s);

    int b = s;
    if (b <= 5) {
      int i = b;
      while (i >= 0) {
        if (i > 0) {
          System.out.println(i);
          i--;
        }
        else {
          System.out.println(i);
          System.out.println("Ahoy mateys!");
          i--;
        }
      }
    }
    else if (42>b&&b>25) {
      int i = b;
      while (i >= 0) {
        if (i > 0) {
          System.out.println(i);
          i--;
        }
        else {
          System.out.println(i);
          System.out.println("Cannonball!");
          i--;
        }
      }
    }
    else {
      int i = b;
      while (i >= 0) {
        if (i > 0) {
          System.out.println(i);
          i--;
        }
        else {
          System.out.println(i);
          System.out.println("Blast off!");
          i--;
        }
      } 
    }
  }
}