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

}