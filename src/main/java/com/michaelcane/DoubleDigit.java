package com.michaelcane;

import java.util.ArrayList;

public class DoubleDigit extends ConversionRules {

    public boolean conditionToConvert(int input) {
        return input == 2;
    }

    public String convertToText(String input, ArrayList<String> map) {
        return map.get(stringParser(input));
    }

    @Override
    String conversionAction(String input) {
        ArrayList<String> map = chooseArrayList(input);
        String newInput = (findSubString(input).equals("1")) ? map.get(stringParser(input.substring(0, 2))) : map.get(stringParser(findSubString(input)));
        String onesDigit = (findSubString(input).equals("1")) ? "" : convertToText(input.substring(1,2), numbersAndTitles.getBasicNumbers());
        return newInput + onesDigit;
    }


}
