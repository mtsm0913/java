class Course38CSBeginnerLesson1498Subtraction {
    // Javaでは関数を定義するときに、データ型を示す必要があります。
    // この問題では int 型の引数 x と y を受け取って、int 型の答えを返します。

    public static int getLowestTemperature(int x, int y) {
        // public static は「全てのクラスに公開する静的メソッド」という意味で、詳しくは後の章で説明します。

        // return 文で式を返します。
        return x - y; // ステートメントの終わりに;（セミコロン）


    }
    // --------------以下は解答に書く必要はありません---------------------
    // main メソッドの中で、テストケースを入れた関数を呼び出し、System.out.println() で表示してみましょう。


    // mainメソッド
    public static void main(String[] args) {

        System.out.println(getLowestTemperature(2,10));
        System.out.println(getLowestTemperature(20,5));
        System.out.println(getLowestTemperature(8,14));

    }
}