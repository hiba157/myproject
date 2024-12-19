package com.ex4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {



        @Test
        public void testFizzBuzz() {
            assertEquals("1", FizzBuzz.de(1));
            assertEquals("Fizz", FizzBuzz.de(3));
            assertEquals("Buzz", FizzBuzz.de(5));
            assertEquals("FizzBuzz", FizzBuzz.de(15));
            assertEquals("Fizz", FizzBuzz.de(9));
            assertEquals("Buzz", FizzBuzz.de(10));
        }
    }

