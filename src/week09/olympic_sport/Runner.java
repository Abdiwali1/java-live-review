package week09.olympic_sport;

public class Runner {
    public static void main(String[] args) {
        Surfing surfingEvent = new Surfing(40);
        System.out.println(surfingEvent);
        surfingEvent.compete();

        OlympicSport.test();
        Surfing.test();

    }
}
