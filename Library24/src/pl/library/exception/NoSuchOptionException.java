package pl.library.exception;

public class NoSuchOptionException extends RuntimeException {
    public NoSuchOptionException(String message) {
        super(message);
    }
}