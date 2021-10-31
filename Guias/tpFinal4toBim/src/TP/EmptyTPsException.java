package TP;

public class EmptyTPsException extends Exception {
    private static final String message = "You have already corrected all the tps.";
    public EmptyTPsException() {
        super(message);
    }
}