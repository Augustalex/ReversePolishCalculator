package grupp03.calculatorApplication.inputControllers;

import grupp03.calculatorApplication.viewControllers.ViewController;

import java.io.FileNotFoundException;

/**
 * Created by August on 2016-09-20.
 */
public class InputControllerFactory {

    public static InputController newInputController(String filePath) {
        try {
            return new FileInputController(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static InputController newInputController(ViewController viewController) {
        return new ConsoleInputController(viewController);
    }

}
