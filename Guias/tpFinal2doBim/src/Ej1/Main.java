package Ej1;
public class Main {
    public static void main(String[] args) {
        PlainText text = new PlainText("Hola");
        System.out.println("CAMBIANDO A: " + text);
        HTMLText boldText = new BoldText(text);
        HTMLText italicText = new ItalicText(text);
        System.out.println(boldText); //<b>Hola</b> 
        System.out.println(italicText); //<i>Hola</i> 
        
        HTMLText boldItalicText = new BoldText(italicText);
        System.out.println(boldItalicText);//<b><i>Hola</i></b> 
        
        text.setText("ORT");
        System.out.println("CAMBIANDO A: " + text);
        System.out.println(boldText);//<b>ORT</b> 
        System.out.println(italicText);//<i>ORT</i> 
        System.out.println(boldItalicText);//<b><i>ORT</i></b> 
        HTMLText linkText = new LinkText(text, "ort.edu.ar");
        HTMLText linkBoldText1 = new LinkText(boldItalicText, "ort.edu.ar");
        HTMLText linkBoldText2 = new BoldText(linkText);
        System.out.println(linkText);//<a  href:ORT.edu.ar>ORT</a> 
        System.out.println(linkBoldText1);//<a  href:ORT.edu.ar><b><i>ORT</i></b></a> 
        System.out.println(linkBoldText2);//<b><a  href:ORT.edu.ar>ORT</a></b> 
        text.setText("Ejemplo");
        System.out.println("CAMBIANDO A: " + text);
        System.out.println(linkBoldText1);//<a  href:ORT.edu.ar><b><i>Ejemplo</i></b></a> 
        System.out.println(linkBoldText2); //<b><a  href:ORT.edu.ar>Ejemplo</a></b>
    }
}
