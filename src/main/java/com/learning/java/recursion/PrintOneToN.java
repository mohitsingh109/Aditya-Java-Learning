package com.learning.java.recursion;

public class PrintOneToN {

    //n = 5  1, 2, 3, 4, 5
    public void print(int n) {
        // base condition
        if(n == 0)
            return;
        //recursion call
        print(n - 1);

        // logic
        System.out.println(n);
    }

    // n = 10
    // 2, 4, 6, 8, 10
    public void printEven(int n) {
        // base condition
        if(n == 0)
            return;
        //recursion call
        printEven(n - 1);

        if(n % 2 == 0) {
            System.out.println(n);
        }
    }

    // n = 5 ==> 5, 4, 3, 2, 1
    public void printDec(int n) {
        // base condition
        if(n == 0)
            return;

        // logic
        System.out.println(n);

        //recursion call
        printDec(n - 1);
    }

    // n = 4 ( 4 * 3 * 2 * 1)
    public int factorial(int n) {
        //base
        if (n == 0) return 1;

        //logic + //recursion
        return n * factorial(n - 1);
    }
//                  i
    // int[] arr = {1, 2, 4 ,9} ==> print (9, 4, 2, 1)
    public void printInReverse(int[] arr, int index) {
        // base
        if (arr.length == index) return;

        printInReverse(arr, index + 1);

        System.out.println(arr[index]);
    }

    // int[] arr = {1, 2, 4 ,9} ==> 16
    public int calculateSum(int[] arr, int index) {
        if (arr.length == index) return 0;

        return arr[index] + calculateSum(arr, index + 1);
    }
    //       0123
    // str = ABCD  return = DCBA
    // substring(1), charAt(2)

    /**
     *
     * ABCD ==> DCBA
     * BCD ==>
     * CD ==> DC
     *
     *
     */
    public String revers(String str) {
        //base condition
        if(str.isEmpty()) return str;

        return revers(str.substring(1)) + str.charAt(0);
    }

    // Palindrome Str
    // MAM

    public boolean isPalindrome(String str, int left, int right) {
        // base condition
        if(left >= right) return true;

        if(str.charAt(left) != str.charAt(right)) return false;

        return isPalindrome(str, left + 1, right - 1);
    }

    // String[] array = {"MAM", "AA", "BB", "ABC"} print all valid palindrome string
    public void isPalindrome(String[] strArray) {
        for (String str : strArray) {
            if(isPalindrome(str, 0, str.length() - 1)) {
                System.out.println(str);
            }
        }
    }



    public static void main(String[] args) {
        PrintOneToN printOneToN = new PrintOneToN();
        //printOneToN.printDec(10);
        //System.out.println(printOneToN.factorial(5));
        int[] arr = {1, 3, 5, 9};
        //printOneToN.printInReverse(arr, 0);
        //System.out.println(printOneToN.calculateSum(arr, 0));
        //System.out.println(printOneToN.revers("Karan"));
        String str = "MAM";
        //System.out.println(printOneToN.isPalindrome(str, 0, str.length() - 1));
        String[] strArr = {"MAM", "CB", "AA", "KKAKK", "ABC"};
        printOneToN.isPalindrome(strArr);
    }
}
