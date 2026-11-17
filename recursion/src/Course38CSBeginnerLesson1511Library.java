import java.util.Random; // ランダムな数を作る機能を使えるようにする

class Course38CSBeginnerLesson1511Library {
    public static void main(String[] args) {
        // 乱数を作る道具をひとつ用意する
        // nextInt(N)は0〜N-1を返すので、+1などで欲しい範囲にずらす
        Random rand = new Random();

        // === サイコロ (1〜6) ===
        System.out.println(rand.nextInt(6) + 1);   // 1〜6
        System.out.println(rand.nextInt(6) + 1);

        // === コインフリップ (0=表, 1=裏) ===
        System.out.println(rand.nextInt(2));       // 0 か 1

        // === じゃんけん (1=グー, 2=チョキ, 3=パー) ===
        System.out.println(rand.nextInt(3) + 1);   // 1〜3

        // === ランダムな月 (1〜12) ===
        System.out.println(rand.nextInt(12) + 1);  // 1〜12

        // === ランダムカラー (RGB 各 0〜255) ===
        // 3回呼び出すと、毎回違う色を作れる
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        System.out.println(r + "," + g + "," + b);

        // === ガチャ判定 (1〜100、95以上で大当たり) ===
        int gacha = rand.nextInt(100) + 1;
        System.out.println(gacha); // 95〜100 が出たら大当たり
    }
}
