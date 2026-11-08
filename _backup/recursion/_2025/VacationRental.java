package JavaLearning;

/*
 * 人数 people と宿泊日数 day が与えられるので、民泊の合計金額を返す、vacationRental という関数を
 * 作成してください。この物件では、3 泊以下の宿泊では 1 泊 80 ドル、4 泊以上では 1 泊 60 ドル、
 * 10 泊以上では 1 泊 50 ドルになります。また清掃費として宿泊料金の 12% が加算され、
 * 全体の金額に 8% の税金がかかります。もし合計金額に小数点以下の数字が含まれている場合、
 * その数字を切り捨てて整数にしてください。
 */

public class VacationRental {
    public static int vacationRental(int people, int day) {
        int nightlyFee;
        final double CLEANING_FEE_RATE = 0.12;
        final double TAX_RATE = 0.08;
        if (day <= 3) nightlyFee = 80;
        else if (day <= 9) nightlyFee = 60;
        else nightlyFee = 50;
        double baseAmount = nightlyFee * people * day * (1 + CLEANING_FEE_RATE) * (1 + TAX_RATE);
        int totalAmount = (int)Math.floor(baseAmount);
        return totalAmount;
    }
    public static void main(String[] args) {
        System.out.println(vacationRental(2, 3));
        System.out.println(vacationRental(2, 4));
        System.out.println(vacationRental(2, 8));
        System.out.println(vacationRental(4, 5));
        System.out.println(vacationRental(12, 10));
    }
}
