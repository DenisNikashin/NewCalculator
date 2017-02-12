package calculator;

import java.io.IOException;

public class Executor {
    private PrintOutConsol printOut;

    private Executor(PrintOutConsol printOut){
        this.printOut = printOut;
    }

    public static void main(String[] args) throws IOException {
        final NumbersInput numbersInput = new NumbersInput(new Validator());
        final Calculator calculator = new Calculator();
        final Executor executorPrint = new Executor(new PrintOutConsol(numbersInput, calculator));

        System.out.println("Please. Enter two numbers greater than zero");

        numbersInput.enteringStringDividend();
        numbersInput.enteringDividend();

        numbersInput.enteringStringDivider();
        numbersInput.enteringDivider();

        numbersInput.checkInputDivisorAndDividend();

        executorPrint.printOut.printingDivisionResults();
    }
}