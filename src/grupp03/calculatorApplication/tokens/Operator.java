package grupp03.calculatorApplication.tokens.operators;

import grupp03.calculatorApplication.tokens.operand.Operand;
import grupp03.calculatorApplication.tokens.exceptions.InvalidOperationException;
import grupp03.calculatorApplication.tokens.exceptions.InvalidOperatorModuleException;
import grupp03.calculatorApplication.tokens.token.stack.TokenStack;
import grupp03.calculatorApplication.tokens.token.Token;

/**
 * Created by August on 2016-09-06.
 */
public abstract class Operator extends Token {

    public abstract Operand calculate(TokenStack<Operand> operands) throws ArithmeticException, InvalidOperationException, InvalidOperatorModuleException;

    public abstract int getArity();
}