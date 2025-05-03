package com.learning.java.array.ap3;

public class ArrayTester {

    public static int[] getColumn(int[][] arr2d, int c) {
        int[] column = new int[arr2d.length]; // [_,_,_,_]

        for(int r = 0; r < arr2d.length; r++) {
            column[r] = arr2d[r][c];
        }

        return column;
    }

    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        // arr1 = [100, 20, 40]
        // arr2 = [40, 20, 10]
        for(int i = 0; i < arr1.length; i++) { // iterate over arr1
            int value = arr1[i]; // 100
            //search if 10 is present
            boolean found = false;
            for(int j = 0; j < arr2.length; j++) { // iterate over arr2 and search if value is present
                if(arr2[j] == value) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return false;
            }
        }

        return true;
    }

    public static boolean containsDuplicates(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isLatin(int[][] square) {

        int[] firstRow = square[0];

        //condition 1 is sorted
        if(containsDuplicates(firstRow)) {
            return false;
        }

        // Condition 2: [first row value should be present in all the rows]
        for(int r = 1; r < square.length; r++) {
            if(!hasAllValues(firstRow, square[r])) {
                return false;
            }
        }

        // Condition 3: [first row value should be present in all the columns]
        for(int col = 0; col < square[0].length; col++) {
            int[] columnsValue = getColumn(square, col);

            if(!hasAllValues(firstRow, columnsValue)) {
                return false;
            }
        }

        return true;
    }
}
