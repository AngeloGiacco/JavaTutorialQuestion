package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pigLatin {

    private static boolean isPunctuation(Character c){
        return !Character.isDigit(c) && !isVowel(c) && !isConsonant(c);
    }

    private static boolean isVowel(Character c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) >= 0;
    }

    private static boolean isConsonant(Character c) {
        String cons = "zxcvbnmsdfghjklqwrtypZXCVBNMSDFGHJKLQWRTYP";
        return cons.indexOf(c) >= 0;
    }

    private static String convertToLatin(String word) {
        String result;
        Character firstChar = word.charAt(0);
        Character finalChar = word.charAt(word.length()-1);
        Boolean endsWithPunctuation = isPunctuation(finalChar);
        String rest =
                endsWithPunctuation ?
                        word.substring(1,word.length()-1)
                        : word.substring(1);

        if (isVowel(firstChar)) {
            result = firstChar + rest + "way";
        } else if (isConsonant(firstChar)) {
            if (Character.isUpperCase(firstChar)){
                result = rest.substring(0, 1).toUpperCase()
                        + rest.substring(1)
                        + Character.toLowerCase(firstChar)
                        + "ay";
            } else {
                result = rest
                        + Character.toLowerCase(firstChar)
                        + "ay";
            }
        } else {
            result = firstChar + rest;
        }
        return endsWithPunctuation ? result + finalChar : result;
    }

    public static void main(String[] args) throws IOException{
        System.out.println("Enter sentence to be converted to pig latin:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] words = line.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = convertToLatin(words[i]);
        }
        System.out.println(String.join(" ",words));
    }

}
