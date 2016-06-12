package com.michaelcane;

public class SalesParser {

    public String addsCommasAndConvertToString(int input) {
        return String.format("%,d", input);
    }

    public String[] convertStringToArray(String input) {
        return input.split(",");
    }
}
