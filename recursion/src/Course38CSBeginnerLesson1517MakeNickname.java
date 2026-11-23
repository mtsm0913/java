class Course38CSBeginnerLesson1517MakeNickname {
    public static String makeNickname(String name1, String name2){
        return name1.substring(0, 2) + name2.substring(0, 2);
    }
    public static void main(String[] args) {
        System.out.println(makeNickname("Yamada","Tanaka"));
        System.out.println(makeNickname("Suzuki","Ito"));
        System.out.println(makeNickname("Hiroshi","Yumi"));
        System.out.println(makeNickname("Alice","Bob"));
        System.out.println(makeNickname("Recursion","Master"));
    }
}
