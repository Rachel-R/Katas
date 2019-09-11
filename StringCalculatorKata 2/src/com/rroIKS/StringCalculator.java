package com.rroIKS;

import java.util.Arrays;
import java.util.List;

class StringCalculator {

    private StringBuilder allNegativeValuesInStringNumbers = new StringBuilder();
    private static final int BEGINNING_OF_DELIMITER = 2;
    int add(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",";
            String numbersToBeSummedUp = numbers;

            if (numbers.length() > 2 && numbers.substring(0, 2).equals("//")) {
                delimiter = getDelimiter(numbers);
                numbersToBeSummedUp = numbers.substring(getEndOfDelimiter(numbers) + 1);
            }

            String[] stringArray = numbersToBeSummedUp.split(delimiter + "|\n");
            List<String> parsedNumbers = Arrays.asList(stringArray);
            int sum = getSum(parsedNumbers);

            if (allNegativeValuesInStringNumbers.toString().isEmpty()) {
                return sum;
            }
            throw new IllegalArgumentException("Negatives not allowed. You entered:  " + allNegativeValuesInStringNumbers.toString());
        }
    }

    private String getDelimiter(String numbers) {
        int endOfDelimiter = getEndOfDelimiter(numbers);
        return numbers.substring(BEGINNING_OF_DELIMITER, endOfDelimiter);
    }

    private int getEndOfDelimiter(String numbers) {
        return numbers.indexOf("\n");
    }

    private int getSum(List<String> arrayOfParsedNumbers) {
        int sum = 0;
        for (String element : arrayOfParsedNumbers) {
            int integerFromElement = Integer.parseInt(element);
            if (integerFromElement < 0) {
                allNegativeValuesInStringNumbers.append(element).append(" ");
            }
            sum += integerFromElement;
        }
        return sum;
    }
}