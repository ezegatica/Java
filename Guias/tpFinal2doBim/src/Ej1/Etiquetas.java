package Ej1;
public abstract class Etiquetas implements HTMLText{
    public String source(String tipo, String texto){
        StringBuilder str = new StringBuilder();
        str.append("<");
        str.append(tipo);
        str.append(">");
        str.append(texto.toString());
        str.append("</");
        str.append(tipo);
        str.append(">");
        return str.toString();
    }
    public String source(String tipo, String texto, String destino){
        StringBuilder str = new StringBuilder();
        str.append("<a href=");
        str.append(destino);
        str.append(">");
        str.append(texto.toString());
        str.append("</");
        str.append(tipo);
        str.append(">");
        return str.toString();
    }
}
