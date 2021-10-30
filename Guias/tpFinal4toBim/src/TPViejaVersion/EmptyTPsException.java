package TPViejaVersion;

public class EmptyTPsException extends Exception {
    private static final String MESSAGE = "You  have  already  corrected  all  the  tps.";

    EmptyTPsException() {
        super(MESSAGE);
    }

}