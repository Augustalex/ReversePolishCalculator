package grupp03.tokens.exceptions;

/**
 * Created by August on 2016-09-19.
 */
public class OperatorModuleException extends Exception {
    public OperatorModuleException(String classPath) {
        super("Invalid declaration of Operator in " + classPath);
    }
}
