package week10.language;

public class UseLanguage {
    public static void main(String[] args) {

        English english = new English();
        english.hello();
        System.out.println(english.bye());

        english.translate();
        //english.description();
        //English.description();

        Language.description();

        System.out.println(Language.DEFAULT_ENCODING);

    }
}
