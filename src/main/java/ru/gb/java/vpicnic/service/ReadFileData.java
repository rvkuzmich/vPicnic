package ru.gb.java.vpicnic.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileData implements ReadFile {
    @Override
    public ArrayList<String> readFile(File file) {
        ArrayList<String> foodList = new ArrayList<>();
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                foodList = new ArrayList<>(Arrays.asList(words));

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return foodList;
    }
}
