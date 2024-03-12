package org.example;

public class Main {
    public static int MIN_LENGTH = 8;
    public static void main(String[] args) {
        checkLength("abcdefgh");
    }

    public static boolean checkLength(String password) {
        if (password.length() >= MIN_LENGTH) {
            System.out.println(password.length());
            return true;
        }
        return false;
    }

    public static boolean hasDigit(String password) {

        return false;
    }

    public static boolean checkCases(String password) {

        return false;
    }

    public static boolean checkCommon(String password) {

        return false;
    }
}