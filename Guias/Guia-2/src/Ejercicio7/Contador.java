package Ejercicio7;
// 5.b)Se desea modelar un objeto contador que permita incrementos y
// decrementos de a N, donde N es un parámetro definido por el usuario al
// momento de la creación del objeto (pensar cómo relacionarlo con el Ejercicio
// 6.a sin modificar la clase creada anteriormente)
        // a)Se desea modelar un objeto contador, cada contador cuenta con un valor
        // entero y al momento de su creación ese valor es igual a cero. Se debe permitir
        // incrementar y decrementar su valor además de poder consultarlo en todo
        // momento.
        // Identificar los campos que tendrá la clase así como los métodos
        // necesarios.(ejercicio de la primera clase)

// hacer un programa de prueba para verificar los métodos.
public class Contador {
    private int N;
    public Contador(){
        N = 0;
    }
    public int getCantidad(){
        return N;
    }
    public int incrementar(){
        N += 1;
        return N;
    }
    public int decrementar(){
        N -= 1;
        return N;
    }
}