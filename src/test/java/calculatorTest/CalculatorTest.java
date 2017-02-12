package calculatorTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import calculator.Calculator;
import java.math.BigDecimal;
import static java.math.BigDecimal.valueOf;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testCalculate() {

        BigDecimal[] result = calculator.calculate(valueOf(67843), valueOf(83));
        Assert.assertEquals(result[0],(valueOf(817)));
        Assert.assertTrue(result[1].equals(valueOf(32)));
    }
}
