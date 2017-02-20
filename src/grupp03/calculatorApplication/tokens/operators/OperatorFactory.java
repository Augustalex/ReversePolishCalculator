package grupp03.tokens.operators;

import grupp03.tokens.exceptions.OperatorModuleException;
import grupp03.tokens.Operator;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by August on 2016-09-06.
 */
public class OperatorFactory {

    private static String availableOperators = "operations.txt";
    private String operatorsClassPath = "grupp03.tokens.operators";

    private ArrayList<OperatorModule> modules = new ArrayList<>();

    private static String assignmentOperator = "=>";

    public OperatorFactory() throws OperatorModuleException {
        Scanner fileScanner;
        OperatorModule operatorModule;
        StringTokenizer words;
        String temp,
                operatorSign,
                className,
                functionName = null;

        try {
            fileScanner = new Scanner(new FileInputStream(OperatorFactory.availableOperators));
        } catch (Exception e) {
            throw new OperatorModuleException(OperatorFactory.availableOperators);
        }

        while (fileScanner.hasNextLine()) {
            words = new StringTokenizer(fileScanner.nextLine());

            if (words.countTokens() != 3)
                throw new OperatorModuleException(OperatorFactory.availableOperators);

            operatorSign = words.nextToken();
            temp = words.nextToken();
            if (!(temp.equals(OperatorFactory.assignmentOperator)))
                throw new OperatorModuleException(OperatorFactory.availableOperators);

            temp = words.nextToken();
            words = new StringTokenizer(temp, ".");

            className = words.nextToken();

            if (words.hasMoreElements())
                functionName = words.nextToken();

            if (functionName == null)
                operatorModule = new OperatorModule(operatorSign, className, this.operatorsClassPath);
            else
                operatorModule = new OperatorModule(operatorSign, className, this.operatorsClassPath, functionName);

            modules.add(operatorModule);
        }
    }

    public boolean isOperator(String operatorSign) {
        for (OperatorModule module : this.modules)
            if (module.getOperatorSign().equals(operatorSign))
                return true;

        return false;
    }

    public Operator newOperator(String operatorSign) throws OperatorModuleException {
        for (OperatorModule module : this.modules)
            if (module.getOperatorSign().equals(operatorSign))
                return module.loadModule();

        throw new ArithmeticException("Invalid token.");
    }

 /*   public Operator newOperator(String opSign) {
        Scanner fileScanner;

        try {
            fileScanner = new Scanner(new FileInputStream(OperatorFactory.availableOperators));
        }
        catch(Exception e){
            throw new ArithmeticException("Invalid declaration of operator in " + OperatorFactory.availableOperators);
        }

        StringTokenizer words;
        String word;
        do{
            if(!(fileScanner.hasNextLine()))
                throw new ArithmeticException("Invalid Token: " + opSign);

            words = new StringTokenizer(fileScanner.nextLine());
            if(words.hasMoreElements())
                word = words.nextToken();
            else
                throw new ArithmeticException("Invalid declaration of operator in " + OperatorFactory.availableOperators);

        }while(!(word.equals(opSign)));

        if(words.countTokens() < 2)
            throw new ArithmeticException("Invalid declaration of operator in " + OperatorFactory.availableOperators);

        word = words.nextToken(); // is string "=>"
        word = words.nextToken(); // is class name

        StringTokenizer classIdentifier = new StringTokenizer(word, ".");
        String className = classIdentifier.nextToken();

        try {
            if (classIdentifier.hasMoreElements()) {
                String functionName = classIdentifier.nextToken();

                return (Operator) Class.forName(OperatorFactory.operatorsClassPath + "." + className).
                        getConstructor(String.class).
                        newInstance(functionName);
            } else
                return (Operator) Class.forName(OperatorFactory.operatorsClassPath + "." + className).
                        newInstance();
        }
        catch(Exception e){
            throw new ArithmeticException("Invalid declaration of operator in " + OperatorFactory.availableOperators);
        }
    }
*/

}
