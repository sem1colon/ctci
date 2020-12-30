package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class Factorial {
    private static int findFactorialRecursively(int n){
        int factorial = 1;
        if(n==0){
            return 1;
        }
        return n * findFactorialRecursively(n-1);
    }
    private static int findFactorialIteratively(int n){
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number to check factorial:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
//        System.out.println("Factorial of the given number is "+findFactorialIteratively(n));
        System.out.println("Factorial of the given number is "+findFactorialRecursively(n));
    }
}
