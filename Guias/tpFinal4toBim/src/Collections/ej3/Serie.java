package Collections.ej3;

import java.util.Objects;

public class Serie {
    private int sesons;
    private String title;

    Serie(int sesons, String title) {
        this.sesons = sesons;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getSesons() {
        return sesons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sesons, title);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Serie))
            return false;
        Serie serie = (Serie) o;
        return sesons == serie.sesons && title.equals(serie.title);
    }
}