package validatorTest;


import calculator.Validator;
import org.junit.Test;
import java.math.BigDecimal;
import static java.math.BigDecimal.valueOf;

public class CheckNumbersByZeroTest {

    private final BigDecimal NEGATIVE_TWO = valueOf(2).negate();
    Validator validator = new Validator();

    @Test
    public void comparingDividendByZeroTest(){
       validator.comparingDividendByZero(NEGATIVE_TWO);
    }

    @Test
    public void comparingDividerByZeroTest(){
        validator.comparingDividerByZero(NEGATIVE_TWO);
    }
}
