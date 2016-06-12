package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalesParserTest {

    int example1 = 987654321;
    String example2 = "987,654,321";

    SalesParser salesParser;
    @Before
    public void setUp() throws Exception {
        salesParser = new SalesParser();
    }

    @Test
    public void testAddsCommasAndConvertToString() throws Exception {
        String expected = "987,654,321";
        String actual = salesParser.addsCommasAndConvertToString(example1);
        assertEquals("This method returns a String of numbers with commas separating groups of numbers", expected, actual);
    }

    @Test
    public void convertStringToArray() throws Exception {
        String expected = "987";
        String actual = salesParser.convertStringToArray(example2)[0];
        assertEquals("This method will convert a String to an Array along the commas", expected, actual);
    }

}