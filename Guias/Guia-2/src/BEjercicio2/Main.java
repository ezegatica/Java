package BEjercicio2;

public class Main {
    public static void main(String[] args){
        // ClassA a = new ClassB();
        // a.method(3);
            // ClassA: 3 class java.lang.Integer

        // ClassB b = new ClassA();
        // b.method(3);
            // No se puede hacer una clase A con clase B
            // "cannot convert from ClassA to ClassB"

        // ClassB c = new ClassB();
        // c.method(3);
            //ClassB: 3 class java.lang.Integer

        // ClassB d = new ClassB();
        // d.method((Number)3);
            //ClassA: 3 class java.lang.Integer

        // ClassA eA = new ClassA();
        // ClassB eB = (ClassB)eA;
        // eB.method(3);
            //Exception in thread "main" java.lang.ClassCastException: class BEjercicio2.ClassA 
            //cannot be cast to class BEjercicio2.ClassB (BEjercicio2.ClassA and BEjercicio2.ClassB are 
            //in unnamed module of loader 'app') at BEjercicio2.Main.main(Main.java:23)

        // ClassB fB = new ClassB();
        // ClassA fA = (ClassA)fB;
        // fA.method(3);
            //ClassA: 3 class java.lang.Integer
    }
}
