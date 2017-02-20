package grupp03.calculatorApplication.tokens.stack;

import grupp03.calculatorApplication.tokens.Token;

/**
 * Created by August on 2016-09-30.
 */
public class ReverseTokenStrategy extends TokenStrategy {

    private boolean noTempReverseValue = true;
    private double tempReverseValue;

    public ReverseTokenStrategy(TokenStack<Token> tokens){
        super(tokens);
    }

    @Override
    public double getValue() {
        if(noTempReverseValue) {
            this.noTempReverseValue = false;
            this.tempReverseValue = this.tokens.pop().getValue(this);
            return this.tokens.pop().getValue(this);
        }
        else{
            this.noTempReverseValue = true;
            return this.tempReverseValue;
        }
    }
}
