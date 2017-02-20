package grupp03.calculatorApplication.expressionCalculator.infixCalculator;

import grupp03.calculatorApplication.tokens.Token;
import grupp03.calculatorApplication.tokens.stack.TokenStack;
import grupp03.calculatorApplication.tokens.stack.TokenStrategy;

/**
 * Created by August on 2016-10-07.
 */
public class InfixTokenStrategy extends TokenStrategy {

    public InfixTokenStrategy(TokenStack<Token> tokens) {
        super(tokens);
    }

    @Override
    public double getValue() {
        return this.tokens.pop().getValue(this);
    }
}
