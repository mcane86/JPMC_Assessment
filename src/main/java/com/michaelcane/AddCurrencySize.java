package com.michaelcane;

public class AddCurrencySize {

    NumbersAndTitles numbersAndTitles = new NumbersAndTitles();

    public String appendCurrencySize(int input) {
        return numbersAndTitles.getTitles().get(input);
    }
}
