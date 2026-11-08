/*
 * 重力加速度 g[m/s2] で、高さ h[m] から物体をそっと落下させ、地上に到達するまで t 秒を要するとき、
 * h = 1/2 gt2 が成り立つとします。惑星 planet、落下時間 time[s] が与えられるので、落下距離[mile]を返す、
 * fallingDistance という関数を作成してください。
 * メートルからマイルへの変換は、1[m] = 0.000621371[mile] を使用してください。
 * また、求めた落下距離[mile]の小数点以下は切り捨ててください。
 */

package JavaLearning;

public class FallingDistance {

    // 落下距離[mile]を返すメソッド
    public static int fallingDistance(String planet, int time) {
        return (int)Math.floor(meterToMile(0.5 * planetGravityMpss(planet) * Math.pow(time, 2)));
    }

    // 惑星の重力加速度を返すメソッド
    public static double planetGravityMpss(String planet) {
        if (planet == "Earth") return 9.8;
        if (planet == "Jupiter") return 24.79;
        if (planet == "Mercury") return 3.7;
        return 0;
    }

    // メートルをマイルへ変換するメソッド
    public static double meterToMile(double meter) {
        return meter * 0.000621371;
    }
    public static void main(String[] args) {
        System.out.println(fallingDistance("Earth",5000));
        System.out.println(fallingDistance("Jupiter",1000));
        System.out.println(fallingDistance("Mercury",4500));
        System.out.println(fallingDistance("Pluto",2000));
    }
}
