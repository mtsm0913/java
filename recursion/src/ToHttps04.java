class ToHttps04 {
    public static String toHttps(String url) {
        if (url.startsWith("http://")) {
            return url.replaceFirst("http://", "https://");
        } else {
            return url;
        }
    }
    public static void main(String[] args) {
        System.out.println(toHttps("http://xxxhttp://xxx"));
    }
}
