package com.michaelcane;

import java.util.ArrayList;

abstract class ConversionRules {

    NumbersAndTitles numbersAndTitles = new NumbersAndTitles();

    abstract boolean conditionToConvert(int input);

    public int stringParser(String input) {
        return Integer.parseInt(input);
    }

    public String findSubString(String input) {
        return input.substring(0, 1);
    }

    public ArrayList<String> chooseArrayList (String input) {
        return (findSubString(input).equals("1")) ? numbersAndTitles.getBasicNumbers() : numbersAndTitles.getLargeNumbers();
    }

    abstract String convertToText(String input, ArrayList<String> map);
}
