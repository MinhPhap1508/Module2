package ss9.bai_tap;


public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList<Integer>();
        myList.add(0, 7);
        myList.add(1, 9);
        myList.add(2, 12);
        myList.add(3, 91);
        myList.add(4, 13);
        myList.add(5, 78);
        myList.add(6, 77);
        myList.add(7, 76);
        myList.add(8, 75);
        myList.add(9, 74);
        myList.add(10, 73);
        myList.add(11, 72);
        myList.add(12, 71);


        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(4));
        System.out.println(myList.contains(9));
        System.out.println(myList.add(6));
        System.out.println(myList.indexOf(9));
        System.out.println(myList.remove(2));
    }
}
