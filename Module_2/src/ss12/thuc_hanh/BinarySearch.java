package ss12.thuc_hanh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 7, 8, 16, 17, 56};
        System.out.println(binarySearch(list,1));
    }

    static int binarySearch(int[] list, int key) {
        int first = 0;
        int last = list.length - 1;
        while (first < last) {
            int mid = (first + last) / 2;
            if (key < list[mid]) {
                last = mid -1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }
}
