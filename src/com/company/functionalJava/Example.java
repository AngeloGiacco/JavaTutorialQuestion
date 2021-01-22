package com.company.functionalJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    private static String reverse(String word){
        StringBuilder result = new StringBuilder();
        result.append(word);
        return result.reverse().toString();
    }

    private static Boolean firstCharIsDigit(String chars){
        if (chars.length() > 0) {
            if (Character.isDigit(chars.charAt(0))){
                return true;
            }
        }
        return false;
    }

    private static Double sqrtFirstDigit(String word){
        return Math.sqrt(Character.getNumericValue(word.charAt(0)));
    }

    private static List<String> reverseEachString(List<String> input){
        return input.stream()
                .map(Example::reverse)
                .collect(Collectors.toList());
    }

    private static List<String> reverseEachString2(List<String> input){
        return input.stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.toList());

    }

    private static List<Double> sqrtsOfFirstDigits(List<String> input){
        return input.stream()
                .filter(Example::firstCharIsDigit)
                .map(item -> item.substring(0,1))
                .map(item -> Integer.parseInt(item))
                .map(item -> Math.sqrt(item))
                .collect(Collectors.toList());
    }

    private static List<Double> sqrtsOfFirstDigits2(List<String> input){
        return input.stream()
                .filter(Example::firstCharIsDigit)
                .map(Example::sqrtFirstDigit)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("this","will","all","be","reversed");
        System.out.println(reverseEachString(words));
        System.out.println(reverseEachString2(words));
        List<String> numbers = Arrays.asList("123","456","987","notanumber","888","");
        System.out.println(sqrtsOfFirstDigits(numbers));
        System.out.println(sqrtsOfFirstDigits2(numbers));
    }
}
