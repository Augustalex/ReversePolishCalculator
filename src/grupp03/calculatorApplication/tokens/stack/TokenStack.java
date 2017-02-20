package grupp03.calculatorApplication.tokens.token.stack;

import grupp03.calculatorApplication.tokens.token.Token;

/**
 * Created by August on 2016-09-16.
 */
public class TokenStack<T extends Token> implements Stack<T> {

    private java.util.Stack<T> stack;

    public TokenStack() {
        this.stack = new java.util.Stack<>();
    }

    @Override
    public T pop() {
        return this.stack.pop();
    }

    @Override
    public void push(T element) {
        this.stack.push(element);
    }

    @Override
    public int getSize() {
        return this.stack.size();
    }

}
