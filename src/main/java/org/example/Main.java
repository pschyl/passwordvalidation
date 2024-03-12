package org.example;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    //Global variables and arrays
    public static int MIN_LENGTH = 8;
    public static String[] COMMON_PASSWORDS = {"Password1", "qwertzU1", "Aa345678"};
    public static String[] SPECIALS = {"!", "§", "$", "%", "&", "/", "(", ")", "=", "?", "+", "*", "#", "-", "_", "<", ">", "@"};
    public static String[] DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public static String[] CHARS_LOWER = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static String[] CHARS_UPPER = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public static void main(String[] args) {

        //check methods
        String test_password = "qwertz&U4";
        System.out.println(checkLength(test_password));
        System.out.println(hasDigit(test_password));
        System.out.println(checkCases(test_password));
        System.out.println(checkCommon(test_password));
        System.out.println(checkSpecial(test_password));

        //generate password
        String password = generatePassword();
        System.out.println(password);
    }

    public static boolean checkLength(String password) {
        if (password.length() >= MIN_LENGTH) {
            return true;
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        for (int i = 0; i < DIGITS.length; i++) {
            if (password.contains(DIGITS[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCases(String password) {
        if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase())) {
            return false;
        }
        return true;
    }

    public static boolean checkCommon(String password) {
        for (int i = 0; i < COMMON_PASSWORDS.length; i++) {
            if (password.equals(COMMON_PASSWORDS[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSpecial(String password) {
        for (int i = 0; i < SPECIALS.length; i++) {
            if (password.contains(SPECIALS[i])) {
                return true;
            }
        }
        return false;
    }

    public static String getRandomFromArray(String[] array) {
        int random = ThreadLocalRandom.current().nextInt(array.length);
        return array[random];
    }

    public static String generatePassword() {
        String[] proto_array = new String[MIN_LENGTH];
        proto_array[0] = getRandomFromArray(CHARS_LOWER);
        proto_array[1] = getRandomFromArray(CHARS_UPPER);
        proto_array[2] = getRandomFromArray(DIGITS);
        proto_array[3] = getRandomFromArray(SPECIALS);

        for (int i = 4; i < proto_array.length; i++) {
            proto_array[i] = getRandomFromArray(DIGITS);
        }

        String password = "";

        for (int i = 0; i < proto_array.length; i++) {
            password = password + proto_array[i];
        }

        return password;
    }
}