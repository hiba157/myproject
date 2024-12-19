package com.ex4;

public class FizzBuzz {


        public static String de(int nbr) {
            if (nbr % 3 == 0 && nbr % 5 == 0) {
                return "FizzBuzz";
            } else if (nbr % 3 == 0) {
                return "Fizz";
            } else if (nbr % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(nbr);
            }
        }
    }


