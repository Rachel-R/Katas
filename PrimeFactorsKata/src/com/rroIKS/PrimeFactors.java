package com.rroIKS;

import java.util.*;

public class PrimeFactors {


    int count = 0;
    private List<Integer> factors = new ArrayList<Integer>();
    private List<Integer> tempList;

    public int getCount() {
        int tempCount = count;
        count= 0;

        return tempCount;
    }

    public List<Integer> calculateFactorsRecursivelyTailRecursion(int numberToBeFactored) {
        if (numberToBeFactored > 1) {
            for (int i = 2; i <= (Math.sqrt(numberToBeFactored)); i++) {
                if (numberToBeFactored % i == 0) {
                    factors.add(i);
                    return calculateFactorsRecursivelyTailRecursion(numberToBeFactored / i);
                }
            }
        }
        factors.add(numberToBeFactored);
        return factors;
    }

    public List<Integer> calculateFactorsIterativelyForLoop(int numberToBeFactored) {
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

    public List<Integer> calculateFactorsIterativelyWhileLoop(int numberToBeFactored) {
        int i = 2;
        while (i <= Math.sqrt(numberToBeFactored)) {
            if (numberToBeFactored % i == 0) {
                factors.add(i);
                numberToBeFactored /= i;
            } else {
                i++;
            }
        }
        factors.add(numberToBeFactored);
        return factors;
    }

   /* public List<Integer> calculateFactorsRecursively2(int numberToBeFactored, int factor) {
        if (numberToBeFactored % factor == 0) {
            count ++;
            List<Integer> tempList = calculateFactorsRecursively2(numberToBeFactored / factor, factor);
            tempList.add(factor);
            return tempList;
        }
        else{
            if(factor > Math.sqrt(numberToBeFactored)){
                count ++;
                List<Integer> tempList = new ArrayList<>(numberToBeFactored);
                return tempList;
            }
            else{
                count ++;
                return calculateFactorsRecursively2(numberToBeFactored,factor+1);
            }
        }
    }*/


    public List<Integer> calculateFactorsRecursively2(int numberToBeFactored, int factor) {
        if (numberToBeFactored % factor == 0) {
            tempList.addAll(calculateFactorsRecursively2(numberToBeFactored / factor, factor));
            tempList.add(factor);
            return tempList;
        } else {
            if (factor > Math.sqrt(numberToBeFactored)) {
                return new ArrayList<>(numberToBeFactored);
            } else {
                return calculateFactorsRecursively2(numberToBeFactored, factor + 1);
            }
        }
    }

    public void resetList() {
        this.tempList = new ArrayList<>();
    }
}
