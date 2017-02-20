package grupp03.views;

import java.io.FileNotFoundException;

/**
 * Created by August on 2016-09-19.
 */
public class ViewFactory {

    public static View newView() {
        return new ConsoleView();
    }

    public static View newView(String filePath) {
        try {
            return new FileView(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
