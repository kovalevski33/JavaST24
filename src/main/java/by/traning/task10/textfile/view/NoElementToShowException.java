package by.traning.task10.textfile.view;

public class NoElementToShowException extends Exception {

    public NoElementToShowException() {
    }

    public NoElementToShowException(String message) {
        super(message);
    }

    public NoElementToShowException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoElementToShowException(Throwable cause) {
        super(cause);
    }
}
