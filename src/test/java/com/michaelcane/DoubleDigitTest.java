package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleDigitTest {

    DoubleDigit doubleDigit;
    NumbersAndTitles numbersAndTitles;
    @Before
    public void setUp() throws Exception {
        doubleDigit = new DoubleDigit();
        numbersAndTitles = new NumbersAndTitles();
        numbersAndTitles.populationControl();
    }

    @Test
    public void conditionToConvert() throws Exception {
        boolean actual = doubleDigit.conditionToConvert(2);
        assertTrue(actual);
    }

    @Test
    public void testFindSubstring() throws Exception {
        String expected = "2";
        String example = "24";
        String actual = doubleDigit.findSubString(example);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToText1() throws Exception {
        String expected = "Nineteen";
        String example = "19";
        String actual = doubleDigit.conversionAction(example);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToText2() throws Exception {
        String expected = "TwentyFour";
        String example = "24";
        String actual = doubleDigit.conversionAction(example);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToText3() throws Exception {
        String expected = "TwentyFour";
        String example = "24";
        String actual = doubleDigit.conversionAction(example);
        assertEquals(expected, actual);
    }

}