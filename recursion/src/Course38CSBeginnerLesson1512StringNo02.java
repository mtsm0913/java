class Course38CSBeginnerLesson1512StringNo02 {
    public static void main(String[] args) {
        // === 1. パスワードの長さチェック (8文字以上か) ===
        String password = "MyP@ssw0rd";
        System.out.println(password.length() >= 8); // true

        // === 2. メールアドレスを正規化（大小文字を統一） ===
        String email = "Alice@Example.com";
        System.out.println(email.toLowerCase()); // alice@example.com

        // === 3. 名前の頭文字を取り出す ===
        String firstName = "Taro";
        System.out.println(firstName.substring(0, 1)); // H

        // === 4. キーワードが含まれているかチェック ===
        // contains() は見つかれば true、なければ false を返す
        String comment = "This product is amazing.";
        System.out.println(comment.contains("amazing")); // true

        // === 5. ファイル拡張子を取り出す ===
        String filename = "document.pdf";
        int dotPos = filename.indexOf(".");
        System.out.println(filename.substring(dotPos + 1)); // pdf

        // === 6. URLからhttps://を除く ===
        String url = "https://github.com/recursionist";
        System.out.println(url.replace("https://", "")); // github.com/recursionist

        // === 7. ユーザー名のマスキング ===
        String userEmail = "tanaka@example.com";
        int atPos = userEmail.indexOf("@");
        String username = userEmail.substring(0, atPos);
        System.out.println(userEmail.replace(username, "***")); // ***@example.com

        // === 8. ハッシュタグの判定 ===
        String post = "#java";
        System.out.println(post.substring(0, 1).equals("#")); // true

        // === 9. テキストプレビュー（最初の10文字 + ...） ===
        String article = "JavaScript is a popular language";
        System.out.println(article.substring(0, 10) + "..."); // JavaScript...

        // === 10. 大文字小文字を区別せずに比較 ===
        String input = "JAVA";
        String target = "java";
        System.out.println(input.toLowerCase().equals(target.toLowerCase())); // true
    }
}
