package thuat_toan;

import java.util.ArrayList;
import java.util.List;


//Tìm số lần xuất hiện mảng con trong mảng cha
//Điều kiện child là con của parent
// (các phần tử trong mảng child xuất hiện ít nhất 1 lần trong mảng parent)
public class Bai8 {
    public static void main(String[] args) {
        int[] parent = {1, 4, 5, 3, 2, 1};
        int[] child = {1, 2, 3};
        checkF(parent, child);
    }

    public static void checkF(int[] parent, int[] child) {
        List<Integer> integerList = new ArrayList<>();
        int count;
        for (int i = 0; i < child.length; i++) {
            count=0;
            for (int j = 0; j < parent.length; j++) {
                if(child[i]==parent[j]){
                    count++;
                }
            }
            integerList.add(count);
        }
        integerList.sort((o1, o2) -> o1-o2);
        System.out.println(integerList.get(0));
    }
}

