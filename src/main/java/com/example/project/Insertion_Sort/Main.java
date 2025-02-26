package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

int[] arrA = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
InsertionSort.selectionSort(arrA);
System.out.println(Arrays.toString(arrA));
System.out.println();
int[] arrB = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
InsertionSort.insertionSort(arrB);
System.out.println(Arrays.toString(arrB));



    }
}