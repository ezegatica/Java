package Ej1;

//que falta=
// El sort
// que coño hay que pasar en el min()
import java.util.Arrays;
import java.util.Iterator;

public class QueueImplement<P> implements Queue<P> {
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
    sort();
    return elements[0];
  }

  @Override
  public P pop() throws EmptyQueueException {
    sort();
    P first = elements[0];
    this.elements = Arrays.copyOfRange(elements, 1, elements.length); // si hay error, es - 1
    cantidad--;
    return first;
  }

  @Override
  public P min(Comparator<MedicalShifts> comparator) {// devolver el nomre mas pequeñajo. Se puede sortear y dsp agarrar el primero
    return elements[0];
  }

  @Override
  public P max() { // devuelve el nombre mas grandajo. Se puede sortear y dsp agarrar el ultimo
    return elements[cantidad - 1];
  }

  @Override
  public void sort() { // sortear por el indice (2do parametro)
    // Arrays.sort(elements, 0, cantidad - 1);
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