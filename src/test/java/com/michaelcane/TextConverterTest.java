package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextConverterTest {
    TextConverter textConverter;
    NumbersAndTitles numbersAndTitles;
    SalesParser salesParser;
    @Before
    public void setUp() throws Exception {
        textConverter = new TextConverter();
        numbersAndTitles = new NumbersAndTitles();
        salesParser = new SalesParser();
        numbersAndTitles.populationControl();
    }

    @Test
    public void getArraySize() throws Exception {
        int expected = 2;
        int example = 6312;
        int actual = textConverter.getArraySize(salesParser.convertStringToArray(salesParser.addsCommasAndConvertToString(example)));
        assertEquals("This method will return the size of the array passed to it.", expected, actual);
    }

    @Test
    public void getStringFromInput() throws Exception {
        String expected = "OneHundredFifteen";
        String example = "115";
        String actual = textConverter.getStringFromInput(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine1() throws Exception {
        String expected = "FiveDollars";
        int example = 5;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine2() throws Exception {
        String expected = "ThirteenDollars";
        int example = 13;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine3() throws Exception {
        String expected = "FortyFiveDollars";
        int example = 45;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine4() throws Exception {
        String expected = "ThreeHundredSeventyOneDollars";
        int example = 371;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine5() throws Exception {
        String expected = "TwoThousandThreeHundredSeventyOneDollars";
        int example = 2371;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine6() throws Exception {
        String expected = "OneMillionTwoThousandThreeHundredSeventyOneDollars";
        int example = 1002371;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

    @Test
    public void textConversionEngine7() throws Exception {
        String expected = "NineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNineDollars";
        int example = 999999999;
        String actual = textConverter.textConversionEngine(example);
        assertEquals(expected, actual);
    }

}