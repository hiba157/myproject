package com.pantxi.romain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {

    @Test
    public void testConvert1() {
        assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
    }

    @Test
    public void testConvert3() {
        assertThat(ArabicRomanNumerals.convert(3)).isEqualTo("III");
    }

    @Test
    public void testConvert4() {
        assertThat(ArabicRomanNumerals.convert(4)).isEqualTo("IV");
    }

    @Test
    public void testConvert5() {
        assertThat(ArabicRomanNumerals.convert(5)).isEqualTo("V");
    }

    @Test
    public void testConvert9() {
        assertThat(ArabicRomanNumerals.convert(9)).isEqualTo("IX");
    }

    @Test
    public void testConvert10() {
        assertThat(ArabicRomanNumerals.convert(10)).isEqualTo("X");
    }

    @Test
    public void testConvert39() {
        assertThat(ArabicRomanNumerals.convert(39)).isEqualTo("XXXIX");
    }

    @Test
    public void testConvert50() {
        assertThat(ArabicRomanNumerals.convert(50)).isEqualTo("L");
    }

    @Test
    public void testConvert29() {
        assertThat(ArabicRomanNumerals.convert(29)).isEqualTo("XXIX");
    }

    @Test
    public void testConvert44() {
        assertThat(ArabicRomanNumerals.convert(44)).isEqualTo("XLIV");
    }
}
