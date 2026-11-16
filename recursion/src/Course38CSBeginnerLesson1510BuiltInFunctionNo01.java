class Course38CSBeginnerLesson1510BuiltInFunctionNo01 {
    public static void main(String[] args) {
        // === 1. 絶対値 ===
        // JavaではMath.を頭につけて呼び出す
        System.out.println(Math.abs(-15));   // 15 (マイナスを取り除く)
        System.out.println(Math.abs(7));     // 7

        // === 2. 最大値 / 最小値 ===
        // Math.max / Math.minは引数2つまでなので、3つ比べたいときは入れ子にする
        System.out.println(Math.max(10, Math.max(25, 3))); // 25
        System.out.println(Math.min(10, Math.min(25, 3))); // 3

        // === 3. 数値を丸める ===
        // floorは下側の整数へ、ceilは上側の整数へ、roundは近い整数へ
        // 丸め方のルールは言語によって違うので、仕様を確認する
        System.out.println(Math.round(3.7)); // 4 (近い整数へ丸める)
        System.out.println(Math.round(3.4)); // 3 (近い整数へ丸める)
        System.out.println(Math.floor(3.9)); // 3.0 (下側の整数へ、結果はdouble)
        System.out.println(Math.ceil(3.1));  // 4.0 (上側の整数へ、結果はdouble)

        // === 4. べき乗 ===
        System.out.println(Math.pow(2, 10)); // 1024.0 (Javaのpowは結果がdouble)

        // === 5. 文字列を数値に変換 ===
        // Javaは型ごとにクラスが違う：整数はInteger、小数はDouble
        System.out.println(Integer.parseInt("100"));    // 100
        System.out.println(Integer.parseInt("25") + 5); // 30 (数値に変換してから計算)
        System.out.println(Double.parseDouble("3.14")); // 3.14

        // === 6. 数値を文字列に変換 ===
        // JavaではString.valueOfで文字列に変換
        System.out.println(String.valueOf(98)); // 98
        System.out.println(String.valueOf(-7)); // -7

        // === 7. 変換できたことと、入力が正しいことは別 ===
        // JavaのInteger.parseInt("25歳")はエラーになる
        // 一方JavaScriptのparseInt("25歳")は25を返す
        // つまり変換できたからといって、入力全体が正しいわけではない
        // 入力を受け取ったら、形式が正しいかを確認してから変換する
    }
}
