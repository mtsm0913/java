public class Course38CSBeginnerLesson1507BoxSurfaceArea {
    public static int boxSurfaceArea(int a, int b, int c){
        // 関数を完成させてください
        // return (a * b + b * c + c * a) * 2;
        int area = 0;
        area += calculateArea(a, b);
        area += calculateArea(b, c);
        area += calculateArea(c, a);
        area *= 2;
        return area;
    }
    static int calculateArea(int x ,int y) {
        return x * y;
    }
    public static void main(String[] args) {
        System.out.println(boxSurfaceArea(2, 3, 4));   // 52
        System.out.println(boxSurfaceArea(1, 1, 1));   // 6
        System.out.println(boxSurfaceArea(5, 10, 3));  // 190
    }

    //    模範解答
//    public static int rectArea(int w, int h) {
//        return w * h;
//    }
//
//    public static int boxSurfaceArea(int a, int b, int c) {
//        return 2 * (rectArea(a, b) + rectArea(b, c) + rectArea(a, c));
//    }
}
