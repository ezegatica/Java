package BEjercicio4;

public class Main{
    public static void main(String args[]) {
        String s = "hola";
        System.out.println(s instanceof String); // true: Pregunta si S es una instancia de un string, al hacer String s estamos diciendoque la variable S va a ser un String nuevo
        System.out.println(s instanceof Object); // true: Pregunta si s es una instancia de un objeto, lo cual es cierto, ya que String 
        System.out.println(s.getClass()); // para ver que devuelve el getClass()
        System.out.println(s.getClass().equals(String.class)); //true: S es una instancia de la clase String
        System.out.println(s.getClass().equals(Object.class)); //false: S NO es una instancia de la clase Object
    }
}