package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class wordCount {
    public static void main(String[] args) throws IOException{
        List<List<String>> listOfLines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (line.length() > 0) {
            listOfLines.add(Arrays.asList(line.split("\\P{IsAlphabetic}+")));
            line = br.readLine();
        }
        int lineCount = listOfLines.size();
        int wordCount = 0;
        int charCount = 0;
        for (List<String> words : listOfLines) {
            for (String word : words) {
                charCount += word.length();
                wordCount += word.equals("") ? 0 : 1;
            }
        }
        System.out.println("Lines: "+lineCount);
        System.out.println("Words: "+wordCount);
        System.out.println("Characters: "+charCount);
    }
}
/*
People love me at parties
when they ask me "Oh, you are a computer guy?
Can you fix my laptop?"
And I respond...
"Computer Science is no more about computers
than astronomy is about telescopes"

Lines: 6
Words: 35
Characters: 149
 */