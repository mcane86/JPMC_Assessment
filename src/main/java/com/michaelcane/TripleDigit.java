package com.michaelcane;

import java.util.ArrayList;

public class TripleDigit extends ConversionRules {

    DoubleDigit doubleDigit = new DoubleDigit();

    @Override
    boolean conditionToConvert(int input) {
        return input == 3;
    }

    @Override
    String convertToText(String input, ArrayList<String> map) {
        return map.get(stringParser(input)) + "Hundred";
    }

    @Override
    public String findSubString(String input) {
        return input.substring(1, 2);
    }

    public String convertTripleDigit(String input) {
        ArrayList<String> map = chooseArrayList(input);
        String firstDigit = convertToText(input.substring(0, 1), numbersAndTitles.getBasicNumbers());
        String secondDigit = (findSubString(input).equals("1")) ? map.get(stringParser(input.substring(1, 3))) : map.get(stringParser(findSubString(input)));
        String thirdDigit = (findSubString(input).equals("1")) ? "" : convertToText(input.substring(2), numbersAndTitles.getBasicNumbers());
        return firstDigit + secondDigit + thirdDigit;
    }
}
