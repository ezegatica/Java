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
}
