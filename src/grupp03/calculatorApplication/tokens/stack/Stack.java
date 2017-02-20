package grupp03.calculatorApplication.tokens.token.stack;

/**
 * Created by August on 2016-09-16.
 */

public interface Stack<T> {

    T pop();

    void push(T element);

    int getSize();
}
