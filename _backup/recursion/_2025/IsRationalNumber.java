package JavaLearning;

/*
 * 遊園地 D は入場者に対して整理券を配り、その番号の平方根が有理数の来場者を選び、
 * 特別バッジを与えることにしました。ある自然数 number が与えられるので、
 * その平方根が有理数かどうかを判断する、isRationalNumber という関数を作成してください。
 */

public class IsRationalNumber {
    public static boolean isRationalNumber(int number) {
        double sqrt = Math.sqrt(number);
        return sqrt % 1 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isRationalNumber(1));
        System.out.println(isRationalNumber(2));
        System.out.println(isRationalNumber(3));
        System.out.println(isRationalNumber(4));
        System.out.println(isRationalNumber(5));
        System.out.println(isRationalNumber(6));
        System.out.println(isRationalNumber(7));
        System.out.println(isRationalNumber(8));
        System.out.println(isRationalNumber(9));
        System.out.println(isRationalNumber(10));
        System.out.println(isRationalNumber(11));
        System.out.println(isRationalNumber(16));
        System.out.println(isRationalNumber(49));
        System.out.println(isRationalNumber(225));
    }
}
