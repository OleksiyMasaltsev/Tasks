package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuscOneTest {

    @Test
    void fusc() {

        assertEquals(0, FuscOne.fusc(0));
        assertEquals(1, FuscOne.fusc(1));
        assertEquals(21, FuscOne.fusc(85));
    }
}