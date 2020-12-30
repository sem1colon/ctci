package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check if it is Prime or not:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
//        if (isPrimeByNaive(n)) {
//        if (isPrimeByEfficientMethod(n)) {
        if (isPrimeByVeryEfficientMethod(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    private static boolean isPrimeByNaive(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeByEfficientMethod(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeByVeryEfficientMethod(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % i + 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
