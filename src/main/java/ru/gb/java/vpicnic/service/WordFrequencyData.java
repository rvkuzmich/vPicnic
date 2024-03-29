package ru.gb.java.vpicnic.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyData implements WordFrequency {
    @Override
    public void wordFrequency(ArrayList<String> list) {
        Map<String, Integer> basket = new HashMap<>();
        for (String word : list) {
            word = word.toLowerCase();
            basket.put(word, basket.getOrDefault(word, 0) + 1);
        }
        System.out.println("Слово : Колчество");
        for (String word1 : basket.keySet()) {
            if (!word1.equals("")) {
                System.out.println(word1 + " : " + basket.get(word1));
            }
        }
    }
}

