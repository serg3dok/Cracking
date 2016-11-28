package com.serg3d.Arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Sergey on 11/27/2016.
 */

/*
    Implement an algorithm to determine if a string has unique characters.
    What if you cannot use additional data structures

    Q. is this function case sensitive?
    Q. is this function takes alphanumeric? only english characters? numbers?

    1. buiteforce - nested loop

    2. convert to char array, sort, iterate array




 */


public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("qwertyuiopasdfghjklzxcvbnm,"));
    }

    public static boolean isUnique (String str) {

        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }

        return true;
    }
}
