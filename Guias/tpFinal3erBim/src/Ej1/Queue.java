package Ej1;

import java.util.Collection;
import java.lang.Iterable;

//INTERFAZ
public interface Queue<P> extends Collection<P> {
  // Agregar elemento
  boolean add(P p); // tira excepcion si la cola esta llena

  // Consultar elementos
  P pop() throws EmptyQueueException; // devuelve el primero y lo elimine de la cola

  P peek(); // revisar cual es el primero sin eliminarlo

  P min();

  P max();

  // Utils
  void sort();
}
