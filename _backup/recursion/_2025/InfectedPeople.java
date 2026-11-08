/*
 * アメリカにある得体の知れないウィルスが外国から持ち込まれ、毎日 2 倍のスピードで感染を拡大しています。
 * 経過日数 day が与えられるので、day 日目のみに感染した人の数を返す、infectedPeople という関数を
 * 作成してください。
*/

package JavaLearning;

public class InfectedPeople {

    public static int infectedPeople(int day){
        if (day == 1) {
            return 2;
        }
        return 2 * infectedPeople(day - 1);
    }

    public static void main(String[] args) {
        System.out.println(infectedPeople(1));
        System.out.println(infectedPeople(2));
        System.out.println(infectedPeople(3));
        System.out.println(infectedPeople(15));
        
        // System.out.println(Math.pow(2, 15));
    }
}
