package com.michaelcane;

import java.util.ArrayList;

public class OneDigit extends ConversionRules {

    NumbersAndTitles numbersAndTitles = new NumbersAndTitles();

    public boolean conditionToConvert(int input) {
        return input == 1;
    }

    public String convertToText(String input, ArrayList<String> map) {
        return map.get(stringParser(input));
    }

    @Override
    String conversionAction(String input) {
        return convertToText(input, numbersAndTitles.getBasicNumbers());
    }

}
