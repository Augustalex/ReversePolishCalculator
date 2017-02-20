package grupp03.calculatorApplication.model.presentationModel;

/**
 * Created by August on 2016-09-22.
 */
public class CalculatorPresentationModel {

    public String formatResult(double result){
        return String.format("%.2f", result);
    }

    public String getCalculatorHelpMessage(){
        return "Ange RPN uttryck <retur> (tom sträng = avsluta): ";
    }

    public String getResultPreMessage(){
        return "Result: ";
    }

    public String getProgramExitMessage(){
        return "Användaren avslutade applikationen";
    }
}
