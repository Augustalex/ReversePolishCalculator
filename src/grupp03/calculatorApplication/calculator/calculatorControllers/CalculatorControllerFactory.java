package grupp03.calculatorApplication.calculatorControllers;

import grupp03.calculatorApplication.model.exceptions.InvalidProgramArguments;
import grupp03.calculatorApplication.inputControllers.InputController;
import grupp03.calculatorApplication.inputControllers.InputControllerFactory;
import grupp03.calculatorApplication.viewControllers.ViewController;
import grupp03.calculatorApplication.viewControllers.ViewControllerFactory;

/**
 * Created by August on 2016-09-20.
 */

public class CalculatorControllerFactory {

    public static CalculatorController newCalculatorController(String[] programArguments) throws InvalidProgramArguments {
        boolean noArguments = false;
        String inputPath = null;
        String outputPath = null;

        ViewController viewController;
        InputController inputController;

        if(programArguments.length == 0)
            noArguments = true;
        else if(programArguments.length == 2){
            inputPath = programArguments[0];
            outputPath = programArguments[1];
        }
        else
            throw new InvalidProgramArguments();

        if (noArguments){
            viewController = ViewControllerFactory.newViewController();
            inputController = InputControllerFactory.newInputController(viewController);
        }
        else{
            viewController = ViewControllerFactory.newViewController(outputPath);
            inputController = InputControllerFactory.newInputController(inputPath);
        }

        return new CalculatorController(viewController, inputController);
    }
}
