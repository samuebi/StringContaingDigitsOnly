package com.bsamuel.exercise.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringContainsDigitsOnlyTest {

    @Test
    void stringContainsDigitsOnly() {

        StringContainsDigitsOnly sCDO = new StringContainsDigitsOnly();

        boolean result = sCDO.StringContainsDigitsOnly("Hello World");
        assertEquals(false, result);

        result = sCDO.StringContainsDigitsOnly("121 121212");
        assertEquals(false, result);

        result = sCDO.StringContainsDigitsOnly("254254523");
        assertEquals(true, result);


    }
}