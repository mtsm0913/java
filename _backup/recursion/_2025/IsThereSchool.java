package JavaLearning;

/*
前提
祝日または土日の場合、基本的に学校はありません。
day が "Saturday" または "Sunday" の場合は休み（true）
 */

public class IsThereSchool {
    public static boolean isThereSchool(String day, boolean isHoliday) {
        return day != "Saturday" && day != "Sunday" && isHoliday == false;
        // 別解
        // if (day == "Sunday" || day == "Saturday" || isHoliday) return false;
        // else return true;  
    }
    public static void main(String[] args) {
        System.out.println(isThereSchool("Sunday",true));
        System.out.println(isThereSchool("Saturday",true));
        System.out.println(isThereSchool("Saturday",false));
        System.out.println(isThereSchool("Sunday",false));
        System.out.println(isThereSchool("Monday",true));
        System.out.println(isThereSchool("Monday",false));
        System.out.println(isThereSchool("Custom String Input",false));
    }
}
