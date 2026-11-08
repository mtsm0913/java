package JavaLearning;

public class ScreenViewMode {
    public static String screenViewMode(int height, int width) {
        if (height >= width) return "portrait";
        else return "landscape";
    }
    public static void main(String[] args) {
        System.out.println(screenViewMode(200, 150));
        System.out.println(screenViewMode(120, 100));
        System.out.println(screenViewMode(50, 100));
        System.out.println(screenViewMode(60, 60));
    }
}
