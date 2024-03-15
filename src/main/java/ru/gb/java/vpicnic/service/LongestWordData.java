package ru.gb.java.vpicnic.service;

import java.util.ArrayList;

public class LongestWordData implements LongestWord {
    private ArrayList<String> foodArrayList = new ArrayList<>();

    @Override
    public void findLongestWord(ArrayList<String> list) {
        foodArrayList = list;
        String longestWord = "";
        for (String currentFood : foodArrayList) {
            if (currentFood.length() > longestWord.length()) {
                longestWord = currentFood;
            }
        }
        System.out.println("Самое длинное слово - " + longestWord + ". Его длина " + longestWord.length());
    }
}
