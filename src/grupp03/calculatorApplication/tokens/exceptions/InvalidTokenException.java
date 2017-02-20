package grupp03.tokens.exceptions;

/**
 * Created by August on 2016-09-22.
 */
public class InvalidTokenException extends Exception {

    public InvalidTokenException(String token){
        super("Invalid token: " + token);
    }
}
