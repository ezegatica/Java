package Ej1;
import java.util.Arrays;

public class PlainText {
    private String text;
    private HTMLText[] objetos;
    private int dim = 0;

    public PlainText(String text) {
        this.text = text;
        this.objetos = new HTMLText[10];
    }

    public void agregar(HTMLText text){
        if(dim == objetos.length){
            objetos = Arrays.copyOf(objetos, objetos.length + 10);
          }
        objetos[dim++] = text;
    }

    public void setText(String text) {
        this.text = text;
        for (HTMLText obj : objetos){
            // System.out.println(obj); por que hay muchos nulls?
            if(obj != null){
                obj.cambiarTexto(text);
            }
        }
    }
    

    @Override
    public String toString() {
        return this.text;
    }
}