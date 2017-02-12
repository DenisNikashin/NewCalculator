package validatorTest;

import calculator.Validator;
import org.junit.Test;
import java.math.BigDecimal;
import static java.math.BigDecimal.valueOf;


public class CheckTheDivisorAndDividendTest {

    private final BigDecimal DVDNT = valueOf(8);
    private final BigDecimal DVSR = valueOf(16);

    @Test
    public void testComparingTheDivisorAndDividend(){
        Validator validator = new Validator();
        validator.comparingTheDivisorAndDividend(DVDNT, DVSR);
    }
}
