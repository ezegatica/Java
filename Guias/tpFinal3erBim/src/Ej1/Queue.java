package Ej1;

//INTERFAZ
public interface Queue<P> extends Iterable<P>{
  // Agregar elemento
  boolean add(P p) throws EmptyQueueException; // tira excepcion si la cola esta llena

  boolean isEmpty();

  // Consultar elementos
  P pop() throws EmptyQueueException; // devuelve el primero y lo elimine de la cola

  P peek(); // revisar cual es el primero sin eliminarlo

  // P min(Comparator<MedicalShifts> comparator);
  P min(Comparator<P> comparator);

  P max();

  // Utils
  void sort();
}
