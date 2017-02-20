package grupp03.calculatorApplication.inputControllers;

import grupp03.inputGetter.InputScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by August on 2016-09-20.
 */
class FileInputController extends InputController {
    FileInputController(String filePath) throws FileNotFoundException {
        super(new InputScanner(new FileInputStream(filePath)));
    }

    @Override
    public String getCommandLine() {
        return this.inputScanner.getLine();
    }

    @Override
    public boolean hasMoreInput() {
        return this.inputScanner.hasMoreInput();
    }
}
