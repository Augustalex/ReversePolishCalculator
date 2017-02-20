package grupp03.tokens.exceptions;

/**
 * Created by August on 2016-09-19.
 */
public class InvalidOperatorModuleException extends Exception {

    public InvalidOperatorModuleException() {
        super("Invalid Operator Module.");
    }

    public InvalidOperatorModuleException(String message) {
        super("Invalid Operator Module: " + message);
    }

}
