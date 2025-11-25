package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest {
	
	  private final App app = new App();
	
    @Test
    void testAdd() {
      
        assertEquals(5, app.add(2, 3));
    }
    
    @Test
    void testSubtract() {
        assertEquals(1, app.subtract(4, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, app.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, app.divide(8, 4));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> app.divide(5, 0));
    }

    // String tests
    @Test
    void testReverse() {
        assertEquals("cba", app.reverse("abc"));
    }

    @Test
    void testIsEmpty() {
        assertTrue(app.isEmpty(""));
        assertTrue(app.isEmpty(null));
        assertFalse(app.isEmpty("Hello"));
    }

    @Test
    void testReverseNull() {
        assertThrows(NullPointerException.class, () -> app.reverse(null));
    }

    // List tests
    @Test
    void testSumList() {
        assertEquals(10, app.sumList(Arrays.asList(1, 2, 3, 4)));
        assertEquals(0, app.sumList(null));
    }

    // Even/Odd tests
    @ParameterizedTest
    @CsvSource({
        "2,true",
        "3,false",
        "0,true",
        "-4,true",
        "-5,false"
    })
    void testIsEven(int input, boolean expected) {
        assertEquals(expected, app.isEven(input));
    }
}