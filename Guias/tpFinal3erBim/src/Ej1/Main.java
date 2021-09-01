package Ej1;
// Consigna

// https://campus.belgrano.ort.edu.ar/tic/tp/1657912/tp-tercer-bimestre
// Pistas: T[] elements =  (T[]) new Comparable[INITIAL_DIM];
// Creación  de  un  array  de  elementos  genéricos  comparables 
// Pueden  usar  en  algún  momento Arrays.sort(elements,fromIndex,toIndex);

public class Main {
    public static void main(String[] args) throws EmptyQueueException {
        Queue<MedicalShifts> queueHospital = new QueueImplement<>();
        queueHospital.add(new MedicalShifts("harry", 0));
        queueHospital.add(new MedicalShifts("hermione", 3));
        queueHospital.add(new MedicalShifts("ron", 1));
        queueHospital.add(new MedicalShifts("luna", 5));
        queueHospital.add(new MedicalShifts("voldemort", 8));
        System.out.println(queueHospital.peek());
        System.out.println(queueHospital.isEmpty());
        try {
            System.out.println(queueHospital.pop());
        } catch (EmptyQueueException emptyQueue) {
            System.out.println(emptyQueue.getMessage());
        }
        System.out.println(queueHospital.peek());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        queueHospital.add(new MedicalShifts("hagrid", 4));
        for (MedicalShifts shifts : queueHospital) {
            System.out.println(shifts);
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        queueHospital.sort();
        for (MedicalShifts shifts : queueHospital) {
            System.out.println(shifts);
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(queueHospital.min(new Comparator<MedicalShifts>() {
            @Override
            public int compare(MedicalShifts o1, MedicalShifts o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        })); // ACA ADENTOR VA ALGO!°!!""#!!!#!#"!|" posiblemente comaprador de n ombre
    }
}

// harry
// false
// harry
// hermione
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// hermione
// ron
// luna
// voldemort
// hagrid
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// ron
// hermione
// hagrid
// luna
// voldemort
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// hagrid