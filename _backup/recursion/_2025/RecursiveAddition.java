/*
 * 0 以上の整数 m と n が与えられるので、m + n を返す、recursiveAddition という関数を再帰を用いて作成してください。
 */

package JavaLearning;

public class RecursiveAddition {

    public static int recursiveAddition(int m, int n){
        if (m <= 0) return n;
        if (n <= 0) return m;
        return recursiveAddition(m, n - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(recursiveAddition(5, 3));
        System.out.println(recursiveAddition(10, 7));
        System.out.println(recursiveAddition(21, 30));
    }
}
