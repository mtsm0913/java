package JavaLearning;

public class DeleteAt {
    public static int getAtLocation(String email) {
        if (email.indexOf("@") + 1 == 0) return -1;
        return email.indexOf("@") + 1;
        // Another solution
        // int pos = email.indexOf("@");
        // if(pos != -1) return pos + 1;
        // return -1;
    }
    public static void main(String[] args) {
        System.out.println(getAtLocation("ccc@aaa.com"));
        System.out.println(getAtLocation("c@cc@aaa.com"));
        System.out.println(getAtLocation("cc c@aaa.com"));
        System.out.println(getAtLocation("cc.c@aaacom"));
        System.out.println(getAtLocation("cc.c@aaa.com"));
        System.out.println(getAtLocation("@aaa.com"));
        System.out.println(getAtLocation("aaaccc.com"));
    }
}
