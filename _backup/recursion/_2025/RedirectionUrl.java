package JavaLearning;

public class RedirectionUrl {
    public static String redirectionUrl(String language){
        // 関数を完成させてください
        switch (language) {
            case "Japanese":
                return "www.example.org/ja";
            case "English":
                return "www.example.org/en";
            case "Spanish":
                return "www.example.org/es";
            case "Russian":
                return "www.example.org/ru";
            default:
                return "www.example.org/";
        }
    }

    public static void main(String[] args){
        // System.out.println("Hello");
        System.out.println(redirectionUrl("Japanese"));
        System.out.println(redirectionUrl("English"));
        System.out.println(redirectionUrl("Spanish"));
        System.out.println(redirectionUrl("Russian"));
        System.out.println(redirectionUrl("German"));
    }
}
