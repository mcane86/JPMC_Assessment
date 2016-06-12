package com.michaelcane;

import java.util.ArrayList;
import java.util.List;

public class TextConverter {

    SalesParser salesParser = new SalesParser();
    NumbersAndTitles numbersAndTitles = new NumbersAndTitles();

    public int getArraySize (String[] input) {
        return input.length;
    }

    List<ConversionRules> rules;

    public TextConverter() {
        rules = new ArrayList<>();
        rules.add(new OneDigit());
        rules.add(new DoubleDigit());
        rules.add(new TripleDigit());
    }

    public String getStringFromInput (String input) {
        String response = "";
        for (ConversionRules rule: rules) {
            if(rule.conditionToConvert(input.length())){
                response = rule.conversionAction(input);
                break;
            }
        }
        return response;
    }

    public String getTitleFromInput(int input) {
        return numbersAndTitles.getTitles().get(input);
    }

    private String buildStringAndTitle(String[] input, int index, int titleIndex) {
        String first = getStringFromInput(input[index]);
        String second = getTitleFromInput(titleIndex);
        return first + second;
    }

    private String[] convertToArray(int input) {
        return salesParser.convertStringToArray(salesParser.addsCommasAndConvertToString(input));
    }

    public String textConversionEngine(int input) {
        String[] newInput = convertToArray(input);

        StringBuilder builder = new StringBuilder();
        if (getArraySize(newInput) == 3) {
            for (int i = 0; i < newInput.length; i++) {
                builder.append(buildStringAndTitle(newInput, i, i));
            }
        } else if (getArraySize(newInput) == 2) {
            for (int i = 0; i < newInput.length; i++) {
                builder.append(buildStringAndTitle(newInput, i, i+1));
            }
        } else {
            for (int i = 0; i < newInput.length; i++) {
                builder.append(getStringFromInput(newInput[0]));
            }
        }
        builder.append("Dollars");
        return builder.toString();
    }

}
