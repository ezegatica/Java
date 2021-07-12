
/* Realizar una implementación que permita representar la composición de dos funciones. 
La clase a implementar debe llamarse CompositeFunction y debe recibir en el constructor 
dos funciones a componer. Además deben implementar la clase LinearFunction que represente una función lineal     
“y = ax + b” para que el programa de prueba funcione. */
public class Main {
    public static void main(String[] args) throws Exception {
       Function f1 = new LinearFunction(2, 0); 
       Function f2 = new QuadraticFunction(1, 0, 0); 
       Function f3 = new CompositeFunction(f1, f2); 
       System.out.println(f3.evaluate(1)); // 4.0
       System.out.println(f3.evaluate(2)); // 16.0
       Function f4 = new SineFunction(); 
       Function f5 = new CompositeFunction(f1, f4); 
       Function f6 = new CompositeFunction(f5, f1); 
       System.out.println(f6.evaluate(0)); // 0.0
       System.out.println(f6.evaluate(Math.PI / 4.0)); // 2.0
    }
}
