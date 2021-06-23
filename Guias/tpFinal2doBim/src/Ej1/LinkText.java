package Ej1;
public class LinkText extends Etiquetas {
    private String text;
    private String destino;

    public LinkText(PlainText text, String destino) {
        this.text = text.toString();
        this.destino = destino;
    }

    public LinkText(HTMLText text, String destino) {
        this.text = text.toString();
        this.destino = destino;
    }
    @Override
    public String toString() {
        return super.source("a", text, destino);
    }

    @Override
    public String source() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
