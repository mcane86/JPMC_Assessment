package com.michaelcane;

import java.util.ArrayList;
import java.util.HashMap;

public class TripleDigit extends ConversionRules {

    DoubleDigit doubleDigit = new DoubleDigit();

    public boolean conditionToConvert(int input) {
        return input == 3;
    }

    public String convertToText(String input, ArrayList<String> map) {
        return map.get(stringParser(input));
    }

    public String checkForZeroAtHundredsPosition(String input) {
        String output = (input.substring(0,1).equals("0")) ? "" : convertToText(input.substring(0, 1), numbersAndTitles.getBasicNumbers()) + "Hundred";
        return output;
    }

    public String checkForZeroAtTensPosition(String input, ArrayList<String> map) {
        String output = (input.substring(1,2).equals("0")) ? "" : (findSubString(input).equals("1")) ? map.get(stringParser(input.substring(1, 3))) : map.get(stringParser(findSubString(input)));
        return output;
    }

    @Override
    public String findSubString(String input) {
        return input.substring(1, 2);
    }

    @Override
    String conversionAction(String input) {
        ArrayList<String> map = chooseArrayList(input);
        String firstDigit = checkForZeroAtHundredsPosition(input);
        String secondDigit = checkForZeroAtTensPosition(input, map);
        String thirdDigit = (findSubString(input).equals("1")) ? "" : convertToText(input.substring(2), numbersAndTitles.getBasicNumbers());
        return firstDigit + secondDigit + thirdDigit;
    }
}
