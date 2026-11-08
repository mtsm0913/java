/*
 * 元金 capital と年数 year が与えられるので、複利を使って将来の合計金額を計算します。
 * 以下の要件に基づいて、関数 calculateGoalMoney を作成してください。
 * - 元金（capital）と期間（year）を使用して、複利の式 P(1+i)n を使って将来の最終的な金額を計算します。
 * - 最初の元金が偶数の場合は年利率が 2％、奇数の場合は年利率が 3％ とします。
 * - 計算結果は小数点以下を切り捨て、整数として返します。
 */

package JavaLearning;

public class CalculateGoalMoney {
    public static int calculateGoalMoney(int capital, int year) {
        double rate = interestRate(capital);
        return (int)Math.floor(capital * Math.pow(1 + rate, year));
    }

    // 元金を受け取り、年利率を返すメソッド
    public static double interestRate(int capital) {
        if (capital % 2 == 0) return 0.02;
        else return 0.03;
    }
    public static void main(String[] args) {
        System.out.println(calculateGoalMoney(2, 3));
        System.out.println(calculateGoalMoney(4, 7));
        System.out.println(calculateGoalMoney(16, 24));
        System.out.println(calculateGoalMoney(35, 47));
    }
}
