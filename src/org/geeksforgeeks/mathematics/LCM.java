package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class LCM {

    public static int findLcmByNaive(int a, int b) {
        int result = Math.max(a, b);
        while (true) {
            if (result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }
        return result;
    }

    private static int findLcmByEuclideanAlg(int a, int b) {
        return (a * b) / findGcdByEuclideanAlg(a, b);

    }

    private static int findGcdByEuclideanAlg(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a numbers to check their LCM:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

//        System.out.println(findLcmByNaive(a, b));
        System.out.println(findLcmByEuclideanAlg(a, b));
    }
}
