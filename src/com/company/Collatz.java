package com.company;

public class Collatz {
    private static int next(int x) {
        return ((x % 2) == 0) ? (x / 2) : (3 * x + 1);
    }

    public static void main(String[] args) {
        assert args.length == 1 : "wrong amount of arguments supplied";
        int n = Integer.parseInt(args[0]);
        while (n > 1) {
            System.out.print(n + " ");
            n = next(n);
        }
        System.out.println(n);
    }
}
