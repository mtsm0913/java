class Course38CSBeginnerLesson1510BuiltInFunctionNo02 {
    // 役割：持っているお金で、お菓子を何個買えるかを計算する関数
    static int howManyCandies(int money, int candyPrice) {
        // 1. 割り算で「何個分のお金があるか」を計算
        //    Javaでもint同士の割り算は自動で小数を捨てる
        int count = money / candyPrice;

        // 2. Math.maxで「マイナス個数にならない」を保証
        //    JavaではMath.を頭につけて呼び出す
        int safe = Math.max(0, count);

        return safe;
    }

    public static void main(String[] args) {
        // 同じ関数を3回呼び出して、買える個数の変化を確認する
        System.out.println(howManyCandies(500, 120));  // 4
        System.out.println(howManyCandies(100, 150));  // 0
        System.out.println(howManyCandies(1000, 250)); // 4
    }
}
