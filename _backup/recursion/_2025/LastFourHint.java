package JavaLearning;

public class LastFourHint {
    public static String lastFourHint(String stringInput) {
        if (stringInput.length() < 6) return "There is no Hint";
        int beginIndex = stringInput.length() - 4;
        return "Hint is:" + stringInput.substring(beginIndex, stringInput.length());
    }
    public static void main(String[] args) {
        System.out.println(lastFourHint("text"));
        System.out.println(lastFourHint("Ocean"));
        System.out.println(lastFourHint("the ocean is blue"));
        System.out.println(lastFourHint("abcdef"));
        System.out.println(lastFourHint("integer"));
        System.out.println(lastFourHint("1-545-452-5123"));
    }
}
