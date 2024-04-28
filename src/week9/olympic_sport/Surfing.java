package week9.olympic_sport;

public class Surfing extends OlympicSport{

    public Surfing(int participants) {
        super(participants);
    }

    @Override
    public void compete() {
        super.compete();
        System.out.println("Surfing on the waves");
    }

    public static void test(){
        System.out.println("Testing from Surfing class");
    }

}
