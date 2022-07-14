package ua.masaltsev.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchsticksToSquareTest {

    @Test
    void makesquare() {
//        assertTrue(new MatchsticksToSquare().makesquare(new int[]{5,5,5,5,4,4,4,4,3,3,3,3}));
//        assertTrue(new MatchsticksToSquare().makesquare(new int[]{1,1,2,2,2}));
        assertTrue(new MatchsticksToSquare().makesquare(new int[]{10,6,5,5,5,3,3,3,2,2,2,2}));
//        assertFalse(new MatchsticksToSquare().makesquare(new int[]{3,3,3,3,4}));
    }
}