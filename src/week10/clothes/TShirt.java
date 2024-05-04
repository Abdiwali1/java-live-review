package week10.clothes;

public final class TShirt extends Clothes{

    public TShirt(String cloth) {
        super(cloth);
    }

    @Override
    public void wear() {
        System.out.println("Wearing TShirt");
    }
}
