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
        Integer lineCount = listOfLines.size();
        Integer wordCount = 0;
        Integer charCount = 0;
        for (int i = 0; i < listOfLines.size(); i++){
            List<String> words = listOfLines.get(i);
            for (int j = 0; j < words.size(); j++) {
                String word = words.get(j);
                charCount += word.length();
                wordCount += word != "" ? 1 : 0;
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