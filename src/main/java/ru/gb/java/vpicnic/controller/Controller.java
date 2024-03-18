package ru.gb.java.vpicnic.controller;

import ru.gb.java.vpicnic.service.LongestWordData;
import ru.gb.java.vpicnic.service.ReadFileData;
import ru.gb.java.vpicnic.service.WordCountData;
import ru.gb.java.vpicnic.service.WordFrequencyData;

import java.io.File;
import java.util.ArrayList;

public class Controller {
    private LongestWordData longestWordData;
    private WordCountData wordCountData;
    private WordFrequencyData wordFrequencyData;
    private ReadFileData readFileData;
    private ArrayList<String> foodList = new ArrayList<>();

    public void start(){
        foodList = readFileData.readFile(new File("input.txt"));
        longestWordData.findLongestWord(foodList);
        wordCountData.wordCount(foodList);
        wordFrequencyData.wordFrequency(foodList);
    }
    public Controller() {
        longestWordData  = new LongestWordData();
        wordCountData = new WordCountData();
        wordFrequencyData = new WordFrequencyData();
        readFileData = new ReadFileData();
    }
}
