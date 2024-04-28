package week9.olympic_sport;

public class OlympicSport {

    public static final int YEAR_OF_FIRST_OLYMPICS = 1896;

    private String name;
    private int participants;

//    public OlympicSport(){
//
//    }

    public OlympicSport(int participants) {
        this.name = getClass().getSimpleName();
        this.participants = participants;
    }

    public void compete(){
        System.out.println("Competing in olympics");
    }

    public static void test(){
        System.out.println("Testing from SUPER class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
/*

OlympicSport [Inheritance, overriding, super constructor, static]

	Create a class OlympicSport

		instance variables
			- name (String)
			- participants (int)

		static variable: year of first Olympics: 1896

		constructor:
			- initialize all fields

		methods:
			- compete()
		-> override compete in sub classes

		 - override toString()

	- Create a class Surfing

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Surfing the waves

	- Create a class Track

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Track for running, jumping, throwing

	- Create a class Soccer

		child class of OlympicSport

		constructor: set name and participants variables

		methods:
			compete(): Print Playing a soccer game
 */