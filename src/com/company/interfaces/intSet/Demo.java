package com.company.interfaces.intSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static IntSet readIntegers(int n) throws IOException {
        final IntSet result = (n > 10 ? new MemoryEfficientSet() : new SpeedEfficientSet());

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number "+(i+1)+":");
            result.add(scanner.nextInt());
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the number of numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntSet set = readIntegers(Integer.parseInt(br.readLine()));
        Integer number;
        System.out.println(set instanceof SpeedEfficientSet ? "SpeedEfficientSet" : "MemoryEfficientSet");
        while (true) {
            System.out.println("Enter an int, to be tested for membership:");
            String line = br.readLine();
            if (line == null) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("Set contains " + Integer.valueOf(line) + ": "
                    + set.contains(Integer.parseInt(line)));

        }
    }
}
