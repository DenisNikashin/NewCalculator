package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class NumbersInput {

    private Validator validator ;
    private String dividendString;
    private String dividerString;
    private BigDecimal dividend;
    private BigDecimal divider;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String ERROR_MESSAGE = "You're mistaken! The number must contain only digits!";

    NumbersInput(Validator validator){
        this.validator = validator;
    }

    NumbersInput(String dividendString, String dividerString) {
        this.dividendString = dividendString;
        this.dividerString = dividerString;
    }
    NumbersInput(String dividendString) {
        this.dividendString = dividendString;
    }

    NumbersInput(){ }

    void enteringStringDividend() throws IOException {
        while (true) {
            dividendString = bufferedReader.readLine();
            if (validator.checkingInputCharacters(dividendString)) {
                break;
            } else {
                System.out.println(ERROR_MESSAGE);
            }
        }
    }

    void enteringStringDivider() throws IOException {
        while (true) {
            dividerString = bufferedReader.readLine();
            if (validator.checkingInputCharacters(dividerString)) {
                break;
            } else {
                System.out.println(ERROR_MESSAGE);
            }
        }
    }

    void enteringDividend() throws IOException {
        while (true) {
            dividend = new BigDecimal(dividendString);
            if (validator.comparingDividendByZero(dividend)) {
                break;
            } else {
                dividendString = bufferedReader.readLine();
            }
        }
    }

    void enteringDivider() throws IOException {
        while (true) {
            divider = new BigDecimal(dividerString);
            if (validator.comparingDividerByZero(divider)) {
                break;
            } else {
                dividerString = bufferedReader.readLine();
            }
        }
    }

     void checkInputDivisorAndDividend() throws IOException {
        while (true){
            if (validator.comparingTheDivisorAndDividend(dividend, divider)) {
                break;
            } else {
                dividerString = bufferedReader.readLine();
                divider = new BigDecimal(dividerString);
            }
        }
     }

    public String getDividendString() {
        return dividendString;
    }

    public String getDividerString() {
        return dividerString;
    }

    public BigDecimal getDividend() {
        return dividend;
    }

    public BigDecimal getDivider() {
        return divider;
    }
}
