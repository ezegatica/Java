package Ej1;
public class BoldText extends Etiquetas{
    private String text;
    public BoldText(PlainText text) {
        this.text = text.toString();
    }
    public BoldText(HTMLText text) {
        this.text = text.toString();
    }
    @Override
    public String toString(){
        return super.source("b", text.toString());
    }
    @Override
    public String source() {
        // TODO Auto-generated method stub
        return null;
    }
}
