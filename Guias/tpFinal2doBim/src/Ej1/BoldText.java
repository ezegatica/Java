package Ej1;

public class BoldText implements HTMLText{
    private String text;

    public BoldText(PlainText text) {
        this.text = text.toString();
        text.agregar(this);
    }
    public BoldText(HTMLText text) {
        this.text = text.toString();
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
        return String.format("<b>%s</b>", text.toString());
    }
}
