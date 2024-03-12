package org.example;

public class Main {
    public static int MIN_LENGTH = 8;
    public static void main(String[] args) {

        String test_password = "ABCDEFGHt";
        System.out.println(checkLength(test_password));
        System.out.println(hasDigit(test_password));
        System.out.println(checkCases(test_password));
    }

    public static boolean checkLength(String password) {
        if (password.length() >= MIN_LENGTH) {
            return true;
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < digits.length; i++) {
            if (password.contains(digits[i])) {
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

        return false;
    }
}