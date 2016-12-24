package com.serg3d.ArraysStrings;

import java.util.Arrays;

/**
 * Created by Sergey on 12/23/2016.
 */
public class PalindromePermutations {
    /* check if given string is palindrome permutation

        p a r p a
        a a r p p
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("parra"));
    }

    public static boolean isPalindrome(String str) {

        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);

        boolean m = false;
        for(int i = 0; i < strChars.length-1; i++) {
            if (strChars[i] != strChars[i+1]) {
                if (m == true) return false;
                else {
                    m = true;
                    i--;
                }

            }
            i++;
        }

        return true;

    }



}
