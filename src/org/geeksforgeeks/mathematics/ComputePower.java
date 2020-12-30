package org.geeksforgeeks.mathematics;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        System.out.println("Please enter m value & n value numbers to compute power:");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        computePowerByIterative(m,n);
     }

     static void computePowerByIterative(int x, int n){
        int result = 1;
        while (n>0){
            if(n%2!=0){
                result = result * x;
            }
            x = x * x;
            n = n/2;
        }
         System.out.println(result);
     }
}
