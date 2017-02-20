package grupp03.calculatorApplication.viewControllers;

/**
 * Created by August on 2016-09-22.
 */
public class ViewControllerFactory {

    public static ViewController newViewController(){
        return new ConsoleViewController();
    }

    public static ViewController newViewController(String outputPath){
        return new FileViewController(outputPath);
    }
}
