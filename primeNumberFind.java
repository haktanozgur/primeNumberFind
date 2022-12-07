package com.haktanozgur.primeNumberFind;

import java.util.Scanner;

public class primeNumberFind {
	
    public static boolean isPrime(int n, int i) {

      if (n <= 2) 
          return (n == 2) ? true : false; 
      if (n % i == 0) 
          return false; 
      if (i * i > n)

           return true;
      
       return isPrime(n, i + 1);
   }

   public static void main(String[] args)  {  
      Scanner scanner = new Scanner(System.in);
   
      for(int i = 0; i<20; i++) {
      System.out.println("Bir sayı giriniz");
      int value = scanner.nextInt();
      if (isPrime(value, 2))
        System.out.println("Asal sayıdır !");
      else
        System.out.println("Asal sayı değildir !");
      }
   }
}
	


