package com.michaelcane;

import java.util.ArrayList;

public class OneDigit extends ConversionRules {

    NumbersAndTitles numbersAndTitles = new NumbersAndTitles();

    @Override
    boolean conditionToConvert(int input) {
        return input == 1;
    }

    @Override
    String convertToText(String input, ArrayList<String> map) {
        return map.get(stringParser(input));
    }

    public String convertOneDigit(String input) {
        return convertToText(input, numbersAndTitles.getBasicNumbers());
    }

}
