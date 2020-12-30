package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class GCD {
    private static int findGcdByNaive(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
// Let 'b' be smaller than 'a', gcd(a,b)= gcd(a-b,b)
    private static int findGcdByEuclideanAlg(int a, int b){
      while (a!=b){
          if (a>b){
              a= a-b;
          }else{
              b= b-a;
          }
      }
      return a;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a numbers to check their GCD:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

//        System.out.println(findGcdByNaive(a,b));
        System.out.println(findGcdByEuclideanAlg(a,b));
    }
}
