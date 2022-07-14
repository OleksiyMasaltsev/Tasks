package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestFiveDigitNumberTest {

    @Test
    void solve() {
        assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
        assertEquals(74765, LargestFiveDigitNumber.solve("731674765"));
    }
}