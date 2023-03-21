public class Language {
    String languages;
    Language(String a) {
        languages = a;
        System.out.println(languages + " is Language");
    }
    public static void main(String[] args) {
        Language l1 = new Language("Sinhala");
        Language l2 = new Language("English");
        Language l3 = new Language("Tamil");
    }
}