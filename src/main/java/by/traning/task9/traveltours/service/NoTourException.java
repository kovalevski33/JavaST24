package by.traning.task9.traveltours.service;

public class NoTourException extends Exception {
    public NoTourException() {
    }

    public NoTourException(String message) {
        super(message);
    }

    public NoTourException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoTourException(Throwable cause) {
        super(cause);
    }

    public NoTourException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
