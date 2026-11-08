/*
 * クレジットカード会社 creditCardType と食事代（税抜き）cost が与えられるので、
 * 以下の条件に沿った、processPayment という関数を作成してください。
 * 
 * - このレストランでは Visa か MasterCard 以外は対応しておらず、-1.0 を返します。
 * - 消費税は一律 10% です。
 * - ウェイターへのチップは食事代（税抜き）が 3 で割り切れるとき 3%、5 で割り切れるとき 5%、
 *   7 で割り切れるとき 7%、それ以外の場合は一律で 10% を請求します。
 * - 合計金額が 300 ドルを超えると、クレジットカードが残高不足になり、-1.0 を返します。
 */

package JavaLearning;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ProcessPayment {

    // メイン
    public static double processPayment(String creditCardType , int cost) {
        final double TAX = 0.1;
        boolean validCard = isCardValid(creditCardType);
        if (!validCard) return -1;
        double totalCost = cost * (1 + TAX) + calculateTip(cost);
        if (totalCost > 300) return -1;
        return totalCost;
    }

    // クレジットカード会社の判定
    public static boolean isCardValid(String creditCardType) {
        return "Visa".equals(creditCardType) || "MasterCard".equals(creditCardType);
    }

    // チップの金額の計算
    public static double calculateTip(int cost) {
        if (cost % 3 == 0) return cost * 0.03;
        if (cost % 5 == 0) return cost * 0.05;
        if (cost % 7 == 0) return cost * 0.07;
        return cost * 0.1;
    }
    
    public static void main(String[] args) {
        System.out.println(processPayment("MasterCard",150));
        System.out.println(processPayment("American Express",93));
        System.out.println(processPayment("Visa",210));
        System.out.println(processPayment("Visa",259));
        System.out.println(processPayment("Visa",260));
        System.out.println(processPayment("American Express",928));
        System.out.println(processPayment("Visa Retired",683));
        System.out.println(processPayment("Discover Card",10));
        System.out.println(processPayment("American Express",160));
    }
}
