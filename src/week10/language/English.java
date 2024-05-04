package week10.language;

public class English implements Language{
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public String bye() {
        return "Bye";
    }
}
