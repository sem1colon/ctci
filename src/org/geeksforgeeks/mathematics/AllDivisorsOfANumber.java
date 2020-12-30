package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check it's Divisors:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
//        findDiviorsByNaiveApproach(n);
        findDiviorsByEfficientApproach(n);
//        findDivisorsByMoreEfficientApproach(n);
    }

    static void findDivisorsByMoreEfficientApproach(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    static void findDiviorsByEfficientApproach(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    static void findDiviorsByNaiveApproach(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
