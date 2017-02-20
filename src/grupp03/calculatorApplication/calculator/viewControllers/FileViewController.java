package grupp03.calculatorApplication.viewControllers;

import grupp03.calculatorApplication.model.presentationModel.CalculatorPresentationModel;
import grupp03.views.View;
import grupp03.views.ViewFactory;

/**
 * Created by August on 2016-09-20.
 */
class FileViewController implements ViewController {

    private CalculatorPresentationModel presentationModel = new CalculatorPresentationModel();
    private View view;

    public FileViewController(String outputPath) {
        this.view = ViewFactory.newView(outputPath);
    }

    @Override
    public void displayResult(double result) {
        this.view.printLine(presentationModel.formatResult(result));
    }

    @Override
    public void displayMessage(String message) {
        this.view.printLine(message);
    }

    @Override
    public void close() {
        this.view.close();
    }
}
