package calculator;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.math.BigDecimal.ZERO;

public class Validator {

    final private int INT_ZERO = 0;

    public boolean comparingDividendByZero(BigDecimal dividend) {
        if (ZERO.compareTo(dividend) >= INT_ZERO) {
           System.out.println("ATTENTION!!! The DIVIDEND can not be less than zero.");
           return false;
        }
        return true;
    }

    public boolean comparingDividerByZero(BigDecimal divider) {
        if (ZERO.compareTo(divider) >= INT_ZERO) {
            System.out.println("ATTENTION!!! The DIVIDER can not be less than zero.");
            return false;
        }
        return true;
    }

    public boolean comparingTheDivisorAndDividend(BigDecimal dividend, BigDecimal divider) {
        if (dividend.compareTo(divider) < divider.compareTo(dividend)) {
            System.out.println("Please enter the dividend over the divisor!!!!");
            return false;
        }
        return true;
    }

    public boolean checkingInputCharacters(String numberString) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(numberString);
            if (!matcher.matches()) {
                System.out.println("Input error");
            }
        return matcher.matches();
    }
}

