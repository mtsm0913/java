package JavaLearning;

/*
 * 文字列 string を受け取り、文字数の半分を文字列の真ん中から返す、middleSubstring という関数を
 * 定義してください。
 * 入力された文字列の長さが偶数の場合、文字列の真ん中から文字数の半分に相当する部分文字列を返します。
 * 例えば、入力が "ABCDEFGH" の場合、真ん中の部分文字列は "CDEF" です。
 * 入力された文字列の長さが奇数の場合、真ん中の文字を除いた、文字数の半分に相当する部分文字列を返します。
 * 例えば、入力が "ABCDEFG" の場合、真ん中の部分文字列は "CDE" です。
 * 入力文字列の文字数が 2 以下の場合、最初の文字を返します。
 * 例えば、入力が "A" や "AB" の場合、"A" を返します。
 * 
 * ★ヒント★
 * 文字列のサイズが 4 または 5 の時、サイズの半分は 2、文字列のサイズが 8、9 の時、サイズの半分が 4 となっていることから、
 * floor 関数を使って floor(len/2) と表現できることがわかります。これを middle としましょう。
 * また、切り取られる文字サイズが奇数のパターンの前方に着目すると、
 * 前方は ceil(middle/2) になっていることがわかるでしょう。
 */

public class MiddleSubstring {
    public static String middleSubstring(String stringInput) {
        int lengthOfString = stringInput.length();
        int middle;
        int firstIndex;

        // 文字数が 2 以下の場合
        if (lengthOfString <= 2) {
            return stringInput.substring(0, 1);
        }

        // 文字数が奇数の場合も偶数の場合も同じ？
        middle = (int)Math.floor(lengthOfString / 2);
        // System.out.println(middle);
        firstIndex = (int)Math.ceil(middle / 2.0);  // 2で割ると0.5が1ではなく0になってしまう。
        // System.out.println(firstIndex);
        return stringInput.substring(firstIndex, firstIndex + middle);

        // if (lengthOfString % 2 != 0) {
        //     middle = (int)Math.floor(lengthOfString / 2);
        //     firstIndex = (int)Math.ceil(middle / 2);
        //     return stringInput.substring(firstIndex, lengthOfString);
        // }

        // // 文字数が偶数の場合
        // if (lengthOfString % 2 == 0) {
        //     middle = lengthOfString / 2;
        // }

        // return "ERROR";
    }

    public static void main(String[] args) {
        System.out.println(middleSubstring("A"));
        System.out.println(middleSubstring("AB"));
        System.out.println(middleSubstring("ABC"));
        System.out.println(middleSubstring("ABCD"));
        System.out.println(middleSubstring("ABCDE"));
        System.out.println(middleSubstring("ABCDEF"));
        System.out.println(middleSubstring("ABCDEFG"));
        System.out.println(middleSubstring("ABCDEFGH"));
        System.out.println(middleSubstring("ABCDEFGHI"));
        System.out.println(middleSubstring("ABCDEFGHIJ"));
        System.out.println(middleSubstring("ABCDEFGHIJK"));
        System.out.println(middleSubstring("ABCDEFGHIJKL"));
        System.out.println(middleSubstring("fundamental"));
    }
}
