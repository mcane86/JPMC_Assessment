package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneDigitTest {

    OneDigit oneDigit;
    NumbersAndTitles numbersAndTitles;
    @Before
    public void setUp() throws Exception {
        oneDigit = new OneDigit();
        numbersAndTitles = new NumbersAndTitles();
        numbersAndTitles.populationControl();
    }

    @Test
    public void testConditionToConvert() throws Exception {
        boolean actual = oneDigit.conditionToConvert(1);
        assertTrue(actual);
    }

    @Test
    public void testConvertSingleDigit() {
        String expected = "Three";
        String example = "3";
        String actual = oneDigit.convertOneDigit(example);
        assertEquals(expected, actual);
    }

}