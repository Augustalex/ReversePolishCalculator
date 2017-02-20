package grupp03.calculatorApplication.inputControllers;

import grupp03.calculatorApplication.model.presentationModel.CalculatorPresentationModel;
import grupp03.inputGetter.InputScanner;
import grupp03.calculatorApplication.viewControllers.ViewController;

/**
 * Created by August on 2016-09-20.
 */
class ConsoleInputController extends InputController {

    private CalculatorPresentationModel presentationModel = new CalculatorPresentationModel();
    private ViewController viewController;

    ConsoleInputController(ViewController viewController) {
        super(new InputScanner(System.in));

        this.viewController = viewController;
    }

    @Override
    public String getCommandLine() {
        this.viewController.displayMessage(presentationModel.getCalculatorHelpMessage());
        return this.inputScanner.getLine();
    }

    @Override
    public boolean hasMoreInput() {
        return true;
    }
}
