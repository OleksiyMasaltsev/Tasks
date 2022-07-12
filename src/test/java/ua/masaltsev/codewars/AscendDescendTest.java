package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendDescendTest {

    @Test
    void ascendDescend() {
        assertEquals("12321", AscendDescend.ascendDescend(5, 1, 3));
        assertEquals("01210121012101", AscendDescend.ascendDescend(14, 0, 2));
        assertEquals("56789876567", AscendDescend.ascendDescend(11, 5, 9));
    }
}