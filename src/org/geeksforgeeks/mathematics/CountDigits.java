package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class CountDigits {
    private static int countNumberOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number to check if it is Palindrome or not:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Number digits in the given number: " + countNumberOfDigits(n));

    }
}
