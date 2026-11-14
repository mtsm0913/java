public class Course38CSBeginnerLesson1505FunctionDecomposition {
    // 1. 役割：年齢が規定（13歳以上）を満たしているか判定する
    // 引数：整数 / 戻り値：true か false
    static boolean isValidAge(int age) {
        return age >= 13;
    }

    // 2. 役割：パスワードが安全な長さ（8文字以上）か判定する
    // 引数：文字列 / 戻り値：true か false
    static boolean isSecurePassword(String password) {
        return password.length() >= 8;
    }

    // 3. 役割：2つの判定を組み合わせて、登録できるかどうかを決める
    static String registerUser(int age, String password) {
        // それぞれの関数に値を渡して、判定結果を受け取る
        boolean validAge = isValidAge(age);
        boolean securePass = isSecurePassword(password);

        // 両方の判定が true のときだけ登録できる
        if (validAge && securePass) {
            return "Registration Successful";
        } else {
            return "Registration Failed: Invalid input";
        }
    }

    public static void main(String[] args) {
        // 試すデータ
        int userAge = 15;
        String userPass = "secret123";

        System.out.println("Registration Status:");
        System.out.println(registerUser(userAge, userPass));
    }
}
