package grupp03.tokens.operators;

import grupp03.tokens.Operand;
import grupp03.tokens.Operator;
import grupp03.tokens.stack.TokenStack;

/**
 * Created by August on 2016-09-06.
 */
class Obelus<T extends Number> extends Operator {

    private int arity = 2;
    private String sign = "/";

    @Override
    public String toString() {
        return this.sign;
    }

    @Override
    public Operand calculate(TokenStack<Operand> operands) throws ArithmeticException {
        Operand a = operands.pop();
        Operand b = operands.pop();
        if (isValidOperation(a, b))
            return uncheckedOperation(a, b);
        else
            return new Operand(0);
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    protected Operand uncheckedOperation(Operand a, Operand b) {
        return new Operand(a.getValue() / b.getValue());
    }

    protected boolean isValidOperation(Operand a, Operand b) throws ArithmeticException {
        if (b.getValue() == 0)
            throw new ArithmeticException("Division by zero: " + a.toString() + "/" + b.toString());
        else
            return true;
    }

}
