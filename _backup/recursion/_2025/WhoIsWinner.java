package JavaLearning;

public class WhoIsWinner {
    public static String whoIsWinner(int hisCard){
        // 関数を完成させてください
        final int myCard = 10;
        if (hisCard == 2 || hisCard == 1 || hisCard > myCard) {
            return "you lose";
        } else if (hisCard == myCard) {
            return "draw";
        } else {
            return "you win";
        }
    }

    public static void main(String[] args){
        System.out.println(whoIsWinner(1));
        System.out.println(whoIsWinner(2));
        System.out.println(whoIsWinner(3));
        System.out.println(whoIsWinner(9));
        System.out.println(whoIsWinner(10));
        System.out.println(whoIsWinner(11));
    }
}
