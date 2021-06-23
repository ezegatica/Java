package Ej1_v2;

public class ItalicText implements HTMLText{
    String text;
    HTMLText possibleOrigin;
    PlainText origin;

    public ItalicText(PlainText text) {
        text.addNew(this);
        this.text = text.toString();
    }
    public ItalicText(HTMLText textObj) {
        this.possibleOrigin = textObj;
    }

    @Override 
    public String source(){
        if(possibleOrigin != null){
          return String.format("<i>%s</i>",possibleOrigin.toString());
        }
        return String.format("<i>%s</i>", text);
    }
    @Override
    public String toString(){
      return this.source();
    }
    @Override
    public void changeText(String replace){
      this.text = replace;
    }
}