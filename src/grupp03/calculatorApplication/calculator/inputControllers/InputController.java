package grupp03.calculatorApplication.inputControllers;

import grupp03.inputGetter.InputGetter;

/**
 * Created by August on 2016-09-20.
 */
public abstract class InputController{
    protected InputGetter inputScanner;

    InputController(InputGetter inputGetter) {
        this.inputScanner = inputGetter;
    }

    public abstract String getCommandLine();

    public abstract boolean hasMoreInput();

    public void close(){
        this.inputScanner.close();
    }

}


