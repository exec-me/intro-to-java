package prac19.INN;

public class InvalidINNException extends Exception {
    public InvalidINNException(String errorMessage) {
        super(errorMessage);
    }

    public InvalidINNException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
