package TP;

import java.util.*;

public class TPManagement { // Clase de TPManagement, que es el Buzon de entrega de trabajos de una materia
    private Queue<TP> trabajos; // Array de trabajos por corregir de la materia

    public TPManagement() { // Constructor
        trabajos = new PriorityQueue<TP>(new Comparator<TP>() {
            // Creamos un PriorityQueue de trabajos por corregir, que tiene un comparador de
            // TPs para ordenarlo de forma natural por orden de llegar
            @Override
            public int compare(TP tp1, TP tp2) {
                return Integer.compare(tp2.getPromedioAlumno(), tp1.getPromedioAlumno()); // Comparamos 2 tps, y los
                                                                                          // ordenamos por promedio.
            }
            // NOTA:
            /*
             * Al ser un priorityqueue, ya naturalmente ordena por orden de llegada, por lo
             * que no es necesario meterlo al comparador. Si 2 alumnos tienen el mismo
             * promedio, la queue automaticametne lo ordena por orden de llegada, dando
             * prioridad a los que llegaron primero
             */
        });
    }

    public void deliver(TP tp) {
        trabajos.add(tp); // Agregar al array un tp
    }

    public TP correct() throws EmptyTPsException { // Metodo de corregir el tp
        if (isEmpty()) {
            throw new EmptyTPsException(); // Si esta vacio el array, tira error
        } else {
            return trabajos.remove(); // El metodo remove, remove el primer elemento del array. (Posicion 0)
        }
    }

    public boolean isEmpty() {
        return trabajos.isEmpty();
    }

    public String studentsTps() {
        //Creamos un map con la key de String y una Lista de tps como valores
        SortedMap<String, List<TP>> tpMap = new TreeMap<>(); 

        for (TP trabajo : trabajos) {
            String name = trabajo.getAlumno().getNombre();
            tpMap.computeIfAbsent(name, k -> new ArrayList<>()).add(trabajo);
        }
        return tpMap.toString();
    }

}