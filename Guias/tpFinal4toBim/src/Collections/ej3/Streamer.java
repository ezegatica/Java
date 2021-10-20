package Collections.ej3;

import java.util.ArrayList;
import java.util.List;

public class Streamer {
    List<Serie> series;
    String name;

    Streamer(String name) {
        series = new ArrayList<>();
        this.name = name;
    }

    public void addSerie(Serie serie) {
        series.add(serie);
    }

    public int search(String name) {
        for (Serie serie : series) {

            if (serie.getTitle().equals(name))
                return serie.getSesons();
        }
        return 0;
    }

    public void showAll() {
        for (Serie serie : series) {
            System.out.println(serie);
        }
    }

    public boolean contains(Serie serie) {
        return series.contains(serie);
    }
}