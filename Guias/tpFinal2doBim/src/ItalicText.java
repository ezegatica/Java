public class ItalicText extends Etiquetas{
    private String text;
    public ItalicText(PlainText text) {
        this.text = text.toString();
    }
    public ItalicText(HTMLText text) {
        this.text = text.toString();
    }
    @Override
    public String toString(){
        return super.source("i", text);
    }
}
