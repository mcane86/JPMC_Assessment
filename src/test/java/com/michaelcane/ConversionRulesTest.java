package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by michaelcane on 6/11/16.
 */
public class ConversionRulesTest {

    String example1 = "0";
    String example2 = "3";
    String example3 = "19";

    ConversionRules conversionRules;
    NumbersAndTitles numbersAndTitles;
    @Before
    public void setUp() throws Exception {
        numbersAndTitles = new NumbersAndTitles();
        numbersAndTitles.populationControl();
        conversionRules = new ConversionRules() {
            @Override
            boolean conditionToConvert(int input) {
                return false;
            }

            @Override
            String convertToText(String input, ArrayList<String> map) {
                return null;
            }
        };
    }

    @Test
    public void testStringToIntParser1() throws Exception {
        int expected = 0;
        int actual = conversionRules.stringParser(example1);
        assertEquals("This method will parse the String into an int", expected, actual);
    }

    @Test
    public void testStringToIntParser2() throws Exception {
        int expected = 19;
        int actual = conversionRules.stringParser(example3);
        assertEquals("This method will parse the String into an int", expected, actual);
    }

    @Test
    public void testConvertToText1() throws Exception {
        String expected = "Nineteen";
        String actual = conversionRules.convertToText(example3, numbersAndTitles.getBasicNumbers());
        assertEquals("This will take 19 and covert it to Nineteen", expected, actual);
    }

    @Test
    public void testConvertToText2() throws Exception {
        String expected = "Three";
        String actual = conversionRules.convertToText(example2, numbersAndTitles.getBasicNumbers());
        assertEquals("This will take 19 and covert it to Nineteen", expected, actual);
    }

}