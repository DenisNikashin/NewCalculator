package calculator;

import java.math.BigDecimal;
import java.util.Arrays;

public class Calculator {

    public BigDecimal[] calculate(BigDecimal dividend, BigDecimal divider) {
        BigDecimal[] result = dividend.divideAndRemainder(divider);
        System.out.println("RESULT --> " + Arrays.toString(result));
        return  result;
    }
}
