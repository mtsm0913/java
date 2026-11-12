public class Course38Lesson1502PassInterview {
    public static boolean passInterview(int age, int years, boolean hasDegree){
        // 関数を完成させてください
        return age >= 25 && (years >= 3 || hasDegree == true);
    }
    public static void main(String[] args) {
        System.out.println(passInterview(30, 5, false));   // true
        System.out.println(passInterview(28, 1, true));    // true
        System.out.println(passInterview(26, 2, false));   // false
        System.out.println(passInterview(22, 10, true));   // false
    }
}
