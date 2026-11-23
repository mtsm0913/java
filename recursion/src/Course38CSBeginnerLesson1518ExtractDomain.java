class Course38CSBeginnerLesson1518ExtractDomain {
    public static String extractDomain(String url){
        String urlWithoutProtocol = url.substring(8);
        return urlWithoutProtocol.substring(0, urlWithoutProtocol.indexOf("/"));
    }
    public static void main(String[] args) {
        System.out.println(extractDomain("https://github.com/recursionist"));
        System.out.println(extractDomain("https://google.com/search"));
        System.out.println(extractDomain("https://recursion.io/courses/38"));
        System.out.println(extractDomain("https://www.example.com/about/team"));
        System.out.println(extractDomain("https://docs.python.org/3/library"));
    }
}
