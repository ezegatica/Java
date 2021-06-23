public class LinkText implements HTMLText {
    private String text;
    private String destino;

    public LinkText(PlainText text, String destino) {
        this.text = text.toString();
        this.destino = destino;
    }

    public LinkText(HTMLText text, String destino) {
        this.text = text.toString();
        this.destino = destino;
    }
    @Override
    public String source() {
        StringBuilder str = new StringBuilder();
        str.append("<a href=");
        str.append(destino);
        str.append(">");
        str.append(text.toString());
        str.append("</a>");
        return str.toString();

    }
    @Override
    public String toString() {
        return this.source();
    }

    
}
