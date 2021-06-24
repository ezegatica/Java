package Ej1;

public class ItalicText implements HTMLText{
    private PlainText text;
    private boolean esHTML = false;
    private HTMLText textHTML;
    
    public ItalicText(PlainText text) {
        this.text = text;
    }

    public ItalicText(HTMLText text) {
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
            return String.format("<i>%s</i>", this.textHTML.toString());
        }
        return String.format("<i>%s</i>", this.text.toString());
    }
}
