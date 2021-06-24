package Ej1;

public class LinkText implements HTMLText {
    private PlainText text;
    private String destino;
    private boolean esHTML = false;
    private HTMLText textHTML;

    public LinkText(PlainText text, String destino) {
        this.text = text;
        this.destino = destino;
    }

    public LinkText(HTMLText text, String destino) {
        this.textHTML = text;
        this.esHTML = true;
        this.destino = destino;
    }
    
    @Override
    public String toString() {
        return this.source();
    }

    @Override
    public String source() {
        if (esHTML){
            return String.format("<a href=%s>%s</a>", destino, textHTML.toString());
        }
        return String.format("<a href=%s>%s</a>", destino,text.toString());
    }
}
