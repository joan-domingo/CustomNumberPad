package cat.xojan.numpad;

/**
 * Exception thrown when {@link NumPadClickListener} is not set properly.
 */
public class NumPadListenerException extends RuntimeException {

    public NumPadListenerException(String message) {
        super(message);
    }
}
