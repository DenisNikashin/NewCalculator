package calculator;

import java.io.IOException;
import java.math.BigDecimal;


class Position {
    private Calculator calculator;
    private String devidendString /*= numbersInput.getDividendString()*/;
    private String deviderString /*= numbersInput.getDividerString()*/;
    private String quotientString;
    private String remainderString;
    private String subtrahendString;
    private String minuendString;
    private int subtrahend;
    private int devidendLength;
    private int deviderLength;
    private int quotientLength;
    private int rightSpace;
    private int subtrahendLeftSpace;
    private int minuendLeftSpace;
    int multiplier = 1;
    int index;

    void positioning(NumbersInput numbersInput) throws IOException {

    }

    int definingBitnessMultiplier(int multiplier) {
        /*quotientLength = String.valueOf(calculator.getQuotient()).length();*/
        System.out.println(" quotientLength --> " + quotientLength);

        for (index = 1; index < quotientLength; index++) {
            multiplier *= 10;
        }
        return multiplier;
    }

}
