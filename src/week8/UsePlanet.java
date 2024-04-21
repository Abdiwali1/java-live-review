package week8;

public class UsePlanet {
    public static void main(String[] args) {
        System.out.println(Planet.DISTANCE_FROM_EARTH_TO_SUN);

        Planet mars = new Planet("Mars", 100, 10.5, 1, 1.3);
        System.out.println(mars);
        System.out.println(mars.getDistanceFromSun());
        mars.travel();

        mars.getName().charAt(0);
        System.out.println(mars.NA.name);

        // Q: how do I access people?
        //mars.people  -> Person[]
        /*
            Person{
                person1, person 2 }
         */

        mars.people = new Person[100];
        mars.people[0] = new Person();

    }
}
