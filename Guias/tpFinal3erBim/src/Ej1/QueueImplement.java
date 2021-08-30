package Ej1;
import java.util.Arrays;


public class QueueImplement<P> implements Queue<P>{
    private P[] elements;
    private static final int INITIAL_DIM = 10;
    public QueueImplement(){
      elements = new P[INITIAL_DIM];
    }
  
    @Override
    public boolean add(P persona) throws EmptyQueueException {
      throw new EmptyQueueException();
      //return true; //añadir a la cüeue
    }
  }