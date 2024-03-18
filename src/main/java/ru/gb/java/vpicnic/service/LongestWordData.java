package ru.gb.java.vpicnic.service;

import java.util.ArrayList;

public class LongestWordData implements LongestWord {
    @Override
    public void findLongestWord(ArrayList<String> list) {
        String longestWord = "";
        for (String currentFood : list) {
            if (currentFood.length() > longestWord.length()) {
                longestWord = currentFood;
            }
        }
        System.out.println("Самое длинное слово - " + longestWord + ". Его длина " + longestWord.length());
    }
}
