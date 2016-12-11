package com.serg3d.ArraysStrings;

import java.util.Arrays;

/**
 * Created by Sergey on 12/11/2016.
 */

/*
    Given 2 strings
    Write a method to decide if one is permutation of the other.


    1. create char arrays, sort, iterate each char

 */


public class CheckPermutations {

    public static void main(String[] args) {
        System.out.println(checkPermutations("qwerty", "ytrewq"));
    }

    public static boolean checkPermutations(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

    }


}
