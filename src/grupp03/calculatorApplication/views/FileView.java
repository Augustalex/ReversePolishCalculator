package grupp03.views;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by August on 2016-09-19.
 */
class FileView extends PrintView {

    public FileView(String filePath) throws FileNotFoundException {
        super(new PrintStream(filePath));
    }
}
