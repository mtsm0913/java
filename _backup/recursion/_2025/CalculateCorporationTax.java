/*
 * アメリカ合衆国の法人税は、連邦税と州税があります。連邦税の税率は収益の 21％、州税は州ごとに税率が決まっています。
 * 各州での税率は以下の表を参考にしてください。
 * 
 * 州名	税率
 * アリゾナ（AZ）	4.9
 * カリフォルニア（CA）	8.84
 * テキサス（TX）	0
 * ノースカロライナ（NC）	2.5
 * その他	5
 * 
 * 閏年は特別とされ、その年の連邦税は免除されます。会社の利益 profit、州名 state、年 year が
 * 与えられるので、企業が支払わなければいけない法人税を計算する、calculateCorporationTax という関数を
 * 作成してください。
 * なお最終的な法人税は小数点を切り上げてください。
 */

package JavaLearning;

public class CalculateCorporationTax {

    // メイン
    public static int calculateCorporationTax(String state, int year, int profit) {
        double stateTax = calculateStateTax(state, profit);
        double federalTax = calculateFederalTax(profit, year);
        return (int)Math.ceil(stateTax + federalTax);
    }

    // 州税を計算
    public static double calculateStateTax(String state, int profit) {

        double stateTaxRate;
        if (state == "AZ") stateTaxRate = 0.049;
        else if (state == "CA") stateTaxRate = 0.0884;
        else if (state == "TX") stateTaxRate = 0.0;
        else if (state == "NC") stateTaxRate = 0.025;
        else stateTaxRate = 0.05;

        double stateTax = profit * stateTaxRate;
        return stateTax;
    }

    // 連邦税を計算
    // ★閏年かどうかの判定が必要★
    public static double calculateFederalTax(int profit, int year) {
        final double FEDERAL_TAX_RATE = 0.21;
        if (year % 400 == 0) return 0;
        if (year % 4 == 0 && year % 100 != 0) return 0;
        return profit * FEDERAL_TAX_RATE;
    }


    public static void main(String[] args) {
        System.out.println(calculateCorporationTax("CA",2021,100000));
        System.out.println(calculateCorporationTax("CA",2004,100000));
        System.out.println(calculateCorporationTax("TX",1990,207645));
        System.out.println(calculateCorporationTax("NC",2000,201735));
        System.out.println(calculateCorporationTax("AZ",2001,980379));
        System.out.println(calculateCorporationTax("AZ",2012,439935));
        System.out.println(calculateCorporationTax("MN",1990,546638));
        System.out.println(calculateCorporationTax("NE",1978,623131));
    }
}
