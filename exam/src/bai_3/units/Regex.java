package bai_3.units;

public class Regex {
    public static boolean check(String num){
        return num.matches("^/d{6}$");
    }
}
