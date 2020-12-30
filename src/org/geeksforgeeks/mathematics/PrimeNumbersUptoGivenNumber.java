package org.geeksforgeeks.mathematics;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbersUptoGivenNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number to print it's prime numbers:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        // Naive Solution
//        printPrimeNumbersUptoGivenNumberByNaiveApproach(n);
// Optimized Approach
        sieveOfEratosthenes(n);
    }


    static void printPrimeNumbersUptoGivenNumberByNaiveApproach(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        if ((n == 2) || (n == 3)) {
            return true;
        }
        if ((n % 2 == 0) || (n % 3 == 0)) {
            return false;
        }
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    static void sieveOfEratosthenes(int n) {
        if (n <= 1) {
            return;
        }
        boolean primeNumbersUptoGivenNumber[] = new boolean[n + 1];
        Arrays.fill(primeNumbersUptoGivenNumber, true);
        for (int i = 2; i * i <= n; i++) {
            if (primeNumbersUptoGivenNumber[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    primeNumbersUptoGivenNumber[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primeNumbersUptoGivenNumber[i])
                System.out.print(i + " ");
        }
    }
}
