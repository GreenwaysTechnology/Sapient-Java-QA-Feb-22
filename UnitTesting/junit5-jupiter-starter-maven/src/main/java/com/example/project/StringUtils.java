package com.example.project;

public class StringUtils {
    public static boolean isPalindrome(String candidate) {
        String rev = "";
        int length = candidate.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + candidate.charAt(i);
        if (candidate.equals(rev))
            return true;
        return false;
    }
}
