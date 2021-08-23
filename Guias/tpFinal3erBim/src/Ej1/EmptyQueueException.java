package Ej1;

public class EmptyQueueException extends Exception {
    public String getMessage(){
        return "La cola esta vacia";
    }
}
