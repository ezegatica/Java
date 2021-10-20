package Collections.ej3;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie(12, "Dr house");
        Serie serie2 = new Serie(5, "outlander");
        Serie serie3 = new Serie(10, "friends");
        Streamer netflix = new Streamer("netflix");
        netflix.addSerie(serie1);
        netflix.addSerie(serie2);
        netflix.addSerie(serie3);
        netflix.showAll();
        System.out.println(netflix.search("friends"));
        System.out.println(netflix.search("aaaa"));
        System.out.println(netflix.contains(serie2));
    }
}
