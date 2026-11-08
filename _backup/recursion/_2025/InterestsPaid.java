package JavaLearning;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class InterestsPaid {
    public static double interestsPaid(int initialLoan, boolean didPayOnTime){
        // 関数を完成させてください
        if (didPayOnTime) {
            double initialLoanDouble = initialLoan * 1.02 + 2.5;
            return initialLoanDouble;
        } else {
            double initialLoanDouble = initialLoan * 1.15 + 2.5;
            return initialLoanDouble;
        }
    }

    public static void main(String[] args){
        // System.out.println("Hello");
        System.out.println(interestsPaid(830, false));
    }
}
