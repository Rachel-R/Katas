package com.rroIKS;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void checkAddExistence() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("");
        assertEquals(0, result);
    }

    @Test
    public void checkAddOneNumber() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("2");
        assertEquals(2, result);
    }

    @Test
    public void checkAddUnknownAmountOfNumbers() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("2,3,7");
        assertEquals(12, result);
    }

    @Test
    public void checkAddHandleNewLineCharacterAsDelimiter() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("2\n3\n7");
        assertEquals(12, result);
    }

    @Test
    public void checkAddHandleDifferentDelimitersSemicolon() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("//;\n2;3;7");
        assertEquals(12, result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkAddNegativeNumber() {
        StringCalculator sc = new StringCalculator();
        sc.add("2,-3,7");
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkAddMultipleNegativeNumbers() {
        StringCalculator sc = new StringCalculator();
        sc.add("2,-3,-7");
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkAddAllNegativeNumbers() {
        StringCalculator sc = new StringCalculator();
        sc.add("-2,-3,-7");
    }

    @Test
    public void checkAddMultiCharacterDelimiterPenguin() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("//Penguin\n2\n3Penguin7");
        assertEquals(12, result);
    }

}
