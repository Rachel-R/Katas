package com.rroIKS;

import java.util.*;

public class PrimeFactors {

    private List<Integer> factors = new ArrayList<Integer>();

    public List<Integer> calculateFactorsRecursively(int numberToBeFactored) {
        if (numberToBeFactored > 1) {
            for (int i = 2; i <= (Math.sqrt(numberToBeFactored)); i++) {
                if (numberToBeFactored % i == 0) {
                    factors.add(i);
                    return calculateFactorsRecursively(numberToBeFactored/i);
                }
            }
        }
        factors.add(numberToBeFactored);
        return factors;
    }

    public List<Integer> calculateFactorsIteratively(int numberToBeFactored) {
        if (numberToBeFactored > 1) {
            for (int i = 2; i <= (Math.sqrt(numberToBeFactored)); i++) {
                if (numberToBeFactored % i == 0) {
                    factors.add(i);
                    numberToBeFactored /= i;
                    i = 1;
                }
            }
        }
        factors.add(numberToBeFactored);
        return factors;
    }
}
