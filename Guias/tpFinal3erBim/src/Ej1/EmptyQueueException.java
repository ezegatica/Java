public class EmptyQueueException extends Exception {
    private static final String MESSAGE = "La cueue está vacia :(";
  
    public EmptyQueueException() {
      super(MESSAGE);
    }
  }