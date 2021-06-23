package Ej1_v2;

import java.util.Arrays;

public class PlainText {
    String text;
    HTMLText[] objects;
    int dim = 0;
    static final int add = 5;
    
    public PlainText(String text){
        this.text = text;
        this.objects = new HTMLText[add];
    }

    public void setText(String replace){
        text = replace;
        for (HTMLText object : objects) {
          if(object != null){
            object.changeText(replace);
          }
        }
    }

    public void addNew(HTMLText text){
        if(dim == objects.length){
          objects = Arrays.copyOf(objects, objects.length + add);
        }
        objects[dim++] = text;
    }
    @Override
    public String toString(){
      return this.text;
    }
}