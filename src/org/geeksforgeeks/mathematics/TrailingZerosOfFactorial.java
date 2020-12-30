package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class TrailingZerosOfFactorial {
    private static int findFactorialTrailingZeroByNaiveApproach(int n) {
        int count = 0;

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        while (factorial % 10 == 0) {
            factorial = factorial / 10;
            count++;
        }
        return count;
    }

    private static int findFactorialTrailingZeroByEfficientApproach(int n) {
        int result = 0;
        for (int i = 5; i <= n; i = i * 5) {
            result = result + n/i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number to check it factorial trailing zero:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
//        System.out.println("No. of Trailing Zeros " + findFactorialTrailingZeroByNaiveApproach(n));
        System.out.println("No. of Trailing Zeros "+findFactorialTrailingZeroByEfficientApproach(n));
    }
}
