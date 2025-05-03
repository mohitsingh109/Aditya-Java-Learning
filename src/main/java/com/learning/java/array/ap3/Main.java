package com.learning.java.array.ap3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //4 X 3
        int[][] arr2D = { { 0, 1, 2 },
                            { 3, 4, 5 },
                            { 6, 7, 8 },
                            { 9, 5, 3 } };

        int[] column = ArrayTester.getColumn(arr2D, 2);

        System.out.println(Arrays.toString(column));


        int[][] square = { { 1, 2, 3 },
                            { 2, 3, 1 },
                            { 3, 1, 2 },
                        };

        int[][] square1 = { { 1, 2, 1 },
                            { 2, 3, 1 },
                            { 3, 1, 2 },
        };

        System.out.println(ArrayTester.isLatin(square1));
    }
}
