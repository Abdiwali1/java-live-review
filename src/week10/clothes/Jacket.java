package week10.clothes;

public final class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wearing jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("putting on hood");
    }
}
