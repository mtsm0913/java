/*
 * 1 以上の整数 n が与えられるので、1 + 2 + 3 + ... + n を計算する simpleSummation という関数を
 * 再帰を使って作成してください。
 */

 package JavaLearning;

public class SimpleSummation {

    public static int simpleSummation(int n){
        if (n == 0) return 0;
        return simpleSummation(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(simpleSummation(3));
        System.out.println(simpleSummation(10));
        System.out.println(simpleSummation(100));
        System.out.println(simpleSummation(54));
    }
}
