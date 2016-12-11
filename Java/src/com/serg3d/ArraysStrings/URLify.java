package com.serg3d.ArraysStrings;

import java.util.Arrays;

/**
 * Created by Sergey on 12/11/2016.
 */

/*
    Write a method to replace all spaces with "$20"


 */

public class URLify {
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    "));
    }



    //iterate from the end, move chars to the end
    public static String urlify(String input) {
        char[] chars = input.toCharArray();
        int p1, p2; // p1 - pointer 1 (reader), p2 - pointer 2 (writer)
        p1 = p2 = chars.length-1;
        while (chars[p1] == ' ') {
            p1--;
        }
        while (p1 > -1) {
            if (chars[p1] != ' ') {
                chars[p2] = chars[p1];
                p1--;
                p2--;
            }
            else {
                chars[p2] = '0';
                p2--;
                chars[p2] = '2';
                p2--;
                chars[p2] = '$';
                p2--;
                p1--;
            }
        }
        return new String(chars);
    }


    // split by spaces, build new string
    public static String urlify1(String input) {
        //char[] chars = input.toCharArray();
        String[] words = input.split(" ");
        int numSpaces = words.length - 1;
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            result += "$20";
            result += words[i];
        }
        return result;
    }
}
