package org.geeksforgeeks.contest.problems.flipkart;

import java.util.Arrays;

// Java program for finding smallest number
// from digits of given number
public class RearrangeTheDigits {

    // function to find the smallest number
    public static String findSmallestNumberCombination(String N)
    {
        char smallestNum[] = N.toCharArray();
        Arrays.sort(smallestNum);

        // check for leading zero in string
        // if there are any leading zeroes,
        // swap the first zero with first non-zero
        // number
        int i = 0;
        while (smallestNum[i] == '0')
            i++;

        char temp = smallestNum[0];
        smallestNum[0] = smallestNum[i];
        smallestNum[i] = temp;

        String result = new String(smallestNum);
        return result;
    }

    // Driver Program
    public static void main(String args[])
    {
        String num = "846903";
        System.out.println(findSmallestNumberCombination(num));
    }
}
