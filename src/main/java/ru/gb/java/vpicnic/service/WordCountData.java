package ru.gb.java.vpicnic.service;

import ru.gb.java.vpicnic.model.Food;

import java.util.ArrayList;

public class WordCountData implements WordCount{
    private Food food;
    @Override
    public void wordCount(ArrayList<String> list) {
        int wordCounter = 0;
        for (String word : list){
            wordCounter++;
        }
        System.out.println("Количество слов - " + wordCounter);
    }
}
