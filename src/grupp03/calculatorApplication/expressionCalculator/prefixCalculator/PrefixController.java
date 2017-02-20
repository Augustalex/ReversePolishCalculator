package grupp03.calculatorApplication.expressionCalculator.infixCalculator;

import grupp03.calculatorApplication.expressionCalculator.ExpressionCalculatorStrategy;
import grupp03.calculatorApplication.tokens.Token;
import grupp03.calculatorApplication.tokens.exceptions.InvalidOperationException;
import grupp03.calculatorApplication.tokens.exceptions.InvalidOperatorModuleException;
import grupp03.calculatorApplication.tokens.exceptions.InvalidTokenException;
import grupp03.calculatorApplication.tokens.exceptions.OperatorModuleException;
import grupp03.calculatorApplication.tokens.stack.TokenStack;

/**
 * Created by August on 2016-10-07.
 */
public class InfixController implements ExpressionCalculatorStrategy<Double> {
    @Override
    public Double calculate(String expression) throws ArithmeticException, OperatorModuleException, InvalidOperationException, InvalidOperatorModuleException, InvalidTokenException {
        TokenStack<Token> tokenStack = Token.parseExpression(expression);
        InfixTokenStrategy strategy = new InfixTokenStrategy(tokenStack);
        double result = strategy.getValue();

        if(tokenStack.getSize() > 0)
            throw new InvalidOperationException();
        else
            return result;
    }
}
