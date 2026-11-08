package JavaLearning;

public class DeleteAt {
    public static String deleteAt(String s, int i) {
        if (i > s.length()) return s;
        if (i == 0) return s;
        String front = s.substring(0, i - 1);
        String back = s.substring(i, s.length());
        return front + back;
        // Another solution
        // if (i == 0 || s.length() < i) return s;
        // return s.substring(0, i - 1) + s.substring(i);
    }
    public static void main(String[] args) {
        System.out.println(deleteAt("abcdefg", 0));
        System.out.println(deleteAt("abcdefg", 4));
        System.out.println(deleteAt("abcdefg", 6));
        System.out.println(deleteAt("abcdefg", 7));
        System.out.println(deleteAt("abcdefg", 8));
        System.out.println(deleteAt("recursion", 3));
        System.out.println(deleteAt("Rolling in the park", 6));
    }

    // public static void main (String[] args) {
    //     String s = "abcdefg";
    //     // int i = 0;
    //     System.out.println(s.substring(0, 1));  // a
    // }
}
