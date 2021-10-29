package aver;

import java.util.*;

public class TPManagement {
    private NavigableSet<TP> trabajos;

    public TPManagement() {
        trabajos = new TreeSet<TP>(new Comparator<TP>() {
            @Override
            public int compare(TP primerTP, TP segundoTP) {
                return Integer.compare(primerTP.getPromedioAlumno(), segundoTP.getPromedioAlumno());
            }
        });
    }

    public void deliver(TP trabajo) {
        // sistema que ordena los tps en cuanto a promedios y turno de llegada
        trabajos.add(trabajo);
    }

    public TP correct() throws EmptyTPsException {
        if (isEmpty()) {
            throw new EmptyTPsException();
        } else {
            return trabajos.pollFirst();
        }
    }

    public boolean isEmpty() {
        return trabajos.isEmpty();
    }

    public String studentsTps(){
        StringBuilder elestring = new StringBuilder();
        trabajos.forEach(trabajo -> elestring.append(trabajo + "\n"));
        return elestring.toString();
    }
}
