public class Course38CSBeginnerLesson1501IsTriangle {
    public static boolean isTriangle(int a, int b, int c){
        // 関数を完成させてください
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isTriangle(3, 4, 5));   // true
        System.out.println(isTriangle(1, 1, 5));   // false
        System.out.println(isTriangle(5, 5, 5));   // true
        System.out.println(isTriangle(10, 2, 3));  // false
    }
}
