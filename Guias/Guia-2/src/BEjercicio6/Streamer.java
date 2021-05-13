package BEjercicio6;

public class Streamer {
    private Serie[] series;
    private String nombre;
    public Streamer(Serie[] s, String n){
        this.series = s;
        this.nombre = n;
    }
    // @Override
    // public String toString(){
    //     return "Streamer{"+
    //         "series=" + series.toString(series) +
    //         ", name='" + nombre + "'"+ 
    //         "}";
    // }
    public boolean buscarPorTitulo(String titulo){
        for(Serie serie : series){
            if(serie.getTitle() == titulo){
                return true;
            }
        }
        return false;
    }
} 
