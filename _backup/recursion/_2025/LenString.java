/*
 * Gerry は入力された文字の文字数をカウントするアプリを作成しています。このアプリに拡張性をつけるために、
 * 再帰で文字をカウントする予定です。入力された文字列 string が与えられるので、再帰を使って文字数を返す、
 * lenString という関数を作成してください。ただし、Python の len や、JavaScript の length は
 * 使わずに解いてください。
 */

package JavaLearning;

public class LenString {

    public static int lenString(String string){
        return lenStringHelper(string, 0, "");
    }

    public static int lenStringHelper(String string, int count, String res) {
        if (string == null || string.equals(res)) {
            return count;
        }
        return lenStringHelper(string, count + 1, res + string.charAt(count));
    }

    public static void main(String[] args) {
        System.out.println(lenString("hello world"));
        System.out.println(lenString("hello"));
        System.out.println(lenString("a"));
        System.out.println(lenString("Recursion"));
    }
}
