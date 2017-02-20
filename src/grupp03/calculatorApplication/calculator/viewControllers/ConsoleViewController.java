package grupp03.calculatorApplication.viewControllers;

import grupp03.calculatorApplication.model.presentationModel.CalculatorPresentationModel;
import grupp03.views.View;
import grupp03.views.ViewFactory;

/**
 * Created by August on 2016-09-20.
 */
class ConsoleViewController implements ViewController {

    private CalculatorPresentationModel presentationModel = new CalculatorPresentationModel();
    private View view;

    public ConsoleViewController() {
        this.view = ViewFactory.newView();
    }

    @Override
    public void displayResult(double result) {
        this.view.printLine(presentationModel.getResultPreMessage() + presentationModel.formatResult(result));
    }

    @Override
    public void displayMessage(String message) {
        this.view.printLine(message);
    }

    @Override
    public void close() {
        this.view.printLine(presentationModel.getProgramExitMessage());
        this.view.close();
    }
}
