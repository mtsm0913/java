package JavaLearning;

/*
 * 年利 20% で 10,000 ドル借金をしています。
 * 年数 year が与えられるので、返済額を計算する howMuchIsYourDebt という関数を作成してください。
 * 小数点以下は切り捨てとします。pow関数を使用して累乗を計算してください。
 */

public class HowMuchIsYourDebt {
    public static int howMuchIsYourDebt(int year) {
        double totalDept = Math.floor(10000 * Math.pow(1.2, year));
        return (int)totalDept;
    }
    public static void main(String[] args) {
        // System.out.println(howMuchIsYourDebt(1));
        System.out.println(howMuchIsYourDebt(2));
        System.out.println(howMuchIsYourDebt(5));
        System.out.println(howMuchIsYourDebt(10));
    }
}
