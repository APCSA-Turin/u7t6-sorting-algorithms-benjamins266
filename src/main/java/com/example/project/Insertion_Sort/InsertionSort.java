package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
       for(int i = 1; i<elements.length; i++){
        int value = elements[i];
        int j = i;
        while(j != 0 && value<elements[j-1]){
            int temp = elements[j-1]; 
            elements[j] = temp;
            elements[j-1] = value;
            j--;
        }
       }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        for(int i = 0; i<elements.length; i++){
            int lowestValue = i;
            for(int j = i; j<elements.length; j++){
                if(elements[j]<elements[lowestValue]){
                    lowestValue = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[lowestValue];
            elements[lowestValue] = temp;
        }
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for(int i = 1; i<words.size(); i++){
            String value = words.get(i);
            int j = i;
            while(j != 0 && value.compareTo(words.get(j-1))<0){
                String temp = words.get(j-1); 
                words.set(j,temp);
                words.set(j-1,value);
                j--;
            }
           }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        for(int i = 0; i<words.size(); i++){
            int lowestValue = i;
            for(int j = i; j<words.size(); j++){
                if(words.get(j).compareTo(words.get(lowestValue))<0){
                    lowestValue = j;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(lowestValue));
            words.set(lowestValue,temp);
        }    
    
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}