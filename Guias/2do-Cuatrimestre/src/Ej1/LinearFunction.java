public class LinearFunction implements Function {
    private double a, b;

    public LinearFunction(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double evaluate(double x) {
        return a * x + b;
    }
}
