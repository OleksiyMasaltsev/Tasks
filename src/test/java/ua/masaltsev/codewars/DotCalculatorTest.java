package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotCalculatorTest {

    @Test
    public void exampleTest() {
        assertEquals(".....", DotCalculator.calc("..... // ."));
        assertEquals("..........", DotCalculator.calc("..... * .."));
        assertEquals("..", DotCalculator.calc("..... // .."));
        assertEquals("....", DotCalculator.calc("..... - ."));
        assertEquals("....................", DotCalculator.calc("..... + ..............."));
        assertEquals("...............", DotCalculator.calc("..... * ..."));
        assertEquals("..", DotCalculator.calc("..... - ..."));
        assertEquals("", DotCalculator.calc(". - ."));
        assertEquals("", DotCalculator.calc(". // .."));
    }

}