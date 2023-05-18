package ss9.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[index]=element;
        size++;
    }
public E remove(int index){
    if(index > 0 && index <elements.length){
        for (int i = 0; i < size; i++) {
            elements[i]=elements[i-1];
        }
        elements[index] =null;
        size--;
    }
    return (E)elements;
}

    private int size(){
        return size;
    }
    public E clone(){
       Object[] newArr= Arrays.copyOf(elements,elements.length);
       return (E)newArr;
    }
    public boolean contains(E o){
        for (int i = 0; i < elements.length; i++) {
            if(o==elements[i]){
                return true;
            }
        }return false;
    }
    public int indexOf(E o){
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public boolean add(E e){
      ensureCapacity(size+1);
      elements[size++]=e;
      return true;
    }
    public void ensureCapacity(int minCapacity){
        int newSize= elements.length+minCapacity;
        elements= Arrays.copyOf(elements,newSize);
    }

    public void clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i]=null;
        }
        size=0;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

}
