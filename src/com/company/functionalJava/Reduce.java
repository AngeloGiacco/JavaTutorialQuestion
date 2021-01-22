package com.company.functionalJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reduce {

    private static List<Integer> mergeTwoIntegerLists(List<Integer> list1, List<Integer>list2){
        List<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }

    private static List<Integer> concatenate(List<List<Integer>> lists){
        List<Integer> identity = new ArrayList<>();
        return lists.stream()
             .reduce(identity, Reduce::mergeTwoIntegerLists);
    }

    private static int smaller(Integer a, Integer b){
        return a <= b ? a : b;
    }


    private static int bigger(Integer a, Integer b){
        return a >= b ? a : b;
    }

    private static int findMin(List<Integer> numbers){
        if (numbers.size() == 0) {
            return 0;
        }
        Integer first = numbers.get(0);
        return numbers.stream()
                .reduce(first,Reduce::smaller);
    }

    private static int findMinOrZero(List<Integer> numbers){
        return numbers.stream()
                .reduce(Reduce::smaller)
                .orElse(0);
    }

    private static int findMax(List<Integer> numbers){
        if (numbers.size() == 0) {
            return 0;
        }
        Integer first = numbers.get(0);
        return numbers.stream()
                .reduce(first,Reduce::bigger);
    }

    private static int findMaxOrZero(List<Integer> numbers){
        return numbers.stream()
                .reduce(Reduce::bigger)
                .orElse(0);
    }

    private static int findMinOfMaxes(List<List<Integer>> listOfLists) {
        return listOfLists
                .stream()
                .map(Reduce::findMaxOrZero)
                .reduce(Reduce::smaller)
                .orElse(0);
    }

    public static void main(String[] args) {
        final List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 9);
        final List<Integer> list2 = Arrays.asList(1, 10, 100, 1000, 10000);
        final List<Integer> list3 = Arrays.asList(6, 7, 8);
        final List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        final List<Integer> allIntegers = concatenate(listOfLists);
        final int maxList1 = findMax(list1);
        final int minList2 = findMin(list2);
        final int maxEmpty = findMax(Collections.emptyList());
        final int minEmpty = findMin(Collections.emptyList());
        final int maxOrZeroEmpty = findMinOrZero(Collections.emptyList());
        final int minOrZeroEmpty = findMaxOrZero(Collections.emptyList());
        final int minOfMaxes = findMinOfMaxes(listOfLists);
        final int minOfMaxesEmpty = findMinOfMaxes(Collections.emptyList());
        final int minOfMaxesListOfEmptyLists = findMinOfMaxes(Arrays.asList(Collections.emptyList(), Collections.emptyList()));

        System.out.println(maxList1);
        System.out.println(minList2);
        System.out.println(maxEmpty);
        System.out.println(minEmpty);
        System.out.println(maxOrZeroEmpty);
        System.out.println(minOrZeroEmpty);
        System.out.println(minOfMaxes);
        System.out.println(minOfMaxesEmpty);
        System.out.println(minOfMaxesListOfEmptyLists);
    }
}
