package BEjercicio6;

// Se quiere crear una clase llamada Serie con las siguientes
// características:
// Sus atributos son título y número de temporadas.
// Por defecto, el número de temporadas es de 6 temporada, el título es
// “brooklyn 99”
// Se quiere además tener una clase llamada Streamer donde se almacenan
// todas las series disponibles de una plataforma.
// Se debe tener un método que devuelva un bool que busque una serie por
// argumento.
// Programa de prueba:

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie();
        Serie serie2 = new Serie(12, "Dr house");
        Serie serie3 = new Serie(5, "outlander");
        Serie serie4 = new Serie(10, "friends");
        Serie[] series = { serie1, serie2, serie3, serie4 };
        Streamer netflix = new Streamer(series, "netflix");
        System.out.println(netflix);
        // Streamer{series=[Serie{sesons=6, title='BROCKLING 99'}, Serie{sesons=12,
        // title='Dr
        // house'}, Serie{sesons=5, title='outlander'}, Serie{sesons=10,
        // title='friends'}],
        // name='netflix'}
    }
}
