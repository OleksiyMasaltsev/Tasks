package ua.masaltsev.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterContainerTest {

    @Test
    void maxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {3,7};
        assertEquals(3, new WaterContainer().maxArea(height2));
    }
}