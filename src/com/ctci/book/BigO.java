package com.ctci.book;
public class BigO {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }


    static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }

    public static void main(String[] args) {
//        printPairs(array);
        printUnorderedPairs(array);
    }
}
