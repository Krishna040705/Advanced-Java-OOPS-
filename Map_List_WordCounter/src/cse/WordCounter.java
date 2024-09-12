package cse;

import java.util.*;


public class WordCounter {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No words provided. Please enter some words as command-line arguments.");
            return;
        }

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : args) {
            word = word.toLowerCase();

            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        if (wordCount.isEmpty()) {
            System.out.println("No valid words to count.");
        } else {
            System.out.println("Word Count Results:");
            System.out.println("-------------------");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
