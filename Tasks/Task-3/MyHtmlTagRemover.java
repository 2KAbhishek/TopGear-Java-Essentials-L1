class MyHtmlTagRemover {
    public static String replace(String a) {
        return a.replaceAll("<.*?>", "");
    }
}
