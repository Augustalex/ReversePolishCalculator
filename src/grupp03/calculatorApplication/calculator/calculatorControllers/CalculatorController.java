package grupp03.calculatorApplication.calculatorControllers;

import grupp03.calculatorApplication.inputControllers.InputController;
import grupp03.reversePolishCalculator.ReversePolishController;
import grupp03.calculatorApplication.viewControllers.ViewController;

/**
 * Created by August on 2016-09-08.
 */
public class CalculatorController {

    private boolean programOn = false;

    private ViewController viewController;
    private InputController inputController;

    public CalculatorController(ViewController viewController, InputController inputController){
        this.viewController = viewController;
        this.inputController = inputController;
    }

    public void run(ReversePolishController rpc){
        this.programOn = true;

        while(this.programOn && this.inputController.hasMoreInput()){
            String input = this.inputController.getCommandLine();

            try {
                if (input.isEmpty())
                    this.closeProgram();
                else
                    this.viewController.displayResult(rpc.calculate(input));
            }
            catch(Exception e){
                this.viewController.displayMessage(e.getMessage());
            }
        }
    }

    public void closeProgram(){
        this.programOn = false;
        this.inputController.close();
        this.viewController.close();
    }
}
