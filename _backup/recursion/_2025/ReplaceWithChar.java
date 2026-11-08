package JavaLearning;

public class ReplaceWithChar {
    public static String replaceWithChar(String s, char letter) {
        return s.replace(String.valueOf(letter), "");
    }
    public static void main(String[] args) {
        System.out.println(replaceWithChar("aaa", 'a'));
        System.out.println(replaceWithChar("abaa", 'a'));
        System.out.println(replaceWithChar("abcde", 'z'));
        System.out.println(replaceWithChar("abcdaefga", 'a'));
        System.out.println(replaceWithChar("abcdaefga", 'e'));
    }
}
