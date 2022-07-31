package com.bsamuel.exercise.string;

public class StringContainsDigitsOnly {

    public static boolean StringContainsDigitsOnly(String str) {
        for (int i = 0; i < str.length(); i ++ ) {
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
