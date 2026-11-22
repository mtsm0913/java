class Course38CSBeginnerLesson1515ToHttps {
    public static String toHttps(String url) {
        if (url.startsWith("http://")) {
            // return url.replace("http://", "https://");
            return url.replaceFirst("http://", "https://");
        } else {
            return url;
        }
    }
    public static void main(String[] args) {
        System.out.println(toHttps("http://example.com"));
        System.out.println(toHttps("https://google.com"));
        System.out.println(toHttps("http://recursion.io/me"));
        System.out.println(toHttps("http://github.com/user/repo"));
        System.out.println(toHttps("https://already-secure.com/path"));
    }
}
