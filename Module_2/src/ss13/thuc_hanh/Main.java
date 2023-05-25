package ss13.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        solution(s);
    }

    public static String solution(String s) {
        String[] str = s.split("");
        String array = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(str[i].toUpperCase())) {
                array+= " "+str[i];

            }else {
                array+=str[i];
            }
        }
        System.out.println(array.toLowerCase().trim());
        return s;
    }
}
