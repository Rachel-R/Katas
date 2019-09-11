package com.rroIKS;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrimeFactorsTest {

    @Test
    public void checkFail() {
        //fail();
    }

    @Test
    public void checkCalculateFactorsRecursivelyExistence() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(2);
        assertEquals(2, result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberOne() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(1);
        assertEquals(1, result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberWithTwoPrimeFactors() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(6);
        assertEquals(2, result.toArray()[0]);
        assertEquals(3, result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberWithSixPrimeFactors() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(542362);
        assertEquals(2,result.toArray()[0]);
        assertEquals(271181,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberZero() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(0);
        assertEquals(0, result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberTwoTwoFour() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(224);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(2,result.toArray()[2]);
        assertEquals(2,result.toArray()[3]);
        assertEquals(2,result.toArray()[4]);
        assertEquals(7,result.toArray()[5]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberThousand() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(1000);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(2,result.toArray()[2]);
        assertEquals(5,result.toArray()[3]);
        assertEquals(5,result.toArray()[4]);
        assertEquals(5,result.toArray()[5]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberTenThousand() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(10000);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(2,result.toArray()[2]);
        assertEquals(2,result.toArray()[3]);
        assertEquals(5,result.toArray()[4]);
        assertEquals(5,result.toArray()[5]);
        assertEquals(5,result.toArray()[6]);
        assertEquals(5,result.toArray()[7]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberFive() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(5);
        assertEquals(5,result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberNineteen() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(19);
        assertEquals(19,result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberThree() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(3);
        assertEquals(3,result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberFour() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(4);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberSix() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(6);
        assertEquals(2,result.toArray()[0]);
        assertEquals(3,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberNine() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(9);
        assertEquals(3,result.toArray()[0]);
        assertEquals(3,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberTwelve() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(12);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(3,result.toArray()[2]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumberFifteen() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively(15);
        assertEquals(3,result.toArray()[0]);
        assertEquals(5,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyNumber2PowerOf32() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsRecursively((2147483646));
    }

    //---------------------- iteratively-----------------------
    @Test
    public void checkCalculateFactorsIterativelyExistence() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(2);
        assertEquals(2, result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberOne() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(1);
        assertEquals(1, result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberWithTwoPrimeFactors() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(6);
        assertEquals(2, result.toArray()[0]);
        assertEquals(3, result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberWithSixPrimeFactors() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(542362);
        assertEquals(2,result.toArray()[0]);
        assertEquals(271181,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberZero() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(0);
        assertEquals(0, result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberTwoTwoFour() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(224);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(2,result.toArray()[2]);
        assertEquals(2,result.toArray()[3]);
        assertEquals(2,result.toArray()[4]);
        assertEquals(7,result.toArray()[5]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberThousand() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(1000);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(2,result.toArray()[2]);
        assertEquals(5,result.toArray()[3]);
        assertEquals(5,result.toArray()[4]);
        assertEquals(5,result.toArray()[5]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberTenThousand() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(10000);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(2,result.toArray()[2]);
        assertEquals(2,result.toArray()[3]);
        assertEquals(5,result.toArray()[4]);
        assertEquals(5,result.toArray()[5]);
        assertEquals(5,result.toArray()[6]);
        assertEquals(5,result.toArray()[7]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberFive() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(5);
        assertEquals(5,result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberNineteen() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(19);
        assertEquals(19,result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberThree() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(3);
        assertEquals(3,result.toArray()[0]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberFour() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(4);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberSix() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(6);
        assertEquals(2,result.toArray()[0]);
        assertEquals(3,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberNine() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(9);
        assertEquals(3,result.toArray()[0]);
        assertEquals(3,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberTwelve() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(12);
        assertEquals(2,result.toArray()[0]);
        assertEquals(2,result.toArray()[1]);
        assertEquals(3,result.toArray()[2]);
    }

    @Test
    public void checkCalculateFactorsIterativelyNumberFifteen() {
        PrimeFactors pf = new PrimeFactors();
        List<Integer> result = pf.calculateFactorsIteratively(15);
        assertEquals(3,result.toArray()[0]);
        assertEquals(5,result.toArray()[1]);
    }

    @Test
    public void checkCalculateFactorsRecursivelyAndIterativelyNumber2PowerOf32() {
        PrimeFactors pf = new PrimeFactors();

        Long startTime = System.currentTimeMillis();
        pf.calculateFactorsIteratively((int)(Math.pow(2, 30)));
        Long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println(timeTaken);

        startTime = System.currentTimeMillis();
        pf.calculateFactorsRecursively((int)(Math.pow(2, 30)));
        timeTaken = System.currentTimeMillis() - startTime;
        System.out.println(timeTaken);
    }

    @Test
    public void checkCalculateFactorsRecursivelyAndIterativelyLargeSemiprime() {
        PrimeFactors pf = new PrimeFactors();
        //Output is NOT consistent
        Long startTime = System.currentTimeMillis();
        pf.calculateFactorsIteratively(742517581);
        Long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println(timeTaken);

        startTime = System.currentTimeMillis();
        pf.calculateFactorsRecursively(742517581);
        timeTaken = System.currentTimeMillis() - startTime;
        System.out.println(timeTaken);
    }

}
