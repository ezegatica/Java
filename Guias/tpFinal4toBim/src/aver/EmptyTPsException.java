package aver;

public class EmptyTPsException extends RuntimeException {
    private static final String message = "You have already corrected all the tps.";
    public EmptyTPsException() {
        super(message);
    }
}