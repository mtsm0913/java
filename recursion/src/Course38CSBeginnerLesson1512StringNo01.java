class Course38CSBeginnerLesson1512StringNo01 {
    public static void main(String[] args) {
        String s = "Hello World";

        // === 1. 長さを調べる ===
        // 文字列の長さを調べる。パスワードが規定の長さ以上かの確認などに使う
        // Javaでは .length() という関数（カッコが必要）
        System.out.println(s.length()); // 11

        // === 2. 大文字と小文字を変換する ===
        // 全体を大文字または小文字に揃える
        // 大文字と小文字の違いを気にせず比較したいときに使う
        // Javaは1ステップで全体変換できる
        System.out.println(s.toLowerCase()); // hello world
        System.out.println(s.toUpperCase()); // HELLO WORLD

        // === 3. 一部分を切り出す ===
        // 位置を指定して、文字列の一部だけを取り出す
        // 例: "2026-04-01" の先頭4文字を取れば "2026" が得られる
        // substring(開始位置, 終了位置の手前)
        System.out.println(s.substring(0, 5)); // Hello
        System.out.println(s.substring(6));    // World (6番目から末尾)

        // === 4. 特定の文字列を探す ===
        // 探している文字列が何番目にあるかを調べる
        // メールアドレスに @ が入っているかの確認などに使う
        // indexOfは見つけた位置を返す。見つからないと -1
        System.out.println(s.indexOf("World")); // 6

        // === 5. 一部を置き換える ===
        // 見つけた文字列を、別の文字列に差し替える
        // 誤字の修正や、個人情報の伏せ字などに使う
        // replace(古い文字列, 新しい文字列) で全置換できる
        System.out.println(s.replace("World", "Java")); // Hello Java
    }
}
