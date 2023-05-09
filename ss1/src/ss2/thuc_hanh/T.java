package ss2.thuc_hanh;

public class T {
    public static void main(String[] args) {
        int x = -1, a[] = {1,2,3,4};
        for(int i=0;i<a.length;i++){
            if(a[i] < x){
                x = a[i];
            }
        }
        System.out.println(x);
    }
}
