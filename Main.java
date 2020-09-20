
/* 
Lab 4: 
Damon Nicholas and McKenzie Custer
Date 9/20/2020
*/

import java.util.Random;

class Main {

  public static void main(String[] args) {
  
    Random n = new Random();

    int randomNum = n.nextInt(50) + 1;
    System.out.println("The Random Number is:" + randomNum);

    for (int count = randomNum; count >=0; count --)
    System.out.println(" " + count);

      if (randomNum < 25)
        System.out.println("Ahoy mateys!");

      else if (randomNum >= 25 && randomNum <= 42)
        System.out.println("Cannonball!1!!");
      
      else if (randomNum > 42)
        System.out.println("Blast Off!");


  }
}