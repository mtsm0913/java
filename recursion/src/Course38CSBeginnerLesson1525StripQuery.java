class Course38CSBeginnerLesson1525StripQuery {
    public static String stripQuery(String url){
        int qMarkIndex = url.indexOf("?");
        if (qMarkIndex != -1) {
            return url.substring(0, qMarkIndex);
        } else {
            return url;
        }
    }
    public static void main(String[] args) {
        System.out.println(stripQuery("https://example.com/page?ref=twitter"));
        System.out.println(stripQuery("https://google.com/search?q=js&hl=en"));
        System.out.println(stripQuery("https://recursion.io"));
        System.out.println(stripQuery("http://a.com/b?c=d"));
        System.out.println(stripQuery("https://example.com/no-query"));
    }
}
