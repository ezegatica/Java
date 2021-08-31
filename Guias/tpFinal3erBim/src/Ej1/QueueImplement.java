package Ej1;

import java.util.Arrays;

public class QueueImplement<P> implements Queue<P> {
  private P[] elements;
  private static int INITIAL_DIM = 10;
  private int cantidad = 0;

  public QueueImplement() {
    elements = (P[]) new Comparable[INITIAL_DIM]; // Creación de un array de elementos genéricos comparables
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
  public P pop() {
    // eliminar, pero antes guardar un clon para que se guarde el valor
    return elements[0];
  }

  @Override
  public P min() {
    return elements[0]; // devolver el mas pequeño
  }

  @Override
  public P max() {
    return elements[0]; // devuelve el mas grande
  }

  @Override
  public void sort() {
    Arrays.sort(elements, 0, 10);
  }

  @Override
  public boolean isEmpty() {
    return cantidad == 0;
  }
}