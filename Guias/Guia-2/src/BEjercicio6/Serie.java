package BEjercicio6;

public class Serie {
    private int temporadas;
    private String titulo;
    public Serie(){
        this.temporadas = 6;
        this.titulo = "brooklyn 99";
    }
    public Serie(int t, String n){
        this.temporadas = t;
        this.titulo = n;
    }
    public String getTitle(){
        return titulo;
    }
    public int getTemporadas(){
        return temporadas;
    }
    // @Override
    // public String toString(){
    //     return "Serie{"+
    //         "temporadas=" + this.temporadas +
    //         ", titulo='" + this.titulo + "'"+ 
    //         "}";
    // }
}
