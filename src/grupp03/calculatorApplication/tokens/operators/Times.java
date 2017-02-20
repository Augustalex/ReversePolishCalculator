package grupp03.tokens.operators;

import grupp03.tokens.Operand;
import grupp03.tokens.Operator;
import grupp03.tokens.stack.TokenStack;

/**
 * Created by August on 2016-09-06.
 */
class Times extends Operator {

    private int arity = 2;
    private String sign = "*";

    @Override
    public String toString() {
        return this.sign;
    }

    @Override
    public Operand calculate(TokenStack<Operand> operands) throws ArithmeticException {
        return new Operand(operands.pop().getValue() * operands.pop().getValue());
    }

    @Override
    public int getArity() {
        return this.arity;
    }
}
