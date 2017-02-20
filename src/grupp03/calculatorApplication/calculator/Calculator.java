package grupp03.calculatorApplication;

import grupp03.calculatorApplication.calculatorControllers.CalculatorController;
import grupp03.calculatorApplication.calculatorControllers.CalculatorControllerFactory;
import grupp03.reversePolishCalculator.ReversePolishController;

public class Calculator {

    public static void main(String[] args) {


        CalculatorController calculator;

        try {

            calculator = CalculatorControllerFactory.newCalculatorController(args);
            ReversePolishController rpc = new ReversePolishController();
            calculator.run(rpc);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
