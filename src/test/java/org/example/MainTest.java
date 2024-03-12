package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkLength_shouldReturnTrue_whenCalledWith_abcdefgh() {
        //GIVEN
        String input = "abcdefgh";
        //WHEN
        boolean actual = Main.checkLength(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkLength_shouldReturnFalse_whenCalledWith_abcdef() {
        //GIVEN
        String input = "abcdef";
        //WHEN
        boolean actual = Main.checkLength(input);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void hasDigit_shouldReturnTrue_whenCalledWith_abcdef3() {
        //GIVEN
        String input = "abcdef3";
        //WHEN
        boolean actual = Main.hasDigit(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void hasDigit_shouldReturnFalse_whenCalledWith_abcdef() {
        //GIVEN
        String input = "abcdef";
        //WHEN
        boolean actual = Main.hasDigit(input);
        //THEN
        Assertions.assertFalse(actual);
    }

}