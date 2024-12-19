package com.pantxi.romain;

public class ArabicRomanNumerals {

        public static String convert(int nbr) {
            String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
                    "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
                    "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV",
                    "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI",
                    "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                    "XLIX", "L"};
            return romanNumerals[nbr];
        }
    }


