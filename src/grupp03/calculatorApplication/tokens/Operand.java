package grupp03.calculatorApplication.tokens.operand;

import grupp03.calculatorApplication.tokens.token.Token;

public class Operand extends Token {

    private double value;

    public Operand(double value) throws ArithmeticException {
        this.setValue(value);
    }

    public static boolean isValue(String string) {
        return string.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
