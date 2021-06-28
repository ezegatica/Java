package Ej1;

public abstract class HTMLWrapper implements HTMLText{
    private HTMLText text;
    private String destino;
    private String etiqueta;

    public HTMLWrapper(String etiqueta, HTMLText text) {
        this.etiqueta = etiqueta;
        this.text = text;
    }
    public HTMLWrapper(String etiqueta, HTMLText text, String destino) {
        this.etiqueta = etiqueta;
        this.text = text;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return this.source();
    }

    @Override
    public String source() {
        if (etiqueta == "a"){
            return String.format("<a href=%s>%s</a>", destino, text.toString());
        }
        return String.format("<%s>%s</%s>", etiqueta, this.text.toString(), etiqueta);
    }
}
