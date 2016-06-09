package com.michaelcane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberToTextConverter {

    //Started @ 12:30p.m. Jun 9, 2016

    private static HashMap<Integer, String> basicNumbers = new HashMap<>();
    private static HashMap<Integer, String> largeNumbers = new HashMap<>();
    private static HashMap<Integer, String> teens = new HashMap<>();
    private static ArrayList<String> titles= new ArrayList<>(Arrays.asList("Million", "Thousand", ""));

    public HashMap<Integer, String> populateBasicNumbers() {
        basicNumbers.put(0, "Zero");
        basicNumbers.put(1, "One");
        basicNumbers.put(2, "Two");
        basicNumbers.put(3, "Three");
        basicNumbers.put(4, "Four");
        basicNumbers.put(5, "Five");
        basicNumbers.put(6, "Six");
        basicNumbers.put(7, "Seven");
        basicNumbers.put(8, "Eight");
        basicNumbers.put(9, "Nine");
        return basicNumbers;
    }

    public HashMap<Integer , String> populateLargeNumbers() {
        largeNumbers.put(2, "Twenty");
        largeNumbers.put(3, "Thirty");
        largeNumbers.put(4, "Forty");
        largeNumbers.put(5, "Fifty");
        largeNumbers.put(6, "Sixty");
        largeNumbers.put(7, "Seventy");
        largeNumbers.put(8, "Eighty");
        largeNumbers.put(9, "Ninety");
        return largeNumbers;
    }

    public HashMap<Integer, String> populateTheTeens() {
        teens.put(0, "Ten");
        teens.put(1, "Eleven");
        teens.put(2, "Twelve");
        teens.put(3, "Thirteen");
        teens.put(4, "Fourteen");
        teens.put(5, "Fifteen");
        teens.put(6, "Sixteen");
        teens.put(7, "Seventeen");
        teens.put(8, "Eighteen");
        teens.put(9, "Nineteen");
        return teens;
    }

    public String convertNumbersToText(char input, HashMap<Integer, String> map) {
        for (Integer key : map.keySet()) {
            if (key == Character.getNumericValue(input)) {
                return map.get(key);
            }
        }
        return "";
    }

    public String addsCommasToInput(int input) {
        return String.format("%,d", input);
    }

    public int checkLengthOfStringPassed(String[] input) {
        return input.length;
    }

    public String[] splitsTheInputOnTheComma(int input) {
        String newInput = addsCommasToInput(input);
        return newInput.split(",");
    }

    public String[] addZeroesToTheBeginningOfTheIndex(String[] input) {
        if (input[0].length() == 3) {
            return input;
        } else if (input[0].length() == 2) {
            input[0] = "0" + input[0];
            return input;
        } else {
            input[0] = "00" + input[0];
            return input;
        }
    }

    public String replacesTheNumberInThe1sDigitWithText(String input) {
        return convertNumbersToText(input.charAt(2), basicNumbers);
    }

    public String replacesTheNumberInThe10sDigitWithText(String input) {
        if (input.charAt(0) == '0' && input.charAt(1) == '0') {
            return "";
        } else if (input.charAt(1) == '0') {
            return "";
        } else if (input.charAt(1) == '1') {
            return convertNumbersToText(input.charAt(2), teens);
        } else {
            return convertNumbersToText(input.charAt(1), largeNumbers);
        }
    }

    public String replacesTheNumberInThe100sDigitWithText(String input) {
        if (input.charAt(0) == '0') {
            return "";
        } else {
            return convertNumbersToText(input.charAt(0), basicNumbers) + "Hundred";
        }
    }

    public String convertsTheSalesFigureIntoText(int input) {
        StringBuilder builder = new StringBuilder();

        String[] alteredInput = addZeroesToTheBeginningOfTheIndex(splitsTheInputOnTheComma(input));

        if (checkLengthOfStringPassed(alteredInput) == 3) {
            for (int i = 0; i < alteredInput.length; i++) {
                builder.append(replacesTheNumberInThe100sDigitWithText(alteredInput[i]));
                builder.append(replacesTheNumberInThe10sDigitWithText(alteredInput[i]));
                builder.append(replacesTheNumberInThe1sDigitWithText(alteredInput[i]));
                builder.append(titles.get(i));
            }
        } else if (checkLengthOfStringPassed(alteredInput) == 2) {
            for (int i = 0; i < alteredInput.length; i++) {
                builder.append(replacesTheNumberInThe100sDigitWithText(alteredInput[i]));
                builder.append(replacesTheNumberInThe10sDigitWithText(alteredInput[i]));
                builder.append(replacesTheNumberInThe1sDigitWithText(alteredInput[i]));
                builder.append(titles.get(i+1));
            }
        } else {
            for (int i = 0; i < alteredInput.length; i++) {
                builder.append(replacesTheNumberInThe100sDigitWithText(alteredInput[i]));
                builder.append(replacesTheNumberInThe10sDigitWithText(alteredInput[i]));
                builder.append(replacesTheNumberInThe1sDigitWithText(alteredInput[i]));
            }
        }
        builder.append("Dollars");
        return builder.toString();
    }




































}
