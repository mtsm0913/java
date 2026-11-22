class Sample {
    public static String toHttps(String url) {
        if (url.startsWith("http://")) {
            return url.replace("http://", "https://");
        } else {
            return url;
        }
    }
    public static void main(String[] args) {
        System.out.println(toHttps("http://github.com/mtsm0913"));
    }
}
