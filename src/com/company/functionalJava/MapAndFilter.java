package com.company.functionalJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFilter {

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
                .map(MapAndFilter::reverse)
                .collect(Collectors.toList());
    }

    private static List<String> reverseEachString2(List<String> input){
        return input.stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.toList());

    }

    private static List<String> reverseEachStringMonolith(List<String> input){
        return input.stream()
                .map(item -> new  StringBuilder(item).reverse().toString())
                .collect(Collectors.toList());
    }

    private static List<Double> sqrtsOfFirstDigits(List<String> input){
        return input.stream()
                .filter(MapAndFilter::firstCharIsDigit)
                .map(item -> item.substring(0,1))
                .map(Integer::parseInt)
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

    private static List<Double> sqrtsOfFirstDigits2(List<String> input){
        return input.stream()
                .filter(MapAndFilter::firstCharIsDigit)
                .map(MapAndFilter::sqrtFirstDigit)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("this","will","all","be","reversed");
        System.out.println(reverseEachString(words));
        System.out.println(reverseEachString2(words));
        List<String> numbers = Arrays.asList("123","456","987","notanumber","888","");
        System.out.println(sqrtsOfFirstDigits(numbers));
        System.out.println(sqrtsOfFirstDigits2(numbers));
        List<String> reverseTest = Arrays.asList("siht","lliw","lla","eb","desrever");
        List<Double> sqrtTest = Arrays.asList(Math.sqrt(1),Math.sqrt(4),Math.sqrt(9),Math.sqrt(8));
        assert reverseTest.equals(reverseEachString(words));
        assert reverseTest.equals(reverseEachString2(words));
        assert reverseTest.equals(reverseEachStringMonolith(words));
        assert sqrtTest.equals(sqrtsOfFirstDigits(numbers));
        assert sqrtTest.equals(sqrtsOfFirstDigits2(numbers));
    }
}
