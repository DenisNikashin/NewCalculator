package validatorTest;

import calculator.Validator;
import org.junit.Assert;
import org.junit.Test;

public class CheckInputCharactersTest {


    @Test
    public void testCheckingInputCharacters() {

        Validator validator = new Validator();
        String inputString = "2475";
        String inputString2 = " ksj879";
        Assert.assertTrue(validator.checkingInputCharacters(inputString));
        Assert.assertFalse("ERROR",validator.checkingInputCharacters(inputString2));
    }
}

