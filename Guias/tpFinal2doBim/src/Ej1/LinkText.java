package Ej1;
public class LinkText implements HTMLText {
    private String text;
    private String destino;

    public LinkText(PlainText text, String destino) {
        this.text = text.toString();
        this.destino = destino;
        text.agregar(this);
    }

    public LinkText(HTMLText text, String destino) {
        this.text = text.toString();
        this.destino = destino;
    }
    @Override
    public String toString() {
        return this.source();
    }

    @Override
    public String source() {
        return String.format("<a href=%s>%s</a>", destino, text);
    }

    @Override
    public void cambiarTexto(String txt){
      this.text = txt;
    }

    
}
