package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private int a;
    private int b;

    @Before
    public void setUp() {
        // Arrange: initialize variables
        a = 5;
        b = 3;
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Clean up if needed
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange done in setup

        // Act
        int result = a + b;

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = a - b;

        // Assert
        assertEquals(2, result);
    }
}
