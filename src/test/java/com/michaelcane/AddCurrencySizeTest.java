package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddCurrencySizeTest {

    AddCurrencySize addCurrencySize;
    NumbersAndTitles numbersAndTitles;
    @Before
    public void setUp() throws Exception {
        addCurrencySize = new AddCurrencySize();
        numbersAndTitles = new NumbersAndTitles();
        numbersAndTitles.populationControl();
    }

    @Test
    public void appendCurrencySize1() throws Exception {
        String expected = "Million";
        String actual = addCurrencySize.appendCurrencySize(0);
        assertEquals(expected, actual);
    }

    @Test
    public void appendCurrencySize2() throws Exception {
        String expected = "Thousand";
        String actual = addCurrencySize.appendCurrencySize(1);
        assertEquals(expected, actual);
    }

    @Test
    public void appendCurrencySize3() throws Exception {
        String expected = "";
        String actual = addCurrencySize.appendCurrencySize(2);
        assertEquals(expected, actual);
    }

}