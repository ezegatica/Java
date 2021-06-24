package Ej1;

public class BoldText implements HTMLText{
    private PlainText text;
    private boolean esHTML = false;
    private HTMLText textHTML;
    
    public BoldText(PlainText text) {
        this.text = text;
    }

    public BoldText(HTMLText text) {
        this.textHTML = text;
        this.esHTML = true;
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
        return String.format("<b>%s</b>", this.text.toString());
    }
}
