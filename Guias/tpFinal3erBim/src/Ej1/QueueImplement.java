package Ej1;
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
    P min = elements[0]; // Guardo el primer elemento (para tener una referencia y/o dato real)
    for (int i = 0; i < cantidad; i++) { //itero por todos los elementos del array
      if (comp.compare(min, elements[i]) > 0) { // Pregunta si el segundo parametro es menor al segundo (alfabeticamente)
        min = elements[i]; //guardo el nuevo minimo con el valor por el que voy
      }
    }
    return min; //devuelvo el minimo
  }

  @Override
  public P max(Comparator<P> comp) {
    P max = elements[0]; // Guardo el primer elemento (para tener una referencia y/o dato real)
    for (int i = 0; i < cantidad; i++) { //itero por todos los elementos del array
      if (comp.compare(elements[i], max) > 0) { // Pregunta si el primer parametro es mayor al segundo (alfabeticamente)
        max = elements[i]; //guardo el nuevo maximo con el valor por el que voy
      }
    }
    return max; //devuelvo el maximo
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