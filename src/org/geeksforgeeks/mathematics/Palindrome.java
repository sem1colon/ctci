package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(int givenNumber) {
        int temp = givenNumber;
        int reverseNumber = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp = temp / 10;
        }
        return (givenNumber == reverseNumber);
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number to check if it is Palindrome or not:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is not a Palindrome number.");
        }
    }
}
