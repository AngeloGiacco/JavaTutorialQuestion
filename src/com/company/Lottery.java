package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    static int NUMBER_OF_LOTTO_NUMBERS = 7;
    static int MAX_VAL = 50;
    static List<Integer> list = new ArrayList<Integer>();
    static Random generator = new Random();

    private static Integer getNum() {
        return generator.nextInt(MAX_VAL) + 1;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= NUMBER_OF_LOTTO_NUMBERS; i++) {
            Integer num = getNum();
            while (list.contains(num)) {
                num = getNum();
            }
            list.add(num);
            System.out.println("Number " + i + " is: " + num);
        }
    }
}
