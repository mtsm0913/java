package JavaLearning;

public class InsertUnderscoreAt {
    public static String insertUnderscoreAt(String s, int i) {
        if (i >= s.length()) {
            return s;
        } else {
            return s.substring(0, i) + "_" + s.substring(i, s.length());
        }
    }
    public static void main(String[] args) {
        System.out.println(insertUnderscoreAt("stevejobs",8));
        System.out.println(insertUnderscoreAt("stevejobs",9));
        System.out.println(insertUnderscoreAt("stevejobs",5));
        System.out.println(insertUnderscoreAt("stevejobs",0));
        System.out.println(insertUnderscoreAt("stevejobs",10));
        System.out.println(insertUnderscoreAt("donaldtrump",6));
        System.out.println(insertUnderscoreAt("Baseball is very fun.",5));
    }
}
