package JavaLearning;

/*
CSSクラスとスクリーンサイズ
xs: スマホサイズ（スクリーン幅 768px 未満）
sm: タブレットサイズ（スクリーン幅 768px 以上）
md: ノートパソコンサイズ（スクリーン幅 992px 以上）
lg: デスクトップサイズ（スクリーン幅 1200px 以上）
 */

public class GetBootstrapClass {
    public static String getBootstrapClass(int screenWidth) {
        if (screenWidth < 768) return "xs";
        else if (screenWidth < 992) return "sm";
        else if (screenWidth < 1200) return "md";
        else return "lg";
    }
    public static void main(String[] args) {
        System.out.println(getBootstrapClass(340));
        System.out.println(getBootstrapClass(800));
        System.out.println(getBootstrapClass(1000));
        System.out.println(getBootstrapClass(1350));
    }
}
