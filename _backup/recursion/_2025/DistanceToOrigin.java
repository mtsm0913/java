package JavaLearning;

/*
x-y グラフにおいて、点 A（x,y）が与えられるので、原点から点 A までの距離を返す、
distanceToOrigin という関数を定義してください。（x, y はともに整数）
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DistanceToOrigin {
    public static double distanceToOrigin(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        // Another solution
        // return Math.pow(x * x + y * y, 0.5);
    }
    public static void main(String[] args) {
        System.out.println(distanceToOrigin(3, 4));
        System.out.println(distanceToOrigin(-2, 5));
        System.out.println(distanceToOrigin(1, -2));
        System.out.println(distanceToOrigin(556, -938));
        System.out.println(distanceToOrigin(0, 5));
        System.out.println(distanceToOrigin(0, 0));
    }
}
