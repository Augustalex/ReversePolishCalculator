package grupp03.views;

import java.io.PrintStream;

/**
 * Created by August on 2016-09-20.
 */
class PrintView implements View {
    private PrintStream printStream;

    public PrintView(PrintStream printStream) {
        this.setPrintStream(printStream);
    }

    private void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public <T> void printLine(T line) {
        printStream.println(line);
    }

    @Override
    public void close() {
        this.printStream.close();
    }
}
