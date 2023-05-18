package ss9.bai_tap;

public class MyList <E>{
    private int size=0;
    private static int DEFAULT_CAPACITY=10;
    private Object elements [];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }

}
