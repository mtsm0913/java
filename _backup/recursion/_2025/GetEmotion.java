/*
 * 重力加速度 g[m/s2]、高さ h[m] のタワーオブテラーの頂点から、真下に落下したとき、
 * 地面直前の速度 v[m/s] は√2ghで定義されます。また重力加速度は惑星によって異なり、
 * 以下の表のように定義されます。
 * 
 * 惑星名	重力加速度[m/s2]
 * Earth（地球）	9.8
 * Jupiter（木星）	24.79
 * Mars（火星）	3.71
 * Pluto（冥王星）	0.58
 * Moon（月）	1.62
 * その他	0
 * 
 * また地面直前の速さによって、以下のように恐怖レベルが定義されています。
 * 
 * 速さ[m/s]	恐怖レベル
 * 80 以上	terrified
 * 60 以上 80 未満	frighten
 * 40 以上 60 未満	scared
 * 40 未満	afraid
 * 
 * 高さ height、惑星 planet が与えられるので、惑星上での恐怖レベルを返す、getEmotion という関数を
 * 定義してください。重力加速度が定義されていない惑星については、no data と返してください。
 */

package JavaLearning;

public class GetEmotion {

    // メイン
    public static String getEmotion(int height, String planet){
        double g = getG(planet);
        // 重力加速度が定義されていない惑星については、no data と返す。
        if (g == 0) {
            return "no data";
        }
        double speed = getSpeed(g, height);
        if (speed >= 80) return "terrified";
        else if (speed >= 60) return "frighten";
        else if (speed >= 40) return "scared";
        else return "afraid";
    }

    // 惑星を受け取り、重力加速度を返す。
    public static double getG(String planet) {
        switch (planet) {
            case "Earth":
                return 9.8;
            case "Jupiter":
                return 24.79;
            case "Mars":
                return 3.71;
            case "Pluto":
                return 0.58;
            case "Moon":
                return 1.62;
            default:
                return 0;
        }
    }
   
    // 重力加速度と高さを受け取り、地面直前の速さを返す。
    public static double getSpeed(double g, double height) {
        return Math.sqrt(2 * g * height);
    }

    public static void main(String[] args) {
        System.out.println(getEmotion(0,"Earth"));
        System.out.println(getEmotion(0,"Venus"));
        System.out.println(getEmotion(88,"Earth"));
        System.out.println(getEmotion(100,"Earth"));
        System.out.println(getEmotion(464,"Jupiter"));
        System.out.println(getEmotion(511,"Pluto"));
        System.out.println(getEmotion(669,"Mars"));
        System.out.println(getEmotion(800,"Moon"));
        System.out.println(getEmotion(41,"Venus"));
        System.out.println(getEmotion(398,"Earth"));
        System.out.println(getEmotion(169,"Mercury"));
    }
}
