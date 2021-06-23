package Ej1;

public class BoldText implements HTMLText{
    private String text;
    private boolean esHTML = false;
    private HTMLText textHTML;
    public BoldText(PlainText text) {
        this.text = text.toString();
        text.agregar(this);
    }
    public BoldText(HTMLText text) {
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
            return String.format("<b>%s</b>", this.textHTML.toString());
        }
        return String.format("<b>%s</b>", this.text);
    }
}
