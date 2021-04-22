package BEjercicio5;
// Compilar el siguiente programa. Explicar qué hace y probar que
// funcione correctamente.
// Luego, contestar las siguientes preguntas:
    //  a) ¿valueOf es un método de instancia o de clase? ¿Para qué sirve?
            // valueOf es un metodo de ?!#!?"#!"?#
    //  b) ¿toString es un método de instancia o de clase? ¿Para qué sirve?
            // toString es un metodo de clase, sirve para convertir cualquier tipo de variable a un string, para poder mostrarlo en un System out println, o para agregarlo a algun string mas largo 
    //  c) ¿Hubiera sido lo mismo invocar a System.out.println(suma)? Si es así,
    // ¿por qué no hay un error de compilación al pasarle un Integer a un
    // método que recibe String?
            // porque en este caso es lo unico que se muestra ?no tengo ni idea

public class Main {
    public static void main(String[] args) {
        Integer valor1 = Integer.valueOf(args[0]);
        Integer valor2 = Integer.valueOf(args[1]);
        Integer suma = valor1 + valor2;
        System.out.println("hola" + suma);
    }
}
