package grupp03.calculatorApplication.calculator.model.exceptions;

/**
 * Created by August on 2016-09-19.
 */
public class InvalidOperationException extends Exception {

    public InvalidOperationException() {
        super("Invalid Operation.");
    }

    public InvalidOperationException(String message) {
        super("Invalid Operation: " + message);
    }
}
