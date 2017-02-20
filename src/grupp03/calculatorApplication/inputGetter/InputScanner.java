package grupp03.inputGetter;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by August on 2016-09-22.
 */
public class InputScanner implements InputGetter {
    private Scanner scanner;

    public InputScanner(InputStream inputStream){
        this.scanner = new Scanner(inputStream);
    }

    @Override
    public String getLine() {
        return scanner.nextLine();
    }

    @Override
    public boolean hasMoreInput() {
        return scanner.hasNextLine();
    }

    @Override
    public void close() {
        scanner.close();
    }
}
