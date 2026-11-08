/*
 * 自然数 n が与えられるので、1 × 2 × 3 × ... × n を計算する factorial という関数を再帰を使って作成してください。
 */

 package JavaLearning;

public class Factorial {

    public static long factorial(int n){
        if (n <= 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(15));
    }
}
