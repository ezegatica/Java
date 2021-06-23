package Ej1;

public class ItalicText implements HTMLText{
    private String text;
    private boolean esHTML = false;
    private HTMLText textHTML;
    public ItalicText(PlainText text) {
        this.text = text.toString();
        text.agregar(this);
    }
    public ItalicText(HTMLText text) {
        this.textHTML = text;
        this.esHTML = true;
    }
    @Override
    public void cambiarTexto(String txt){
        this.text = txt;
    } 
    @Override
    public String toString(){
        return this.source();
    }
    @Override
    public String source() {
        if (esHTML){
            return String.format("<i>%s</i>", this.textHTML.toString());
        }
        return String.format("<i>%s</i>", this.text);
    }
}
