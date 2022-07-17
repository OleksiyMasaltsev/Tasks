package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(Movie.movie(500, 15, 0.9), 43);
        testing(Movie.movie(100, 10, 0.95), 24);
    }
}