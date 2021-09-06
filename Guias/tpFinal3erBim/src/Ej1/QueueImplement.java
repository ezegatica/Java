package Ej1;

//que falta=
// que coño hay que pasar en el min()
import java.util.Arrays;
import java.util.Iterator;

public class QueueImplement<P extends Comparable<P>> implements Queue<P> {
  private P[] elements;
  private static int INITIAL_DIM = 10;
  private int cantidad = 0;

  public QueueImplement() {
    P[] elements = (P[]) new Comparable[INITIAL_DIM]; // Creación de un array de elementos genéricos comparables
    this.elements = elements;
  }

  @Override
  public boolean add(P persona) throws EmptyQueueException {
    if (cantidad == elements.length) {
      throw new EmptyQueueException();
    }
    elements[cantidad++] = persona;
    return true;
  }

  @Override
  public P peek() {
    return elements[0];
  }

  @Override
  public P pop() throws EmptyQueueException {
    P first = elements[0];
    this.elements = Arrays.copyOfRange(elements, 1, elements.length); // si hay error, es - 1
    cantidad--;
    return first;
  }

  @Override
  public P min(Comparator<P> comp) {
    P[] tmp = elements.clone(); //Creamos un clon temporal del Array elements
    for (int i = 0; i < cantidad - 1; i++) { //Ciclo por todos los elementos del array
      for (int j = 0; j < cantidad - i - 1; j++) { //Compara cada elemento con todos los otros elementos
        if (comp.compare(tmp[j], tmp[j + 1]) > 0) { //Pregunta si el primer elemento es mayor al segundo (alfabeticamente) 
          P temp = tmp[j]; //Crea una variable temporal del tipo P a la cual se le mete el turno en la posición j
          tmp[j] = tmp[j + 1]; //Le resta una posicion al segundo elemento
          tmp[j + 1] = temp; //Le suma una posicion al primer elemento
        }
      }
    }
    return tmp[0];
  } 

  @Override
  public P max() { // devuelve el nombre mas grandajo. Se puede sortear y dsp agarrar el ultimo
    return elements[cantidad - 1];
  }

  @Override
  public void sort() {
    Arrays.sort(elements, 0, cantidad);
  }

  @Override
  public Iterator<P> iterator() {
    return new Iterator<P>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < cantidad;
      }

      @Override
      public P next() {
        return elements[index++];
      }
    };
  }

  @Override
  public boolean isEmpty() {
    return cantidad == 0;
  }
}