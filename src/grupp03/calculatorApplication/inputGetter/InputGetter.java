package grupp03.inputGetter;

/**
 * Created by August on 2016-09-20.
 */
public interface InputGetter {
    String getLine();

    boolean hasMoreInput();

    void close();
}
