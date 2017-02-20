package grupp03.tokens.operators;

import grupp03.tokens.Operand;

class Modulus extends Obelus {

    private String sign = "%";

    @Override
    public String toString() {
        return this.sign;
    }

    protected Operand uncheckedOperation(Operand a, Operand b) {
        return new Operand(a.getValue() % b.getValue());
    }
}
