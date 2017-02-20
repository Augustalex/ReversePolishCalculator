package grupp03.tokens.operators;

import grupp03.tokens.exceptions.OperatorModuleException;
import grupp03.tokens.Operator;

/**
 * Created by August on 2016-09-19.
 */
public class OperatorModule {
    public String operatorSign;
    public String classPath;
    public String className;
    public boolean isSingleFunction = true;
    public String functionName;

    public OperatorModule(String operatorSign, String className, String classPath) {
        this.operatorSign = operatorSign;
        this.className = className;
        this.classPath = classPath;
    }

    public OperatorModule(String operatorSign, String className, String classPath, String functionName) {
        this(operatorSign, className, classPath);
        this.functionName = functionName;
        this.isSingleFunction = false;
    }

    public Operator loadModule() throws OperatorModuleException {
        try {
            if (!this.isSingleFunction)
                return (Operator) Class.forName(this.classPath + "." + className).
                        getConstructor(String.class).
                        newInstance(functionName);
            else
                return (Operator) Class.forName(this.classPath + "." + className).
                        newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new OperatorModuleException(this.classPath);
        }
    }

    public String getOperatorSign() {
        return this.operatorSign;
    }
}
