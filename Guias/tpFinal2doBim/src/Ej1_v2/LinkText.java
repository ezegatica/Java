package Ej1_v2;

public class LinkText implements HTMLText {
    String text;
    String domain;
    HTMLText possibleOrigin;
    PlainText origin;

    public LinkText(PlainText text, String domain) {
        text.addNew(this);
        this.text = text.toString();
        this.domain = domain;
    }
    public LinkText(HTMLText textObj, String domain) {
        this.possibleOrigin = textObj;
        this.domain = domain;
    }
    @Override
    public String source(){
        if(possibleOrigin != null){
          return String.format("<a href=%s>%s</a>",domain, possibleOrigin.toString());
        }
        return String.format("<a href=%s>%s</a>", domain, text);
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