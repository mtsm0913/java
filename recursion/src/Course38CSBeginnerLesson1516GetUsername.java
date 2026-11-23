class Course38CSBeginnerLesson1516GetUsername {
    public static String getUsername(String email){
        int atSignIndex = email.indexOf("@");
        return email.substring(0, atSignIndex);
    }
    public static void main(String[] args) {
        System.out.println(getUsername("alice@gmail.com"));
        System.out.println(getUsername("bob@yahoo.co.jp"));
        System.out.println(getUsername("admin@recursion.io"));
        System.out.println(getUsername("taro.yamada@example.com"));
        System.out.println(getUsername("user123@test.org"));
    }
}
