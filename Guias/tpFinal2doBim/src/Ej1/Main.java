package Ej1;

public class Main { 
	public static void main(String[] args) { 
		PlainText text = new PlainText("Hola");
		HTMLText boldText = new BoldText(text);
		HTMLText italicText = new ItalicText(text);
		System.out.println(boldText);
		System.out.println(italicText);
		HTMLText boldItalicText = new BoldText(italicText);
		System.out.println(boldItalicText);
		text.setText("ORT");
		System.out.println(boldText);
		System.out.println(italicText);
		System.out.println(boldItalicText);
		HTMLText linkText = new LinkText(text, "ort.edu.ar");
		HTMLText linkBoldText1 = new LinkText(boldItalicText, "ort.edu.ar");
		HTMLText linkBoldText2 = new BoldText(linkText);
		System.out.println(linkText);
		System.out.println(linkBoldText1);
		System.out.println(linkBoldText2);
		text.setText("Ejemplo");
		System.out.println(linkBoldText1);
		System.out.println(linkBoldText2);
	} 
}
/*
<b>Hola</b> 
<i>Hola</i> 
<b><i>Hola</i></b> 
<b>ORT</b> 
<i>ORT</i> 
<b><i>ORT</i></b> 
<a  href:ort.edu.ar>ORT</a> 
<a  href:ort.edu.ar><b><i>ORT</i></b></a> 
<b><a  href:ort.edu.ar>ORT</a></b> 
<a  href:ort.edu.ar><b><i>Ejemplo</i></b></a> 
<b><a  href:ort.edu.ar>Ejemplo</a></b>
*/