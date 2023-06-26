package thuat_toan;

public class bai_3 {
    //Kiểm tra mảng có “đẹp” hay không
    //
    //Một mảng được gọi là "đẹp" nếu mảng đó chứa một phần tử mà phần tử đó chia mảng làm 2 phần
    // (không rỗng và không chứa phần tử đó) có tổng bằng nhau.
    public static void main(String[] args) {
        int[]arr={3,2,4,5,9};
        System.out.println(checkArr(arr));
    }

    public static boolean checkArr(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            int sumFirst=0;
            int sumSecond=0;
            for (int j = 0; j < i; j++) {
                sumFirst+=arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                sumSecond+=arr[j];
            }
            if (sumFirst==sumSecond){
                return true;
            }
        } return false;
    }

}
