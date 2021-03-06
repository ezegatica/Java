package BEjercicio3;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("no se aceptan números menores a 1");
        this.x = x;
        this.y = y;
    }
    public String returnXandY () {
        return x + "," + y; 
    }
    public void factorial() {
        this.x = factor(x);
        this.y = factor(y);
    }
    public int factor(int n){
        int s = 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println(n + ": " + i);
            s = s * i;
        }
        return s;
    }
    public int getY(){
        return this.y;
    }
    public int getX(){
        return this.x;
    }
    public double getDistancia(Point b){
        Point a = this;
        double d = 0;
        double distancia_x = (b.getX() - a.getX());
        double distancia_y = (b.getY() - a.getY());
        d = Math.sqrt(Math.pow(distancia_x, 2) + Math.pow(distancia_y, 2));
        return d;
    }
}
