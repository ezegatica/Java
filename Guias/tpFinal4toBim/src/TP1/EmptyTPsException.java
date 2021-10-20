package TP1;
public class EmptyTPsException extends Exception {
    private static final String MESSAGE = "Descripción del error.";

    EmptyTPsException() {
        super(MESSAGE);
    }

}