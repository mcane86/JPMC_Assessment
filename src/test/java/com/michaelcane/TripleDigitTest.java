package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripleDigitTest {

    TripleDigit tripleDigit;
    NumbersAndTitles numbersAndTitles;
    @Before
    public void setUp() throws Exception {
        tripleDigit = new TripleDigit();
        numbersAndTitles = new NumbersAndTitles();
        numbersAndTitles.populationControl();
    }

    @Test
    public void conditionToConvert() throws Exception {
        boolean actual = tripleDigit.conditionToConvert(3);
        assertTrue(actual);
    }

    @Test
    public void testConvertToText() throws Exception {
        String expected = "Nine";
        String example = "9";
        String actual = tripleDigit.convertToText(example, numbersAndTitles.getBasicNumbers());
        assertEquals(expected, actual);
    }

    @Test
    public void convertTripleDigit1() throws Exception {
        String expected  = "NineHundredThirteen";
        String example = "913";
        String actual = tripleDigit.convertTripleDigit(example);
        assertEquals(expected, actual);
    }

}