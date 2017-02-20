package grupp03.calculatorApplication.model.exceptions;

/**
 * Created by August on 2016-09-22.
 */
public class InvalidProgramArguments extends Exception{
    public InvalidProgramArguments() {
        super("Syntax: java Calculator [källfil destinationsfil]");
    }
}
