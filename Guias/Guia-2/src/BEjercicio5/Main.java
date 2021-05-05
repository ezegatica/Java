package BEjercicio5;
// Compilar el siguiente programa. Explicar qué hace y probar que

// funcione correctamente.
// Luego, contestar las siguientes preguntas:
//  a) ¿valueOf es un método de instancia o de clase? ¿Para qué sirve?
        // valueOf es un metodo de clase, convierte un string a un integer, para poder realizar operaciones aritmeticas con este string
//  b) ¿toString es un método de instancia o de clase? ¿Para qué sirve?
        // toString es un metodo de instancia, sirve para convertir cualquier tipo de variable a un string, o para agregarlo a algun string mas largo 
//  c) ¿Hubiera sido lo mismo invocar a System.out.println(suma)? Si es así,
// ¿por qué no hay un error de compilación al pasarle un Integer a un
// método que recibe String?
        // en todos los caoss, el println no toma solo strings, sino que toma un objeto, asi que es capaz de tomar cualquier tipo de variable y mostrarla

public class Main {
    public static void main(String[] args) {
        Integer valor1 = Integer.valueOf("1");
        Integer valor2 = Integer.valueOf("2");
        Integer suma = valor1 + valor2;
        System.out.println(suma);
    }
}
