package calculator;

class PrintOutConsol {
    private NumbersInput numbersInput;
    private Calculator calculator;

    public PrintOutConsol(NumbersInput numbersInput, Calculator calculator) {
        this.numbersInput = numbersInput;
        this.calculator = calculator;
    }

    void printLineWithTheDividendAndDivider(NumbersInput numbers) {
        System.out.printf(" %s | %s \n",numbers.getDividendString(), numbers.getDividerString());
    }
    void printCalculate(Calculator calculator, NumbersInput numbersInput) {
        calculator.calculate(numbersInput.getDividend(), numbersInput.getDivider());
    }

    void printQuotient(Calculator calc) {
        System.out.println("Quotient --> " );
    }

    void printingDivisionResults() {
        PrintOutConsol printOutConsol = new PrintOutConsol(new NumbersInput(), new Calculator());

        printOutConsol.printLineWithTheDividendAndDivider(numbersInput);
        printOutConsol.printCalculate(calculator, numbersInput);
        printOutConsol.printQuotient(calculator);

    }


}
