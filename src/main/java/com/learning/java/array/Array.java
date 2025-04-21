package com.learning.java.array;

public class Array {

    public static void main(String[] args) {

        int[] arr1D = {10, 20, 40};
        int[][] arr2D = { {20, 30, 40}, {50, 60, 70} };

        for(int i = 0; i < arr1D.length; i++) {
            System.out.println(arr1D[i]);
        }

        // for each loop
        for(int value: arr1D) {
            System.out.println(value);
        }

        // row
        for(int row = 0; row < arr2D.length; row++) {
            for(int col = 0; col < arr2D[row].length; col++) {
                System.out.println(arr2D[row][col]);
            }
        }

        // row
        for(int row = 0; row < arr2D.length; row++) {
            for(int val : arr2D[row]) {
                System.out.println(val);
            }
        }

    }
}
