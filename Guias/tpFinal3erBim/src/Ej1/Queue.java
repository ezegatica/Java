package Ej1;
import java.util.Collection;

//INTERFAZ
public interface Queue<P> extends Collection<P> {
  // Agregar elemento
  boolean add(P p); //tira excepcion si la cola esta llena
  boolean offer(P p); //tira false si la cola esta llena

  // Desencular elemento
  P remove(); //excepcion si la cola esta vacia
  P poll(); //null si la cola esta vacia

  // Consultar elementos
  P pop();
  P element(); //exceptrion si esta vacia
  P peek(); //null si esta vacia
  P min();
  
  // Utils
  void sort();
}

