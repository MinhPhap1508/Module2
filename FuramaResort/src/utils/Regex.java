package utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Regex {

    public static boolean checkId(String id) {
        return id.matches("^NV-\\d{4}$");
    }

    public static boolean checkCustomer(String id) {
        return id.matches("^KH-\\d{4}$");
    }

    public static boolean checkName(String name) {
        return name.matches("\\b[A-Z][a-z]*( [A-Z][a-z]*)*\\b");
    }

    public static boolean checkGender(String gender) {
        return gender.matches("^Nam|(Nữ)$");
    }

    public static boolean checkIdCard(String idCard) {
        return idCard.matches("^\\d{12}|\\d{9}$");
    }

    public static boolean checkNumberPhone(String number) {
        return number.matches("^0\\d{9}$");
    }

    public static boolean checkEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static boolean checkLevel(String level) {
        return level.matches("^(Trung cấp)|(Cao đẳng)|(Đại học)|(Sau đại học)$");
    }

    public static boolean checkPosition(String position) {
        return position.matches("^(lễ tân)|(phục vụ)|(chuyên viên)|(giám sát)|(quản lý)|(giám đốc)$");
    }

    public static boolean checkDate(String date) {
        return date.matches("^\\d{2}(/)\\d{2}(/)\\d{4}$");
    }

    public static boolean checkSegments(String segments) {
        return segments.matches("^(Diamond)|(Platinum)|(Gold)|(Silver)|(Member)$");
    }
}
