package grupp03.calculatorApplication.calculator.model;

/**
 * Created by August on 2016-09-27.
 */
public interface ExpressionCalculatorStrategy<T> {

    T calculate(String expression);
}
