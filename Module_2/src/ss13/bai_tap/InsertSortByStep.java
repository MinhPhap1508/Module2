package ss13.bai_tap;

import java.util.Arrays;

public class InsertSortByStep {
    /**
     * author: Trần Minh Pháp
     *
     * @param args
     */

    public static void main(String[] args) {
        /**
         * khai báo biến element để so sánh với các phần tử trong mảng
         * khai báo biến pos để xác định vị trí của element
         */
        int[] list = {15, 8, 38, 2, 5, 16};
        int element;
        int pos;
        System.out.println("Mảng trước khi sắp xếp là " + Arrays.toString(list));

        for (int i = 1; i < list.length; i++) {   //Ta bắt đầu duyệt từ vị trí thứ 1 cho đến cuối mảng.
            element = list[i];
            pos = i;
            System.out.println("so sánh " + element + " với " + list[pos - 1]);
            if (element > list[pos - 1]) {
                System.out.println(element + " lớn hơn " + list[pos - 1] + " Nên giữ nguyên");
            } else {
                System.out.println(element + " Nhỏ hơn " + list[pos - 1] + " nên lấy phần tử " + element + " ra ");
            }
            while (pos > 0 && element < list[pos - 1]) {
                // điều kiện để duyệt là pos phải lớn hơn không vì sau mỗi lần lặp pos sẽ trừ đi 1,
                //tránh trường hợp ví trí pos là giá trị âm.
                System.out.println("phần tử " + list[pos - 1] + " di chuyển qua phải một ô");
                list[pos] = list[pos - 1];
                pos--;
            }
            System.out.println("Ta gán phần tử " + element + " vào vị trí cũ của " + list[pos]);
            list[pos] = element;

            System.out.println("Mảng sau khi được sắp xếp là: " + Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));
    }
}
