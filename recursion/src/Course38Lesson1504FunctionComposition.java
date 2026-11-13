public class Course38Lesson1504FunctionComposition {
    // 1. 役割：ファイルサイズ（MB）から基本の処理時間を計算（1MB = 5秒）
    static int getBaseTime(int fileSize) {
        return fileSize * 5;
    }

    // 2. 役割：サーバーの準備時間（オーバーヘッド）を加算（一律10秒）
    static int addOverhead(int time) {
        return time + 10;
    }

    // 3. 役割：プレミアム会員の高速処理を適用（時間を半分にする）
    static int applyPremiumSpeed(int time) {
        return time / 2;
    }

    public static void main(String[] args) {
        // 動画サイズ：20MBの場合
        int size = 20;

        // 中間の値に名前を付けながら、段階的につなげる
        int baseTime = getBaseTime(size);             // 20 * 5 = 100秒
        int timeWithOverhead = addOverhead(baseTime); // 100 + 10 = 110秒
        int finalTime = applyPremiumSpeed(timeWithOverhead); // 110 / 2 = 55秒

        System.out.println("Estimated Wait Time (Seconds):");
        System.out.println(finalTime);
    }
}
