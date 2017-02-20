package grupp03.tokens.operators;


import grupp03.calculatorApplication.model.exceptions.InvalidOperationException;
import grupp03.tokens.exceptions.InvalidOperatorModuleException;
import grupp03.tokens.Operand;
import grupp03.tokens.Operator;
import grupp03.tokens.stack.TokenStack;

import java.lang.reflect.Method;

/**
 * Created by August on 2016-09-18.
 */
class Math extends Operator {

    private int arity;
    private Class module;
    private String functionName;
    private Method function = null;

    public Math(String functionName) throws InvalidOperatorModuleException {
        this.functionName = functionName;

        try {
            this.module = Class.forName("java.lang.Math");

            for (Method m : this.module.getDeclaredMethods())
                if (m.toString().contains("Math." + this.functionName + "("))
                    this.function = m;


            if (this.function == null)
                throw new InvalidOperatorModuleException();

            this.arity = this.function.getParameterCount();
        } catch (Exception e) {
            throw new InvalidOperatorModuleException();
        }
    }

    @Override
    public String toString() {
        return this.functionName;
    }

    @Override
    public Operand calculate(TokenStack<Operand> operands) throws ArithmeticException, InvalidOperationException, InvalidOperatorModuleException {
        if (this.arity > operands.getSize())
            throw new InvalidOperationException();

        Object[] arguments = new Object[this.arity];
        for (int i = 0; i < this.arity; i++)
            arguments[i] = operands.pop().getValue();

        try {
            if (this.function.getReturnType() == double.class)
                return new Operand((Double) this.function.invoke(this.module, arguments));
            else
                throw new Exception();
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            throw new InvalidOperatorModuleException();
        }
    }

    @Override
    public int getArity() {
        return this.arity;
    }
}
