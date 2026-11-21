class Course38CSBeginnerLesson1514ContainsNG {
    public static boolean containsNG(String post, String ngWord) {
        if(post.indexOf(ngWord) != -1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // boolean checkOfString = false;
        // checkOfString = containsNG("This product is amazing.","amazing");
        // System.out.println(checkOfString);
        System.out.println(containsNG("This product is amazing.","amazing"));
        System.out.println(containsNG("Hello world","bad"));
        System.out.println(containsNG("RECURSION is fun","fun"));
        System.out.println(containsNG("I love programming","Java"));
        System.out.println(containsNG("The quick brown fox","quick"));
    }
}
