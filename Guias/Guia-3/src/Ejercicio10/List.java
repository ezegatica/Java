package Ejercicio10;

import java.lang.Iterable;
public interface List <T> extends Iterable <T>{

    boolean isEmpty();
    void add(T element);
    int contains(T element);
    boolean remove(int index);

}