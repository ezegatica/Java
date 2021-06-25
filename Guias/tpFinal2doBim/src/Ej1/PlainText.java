package Ej1;

public class PlainText implements HTMLText{
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String source(){
        return this.text;
    }
    @Override
    public String toString() {
        return this.source();
    }
}