package Ej1;

import java.util.Arrays;
import java.util.Comparator;

public class QueueImplement<P> implements Queue<P> {
  private P[] elements;
  private static int INITIAL_DIM = 10;
  private int cantidad = 0;

  public QueueImplement() {
    P[] elements = (P[]) new Comparable[INITIAL_DIM]; // Creación de un array de elementos genéricos comparables
    this.elements = elements;
  }

  @Override
  public boolean add(P persona) {
    try {
      if (cantidad == elements.length) {
        throw new EmptyQueueException();
      }
      elements[cantidad++] = persona;
      return true;

    } catch (Exception e) {
      e.getMessage();
      return false;
    }

  }

  @Override
  public P peek() {
    return elements[0];
  }

  @Override
  public P pop() throws EmptyQueueException {
    P first = elements[0];
    this.elements = Arrays.copyOfRange(elements, 1, cantidad - 1);
    return first;
  }

  @Override
  public P min() {// devolver el mas pequeño en queue. Se puede sortear y dsp agarrar el ultimo
    sort();
    return elements[0];
  }

  @Override
  public P max() { // devuelve el mas grande en queue. Se puede sortear y dsp agarrar el ultimo
    sort();
    return elements[cantidad - 1];
  }

  @Override
  public void sort() { // sortear por el indice (2do parametro)
    Arrays.sort(elements, new Comparable<P>() {
      @Override
      public int compare(P o1, P o2) {
        return o1.getLugar().compareTo(o2.getLugar());
      }
    });
  }

  @Override
  public boolean isEmpty() {
    return cantidad == 0;
  }
}