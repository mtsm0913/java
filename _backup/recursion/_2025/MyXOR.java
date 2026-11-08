package JavaLearning;

public class MyXOR {
    public static boolean myXOR(boolean p, boolean q){
        if (p && q) return false;
        else if (p || q) return true;
        else return false;
        // 別解
        // return p != q;
    }

    public static void main(String[] args){
        System.out.println(myXOR(true, false));
        System.out.println(myXOR(false, true));
        System.out.println(myXOR(false, false));
        System.out.println(myXOR(true, true));
    }
}
