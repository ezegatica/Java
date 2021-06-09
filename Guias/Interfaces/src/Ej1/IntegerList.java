package Ej1;

public interface IntegerList {
    boolean isEmpty();

    void add(int element);

    int contains(int element);

    boolean remove(int index);

    default boolean removeElement(int element){
        int index = contains(element);
        if(index != -1){
            return remove(index);
        }
        return false;
    }
}
