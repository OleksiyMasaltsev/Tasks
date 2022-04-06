package ua.masaltsev.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {

    private Roman roman;

    @BeforeEach
    void setUp() {
        roman = new Roman();
    }

    @Test
    void romanToInt() {
        assertEquals(1994, roman.romanToInt("MCMXCIV"));
    }
}