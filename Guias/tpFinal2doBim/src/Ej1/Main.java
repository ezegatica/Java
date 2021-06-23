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
        
        text.setText("ITBA");
        System.out.println("CAMBIANDO A: " + text);
        System.out.println(boldText);//<b>ITBA</b> 
        System.out.println(italicText);//<i>ITBA</i> 
        System.out.println(boldItalicText);//<b><i>ITBA</i></b> 
        
        HTMLText linkText = new LinkText(text, "itba.edu.ar");
        HTMLText linkBoldText1 = new LinkText(boldItalicText, "itba.edu.ar");
        HTMLText linkBoldText2 = new BoldText(linkText);
        System.out.println(linkText);//<a  href:itba.edu.ar>ITBA</a> 
        System.out.println(linkBoldText1);//<a  href:itba.edu.ar><b><i>ITBA</i></b></a> 
        System.out.println(linkBoldText2);//<b><a  href:itba.edu.ar>ITBA</a></b> 
        text.setText("Ejemplo");
        System.out.println("CAMBIANDO A: " + text);
        System.out.println(boldText);
        System.out.println(linkBoldText1);//<a  href:itba.edu.ar><b><i>Ejemplo</i></b></a> 
        System.out.println(linkBoldText2); //<b><a  href:itba.edu.ar>Ejemplo</a></b>
    }
}
