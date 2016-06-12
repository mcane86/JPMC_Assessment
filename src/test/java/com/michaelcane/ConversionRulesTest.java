package com.michaelcane;

import com.michaelcane.ConversionRules;
import com.michaelcane.NumbersAndTitles;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
            String conversionAction(String input) {
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

}