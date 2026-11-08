package JavaLearning;

public class IsSubstring {
    public static boolean isSubstring(String s1, String s2) {
        return s1.indexOf(s2) >= 0;
    }
    public static void main(String[] args) {
        System.out.println(isSubstring("hello world!","world!"));
        System.out.println(isSubstring("hello world!","World!"));
        System.out.println(isSubstring("hello pluto!","world!"));
        System.out.println(isSubstring("hello world!","d!rolw"));
        System.out.println(isSubstring("hello pluto!","do"));
        System.out.println(isSubstring("Fly away duck.","aw"));
        System.out.println(isSubstring("Fly away duck.","Fly"));
    }
}
