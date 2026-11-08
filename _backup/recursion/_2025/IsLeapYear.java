package JavaLearning;

/*
 * 閏年の条件は以下
 * 4 で割り切れる
 * 100 で割り切れる場合は、閏年にしない
 * 例外として 400 で割り切れる場合は、閏年とする
 */

public class IsLeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        else return false;
        // 別解
        // if (year % 400 == 0) return true;
        // else if (year % 100 == 0) return false;
        // else if (year % 4 == 0) return true;
        // else return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
    }
}
