package JavaLearning;

/*
* あるメールアドレス email を受け取るので、それが正しいものであれば true を、
* そうでなければ false を返す isValidEmail という関数を作成してください。
* ここでの正しいアドレスというのは以下の 4 つの条件を満たすものを指します。
* ・「@」から始まらないこと
* ・スペースがないこと
* ・「@」を 1 つのみ含んでいること
* ・「@」の後に「.」があること
*/

public class IsValidEmail {
    public static boolean isValidEmail(String email) {

        // "@"のindexが0 -> false
        if (email.indexOf("@") <= 0) {
            return false;
        }

        // " "がある -> false
        if (email.indexOf(" ") >= 0) {
            return false;
        }

        // "@"が複数存在する -> false
        if (email.indexOf("@", email.indexOf("@") + 1) != -1) {
            return false;
        }
        // 別解
        // if (email.indexOf("@") != email.lastIndexOf("@")) {
        //     return false;
        // }

        // "@"の後ろに"."が存在しない -> false
        if (email.indexOf(".", email.indexOf("@")) == -1) {
            return false;
        }

        // "@"のindexが0 かつ "@"が1つだけ存在し、"@"の後ろに"."が存在しない -> true
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("ccc@aaa.com"));
        System.out.println(isValidEmail("c@cc@aaa.com"));
        System.out.println(isValidEmail("cc c@aaa.com"));
        System.out.println(isValidEmail("cc.c@aaacom"));
        System.out.println(isValidEmail("cc.c@aaa.com"));
        System.out.println(isValidEmail("@aaa.com"));
        System.out.println(isValidEmail("aaaccc.com"));
    }
}
