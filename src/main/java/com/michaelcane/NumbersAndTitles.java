package com.michaelcane;


import java.util.ArrayList;

public class NumbersAndTitles {

    private static ArrayList<String> basicNumbers = new ArrayList<>();
    private static ArrayList<String> largeNumbers = new ArrayList<>();
    private static ArrayList<String> titles = new ArrayList<>();

    private ArrayList<String> populateBasicNumbers() {
        basicNumbers.add("Zero");
        basicNumbers.add("One");
        basicNumbers.add("Two");
        basicNumbers.add("Three");
        basicNumbers.add("Four");
        basicNumbers.add("Five");
        basicNumbers.add("Six");
        basicNumbers.add("Seven");
        basicNumbers.add("Eight");
        basicNumbers.add("Nine");
        basicNumbers.add("Ten");
        basicNumbers.add("Eleven");
        basicNumbers.add("Twelve");
        basicNumbers.add("Thirteen");
        basicNumbers.add("Fourteen");
        basicNumbers.add("Fifteen");
        basicNumbers.add("Sixteen");
        basicNumbers.add("Seventeen");
        basicNumbers.add("Eighteen");
        basicNumbers.add("Nineteen");
        return basicNumbers;
    }

    private ArrayList<String> populateLargeNumbers() {
        largeNumbers.add("");
        largeNumbers.add("");
        largeNumbers.add("Twenty");
        largeNumbers.add("Thirty");
        largeNumbers.add("Forty");
        largeNumbers.add("Fifty");
        largeNumbers.add("Sixty");
        largeNumbers.add("Seventy");
        largeNumbers.add("Eighty");
        largeNumbers.add("Ninety");
        return largeNumbers;
    }

    private ArrayList<String> populateTitles() {
        titles.add("Million");
        titles.add("Thousand");
        titles.add("");
        return titles;
    }

    public void populationControl() {
        populateBasicNumbers();
        populateLargeNumbers();
        populateTitles();
    }

    public ArrayList<String> getBasicNumbers() {
        return basicNumbers;
    }

    public ArrayList<String> getLargeNumbers() {
        return largeNumbers;
    }

    public ArrayList<String> getTitles() {
        return titles;
    }
}
