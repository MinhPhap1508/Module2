package thuat_toan;

public class bai_4 {
//    Chương trình sửa lại xâu kí tự:
//    Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
//    Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.

    public static void main(String[] args) {
        String arr = "CodeGymDaNang";
        String[] str = arr.split("");
        String array="";
        String list="";
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(str[i].toUpperCase())){
                array+=" "+str[i];
            }else {
                array+=str[i];
            }
        }
        System.out.println(array);
        list=array.toLowerCase().trim();
        System.out.println(list);
    }

}
