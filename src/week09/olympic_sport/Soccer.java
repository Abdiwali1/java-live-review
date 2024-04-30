package week09.olympic_sport;

public class Soccer extends OlympicSport{
    private int time;

    public Soccer(int participants, int time) {
        super(participants);
        this.time = time;
    }

    public void run(){
        System.out.println("Running on the Soccer field");
    }
}
