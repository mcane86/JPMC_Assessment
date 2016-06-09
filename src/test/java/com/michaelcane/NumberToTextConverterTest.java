package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToTextConverterTest {

    private String example1 = "3";
    private int example2B = 35;
    private int example2A = 15;
    private String example3 = "216";
    private int example3A = 216;
    private int example4 = 1918;
    private String example5 = "37645";
    private int example5A = 37645;
    private String example6 = "675915";
    private String example7 = "8675309";
    private int example8 = 8675309;

    NumberToTextConverter numberToTextConverter;
    @Before
    public void setUp() throws Exception {
        numberToTextConverter = new NumberToTextConverter();
        numberToTextConverter.populateBasicNumbers();
        numberToTextConverter.populateLargeNumbers();
        numberToTextConverter.populateTheTeens();
    }

    @Test
    public void testConvertNumbersToText1() {
        String expected = "Three";
        String actual = numberToTextConverter.convertNumbersToText(example1.charAt(0), numberToTextConverter.populateBasicNumbers());
        assertEquals("This will take a numeral of 3 and return a text value of Three", expected, actual);
    }

    @Test
    public void testAddsCommasToInput() {
        String expected = "8,675,309";
        String actual = numberToTextConverter.addsCommasToInput(example8);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLengthOfStringPassed() {
        int expected = 3;
        int actual = numberToTextConverter.checkLengthOfStringPassed(numberToTextConverter.splitsTheInputOnTheComma(example8));
        assertEquals("This will check the length of the String passed to it", expected, actual);
    }

    @Test
    public void testSplitsTheInputOnTheComma() {
        int expected = 2;
        int actual = numberToTextConverter.splitsTheInputOnTheComma(example5A).length;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddZeroesToTheBeginningOfTheIndex() {
        String expected = "037";
        String[] newExample = numberToTextConverter.splitsTheInputOnTheComma(example5A);
        String actual = numberToTextConverter.addZeroesToTheBeginningOfTheIndex(newExample)[0];
        assertEquals("If an index of an array has less than three numbers than this will add zeroes to the spaces", expected, actual);
    }

    @Test
    public void testReplacesTheNumberInThe1sDigitWithText() {
        String expected = "Fifteen";
        String newInput = numberToTextConverter.addZeroesToTheBeginningOfTheIndex(numberToTextConverter.splitsTheInputOnTheComma(example2A))[0];
        String actual = numberToTextConverter.replacesTheNumberInThe10sDigitWithText(newInput);
        assertEquals("This will check for a 1 in the Tens place and enter a Teens number if a 1 is found", expected, actual);
    }

    @Test
    public void testReplacesTheNumberInThe10sDigitWithText1() {
        String expected = "Five";
        String newInput = numberToTextConverter.addZeroesToTheBeginningOfTheIndex(numberToTextConverter.splitsTheInputOnTheComma(example2B))[0];
        String actual = numberToTextConverter.replacesTheNumberInThe1sDigitWithText(newInput);
        assertEquals("This will check for a 1 in the Tens place and enter a Teens number if a 1 is found", expected, actual);
    }

    @Test
    public void testReplacesTheNumberInThe10sDigitWithText2() {
        String expected = "Forty";
        String newInput = numberToTextConverter.splitsTheInputOnTheComma(example5A)[1];
        String actual = numberToTextConverter.replacesTheNumberInThe10sDigitWithText(newInput);
        assertEquals("This will replace the number in the 10s digit with its Text version", expected, actual);
    }

    @Test
    public void testReplacesTheNumberInThe100sDigitWithText() {
        String expected = "TwoHundred";
        String[] newInput2 = numberToTextConverter.addZeroesToTheBeginningOfTheIndex(numberToTextConverter.splitsTheInputOnTheComma(example3A));
        String actual = numberToTextConverter.replacesTheNumberInThe100sDigitWithText(newInput2[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertsTheSalesFigureIntoText() {
        String expected = "EightMillionSixHundredSeventyFiveThousandThreeHundredNineDollars";
        String actual = numberToTextConverter.convertsTheSalesFigureIntoText(example8);
        assertEquals("This will turn the numbers of the Sales int into Text", expected, actual);
    }

}