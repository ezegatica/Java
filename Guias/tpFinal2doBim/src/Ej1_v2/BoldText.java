package Ej1_v2;

public class BoldText implements HTMLText {
    String text;
    PlainText origin;
    HTMLText possibleOrigin;

    public BoldText(PlainText text) {
        
        text.addNew(this);
        this.text = text.toString();
    }
    public BoldText(HTMLText textObj) {
        this.possibleOrigin = textObj;

    }
    @Override 
    public String source(){
        if(possibleOrigin != null){
          return String.format("<b>%s</b>",possibleOrigin.toString());
        }
        return String.format("<b>%s</b>", text);
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