package com.company;

import java.math.BigInteger;

public class palindromicCubes {
    private static Boolean isPalindrome(String s) {
        int len = s.length();
        Boolean flag = true;
        for (int i = 0; i < len; i++){
            if (s.charAt(i) != s.charAt(len-1-i)){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1500; i++) {
            String cubed = String.valueOf(i * i * i);
            if (isPalindrome(cubed)) {
                System.out.println(i+" cubed is "+cubed);
            }
        }
    }
}
