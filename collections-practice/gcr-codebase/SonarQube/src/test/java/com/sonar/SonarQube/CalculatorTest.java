package com.sonar.SonarQube;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    // Setup before each test
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    // Test add method
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    // Test isEven method
    public void testIsEven() {
        assertEquals(true, calculator.isEven(4));
        assertEquals(false, calculator.isEven(5));
    }
}