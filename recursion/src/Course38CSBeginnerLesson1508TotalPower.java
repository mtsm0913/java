class Course38CSBeginnerLesson1508TotalPower {
    public static int totalPower(int level, int weapon, int armor){
        // 関数を完成させてください
        int total = 0;
        total += calculateAttackPower(level, weapon);
        total += calculateDefensePower(level, armor);
        return total;
    }
    static int calculateAttackPower(int level, int weapon) {
        return level * 2 + weapon;
    }
    static int calculateDefensePower(int level, int armor) {
        return level + armor * 2;
    }
    public static void main(String[] args) {
        System.out.println(totalPower(10, 30, 20));   // 100
        System.out.println(totalPower(1, 0, 0));      // 3
        System.out.println(totalPower(50, 100, 80));  // 410
    }
}
