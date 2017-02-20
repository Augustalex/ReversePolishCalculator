package grupp03.calculatorApplication.reversePolishCalculator;

import grupp03.calculatorApplication.calculator.model.ExpressionCalculatorStrategy;
import grupp03.calculatorApplication.tokens.exceptions.InvalidOperationException;
import grupp03.calculatorApplication.tokens.TokenParser;
import grupp03.calculatorApplication.tokens.exceptions.InvalidOperatorModuleException;
import grupp03.calculatorApplication.tokens.exceptions.InvalidTokenException;
import grupp03.calculatorApplication.tokens.exceptions.OperatorModuleException;
import grupp03.calculatorApplication.tokens.Token;
import grupp03.calculatorApplication.tokens.stack.TokenStack;

/**
 * Created by August on 2016-09-21.
 */
public class ReversePolishController implements ExpressionCalculatorStrategy {

    public double calculate(String commandLine) throws ArithmeticException, OperatorModuleException, InvalidOperationException, InvalidOperatorModuleException, InvalidTokenException {
        Number result;
        TokenStack<Token> tokens;

        tokens = TokenParser.parseExpression(commandLine);
        ReversePolishModel calculator = new ReversePolishModel(tokens);
        result = calculator.getValue().getValue();

        if (tokens.getSize() != 0)
            throw new ArithmeticException("Invalid Operation");

        return (Double) result;
    }

}
