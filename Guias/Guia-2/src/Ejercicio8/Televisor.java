package Ejercicio8;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;
    public Televisor(int precio, char consumo, String modelo, String marca, int resolucion, boolean sintonizadorTDT, int peso) {
        super(precio, consumo, modelo, marca, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public Televisor(){
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    } 
    public String getTV(){
        String TV = "La resolucion es " + this.resolucion + " pulgadas, y " + tieneSintetizador(this.sintonizadorTDT) +"tiene sintonizadorTDT." ;
        return TV;
    }
    public String tieneSintetizador(boolean sint){
        if (sint == true){
            return "";
        }else{
            return "no ";
        }
    }
}
