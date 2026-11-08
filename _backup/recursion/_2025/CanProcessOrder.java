package JavaLearning;

/*
乗客はまずメインディッシュとしてビーフかチキンのどちらかを選び、
その後ドリンクについてもコーヒーかお茶のどちらか一方を選びます。
またオプションとして、サラダをつけることもできます。
注文はメインディッシュ、ドリンクを各々必ず 1 つだけ含めないといけませんが、
サラダの有無については問いません。
 */

public class CanProcessOrder {
    public static boolean 
    canProcessOrder(boolean beef, boolean chicken, boolean salad, boolean coffee, boolean tea) {
        return beef != chicken && coffee != tea;
        // another solution
        // if (tea == coffee || beef == chicken) return false;
        // return true;  
    }
    public static void main(String[] args) {
        System.out.println(canProcessOrder(false,false,true,false,true));
        System.out.println(canProcessOrder(false,true,true,false,true));
        System.out.println(canProcessOrder(true,true,true,false,true));
        System.out.println(canProcessOrder(true,false,true,true,true));
        System.out.println(canProcessOrder(true,false,false,false,false));
        System.out.println(canProcessOrder(false,true,false,false,true));
    }
}
