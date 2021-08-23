package Ejercicio10;

import java.util.Iterator;
import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private T[] elements;
    private int dim;
    private static int INITIAL_DIM = 5;

    public ArrayList() {
        elements = (T[]) new Object[INITIAL_DIM];
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public void add(T element) {
        if (dim >= elements.length)
            resize();
        elements[dim++] = element;
    }

    @Override
    public int contains(T element) {
        for (int i = 0; i < dim; i++) {
            if (elements[i] == element)
                return i;
        }
        return -1;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= dim)
            return false;
        System.arraycopy(elements, index + 1, elements, index, dim - 1 - index); // copialo en bloque hasta index
        dim--;
        return true;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            public boolean hasNext() {
                if (index >= dim) {
                    return false;
                } else {
                    return true;
                }
            }

            public T next() {
                return elements[index++];
                // el index++ entre [] es para q guarde lo del index y DESPUES sume
            }
        };
    }

    private void resize() {
        Arrays.copyOf(elements, dim + INITIAL_DIM);
    }

}