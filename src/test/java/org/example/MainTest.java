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

    @Test
    void checkCases_shouldReturnTrue_whenCalledWith_aBcdef() {
        //GIVEN
        String input = "aBcdef";
        //WHEN
        boolean actual = Main.checkCases(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkCases_shouldReturnFalse_whenCalledWith_abcdef() {
        //GIVEN
        String input = "abcdef";
        //WHEN
        boolean actual = Main.checkCases(input);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkCases_shouldReturnFalse_whenCalledWith_ABCDEF() {
        //GIVEN
        String input = "ABCDEF";
        //WHEN
        boolean actual = Main.checkCases(input);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkCommon_shouldReturnTrue_whenCalledWith_ajH37pH43() {
        //GIVEN
        String input = "ajH37pH43";
        //WHEN
        boolean actual = Main.checkCommon(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkCommon_shouldReturnFalse_whenCalledWith_Password1() {
        //GIVEN
        String input = "Password1";
        //WHEN
        boolean actual = Main.checkCommon(input);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkSpecial_shouldReturnTrue_whenCalledWith_pa$$word() {
        //GIVEN
        String input = "pa$$word";
        //WHEN
        boolean actual = Main.checkSpecial(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkSpecial_shouldReturnFalse_whenCalledWith_password() {
        //GIVEN
        String input = "password";
        //WHEN
        boolean actual = Main.checkSpecial(input);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void generatePassword_shouldReturnTrue_whenCalled() {
        //WHEN
        String actual = Main.generatePassword();
        //THEN
        Assertions.assertTrue(Main.checkLength(actual) && Main.hasDigit(actual) && Main.checkCases(actual) && Main.checkCommon(actual) && Main.checkSpecial(actual));
    }


}