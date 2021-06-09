package Ej1;
import java.util.Arrays;

//Crear la clase ArrayIntegerList que implemetnte la interfaz anterior utilizando un array

//Al momento de crera un objeto de la clase, puedas especificar el valor maximo que va a tener

//Si el array se queda sin espacio lanzar una excepcion llamada ArrayIndexOutOfBoundException
//¿No me va afectar al signature lanzar esa excepcion?
//usen System.ArrayCopy para hacer el remove

public class ArrayIntegerListCopy implements IntegerList {
    private Integer[] elements;
    private int dim;
    private int maximo;

    public ArrayIntegerListCopy(int maximo) {
        elements = new Integer[maximo];
        this.maximo = maximo;
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    public void add(int element) {
        if (dim >= elements.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        elements[dim++] = element;

    }

    public int contains(int element) {
        for (int i = 0; i < dim; i++) {
            if (elements[i] == element) {
                return 1;
            }
        }
        return -1;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= dim) {
            return false;
        }
        System.arraycopy(elements, index + 1, elements, index, dim - index - 1);
        dim--;
        return true;
    }

    public String toString() {
        StringBuilder str;
        str = new StringBuilder();
        str.append("Array: ");
        for (int i = 0; i < dim; i++) {
            if (i != dim - 1) {
                str.append(elements[i] + ", ");
            } else {
                str.append(elements[i]);
            }
        }
        return str.toString();
    }

    // Investigar cómo es conveniente agrandar el array si es necesario.
    // Sacar del constructor de la clase ArrayIntegerList la parte de que envíe un
    // máximo y editar el add para que se pueda agregar una cantidad sin limites de
    // elementos al array
    public String getMaximo() {
        return "Maximo: " + maximo;
    }

    public void addMaximo(int valor) {
        maximo += valor;
        Arrays.copyOf(elements, maximo);
    }
}
