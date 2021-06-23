package Ej1;

public class ItalicText implements HTMLText{
    private String text;

    public ItalicText(PlainText text) {
        this.text = text.toString();
        text.agregar(this);
    }
    public ItalicText(HTMLText text) {
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
        return String.format("<i>%s</i>", text.toString());
    }
}
