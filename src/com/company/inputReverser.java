package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class inputReverser {
    private static final int MAX_LENGTH = 100;

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter some text to be reversed:");
        String[] strings = new String[MAX_LENGTH];
        final Deque<String> deck = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int counter = 0;
        while (line.length() > 0 && counter < MAX_LENGTH) {
            strings[counter] = line;
            counter++;
            deck.push(line);
            line = br.readLine();
        }
        for (int i = counter - 1; i >= 0; i--){
            System.out.println(strings[i]);
            line = deck.pop();
            System.out.println(line);
        }
    }
}
