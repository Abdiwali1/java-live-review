package week8;

public class Planet {

    public static double DISTANCE_FROM_EARTH_TO_SUN = 1;

    private String name;
    private double mass;
    private double radius;
    private int numberOfMoons;
    private double distanceFromSun; // AU

    public Continent NA = new Continent("NA");
    public Person[] people;

    public Planet(String name) {
        this.name = name;
    }

    public Planet(String name, double mass, double radius) {
        this(name);
        this.mass = mass;
        this.radius = radius;
    }

    public Planet(String name, double mass, double radius, int numberOfMoons, double distanceFromSun) {
        this(name, mass, radius);
        this.numberOfMoons = numberOfMoons;
        this.distanceFromSun = distanceFromSun;
    }

    public void travel(){
        System.out.println(Math.random() * 100 * distanceFromSun);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", numberOfMoons=" + numberOfMoons +
                ", distanceFromSun=" + distanceFromSun +
                '}';
    }
}

class Continent{ // Continent na = new Continent();
    String name;

    public Continent(String name) {
        this.name = name;
    }
}

class Person{

}


/*
Planet [class, object, constructor, encapsulation]

    create a class called Planet
        define these instance variables
            name, mass, radius, number of moons, distance from sun (in AU - 1 AU is distance between sun and earth)

       constructors
            - create a constructor that creates a Planet object with the name
            - create a constructor that creates a Planet object with the name, mass, radius
            - create a constructor that creates a Planet object with the name, mass, radius, number of moons, distance from sun

       methods:
            - travel(): calculate how many year it will take to travel to the planet
            - toString()
                return all the Planet information

        bonus layer to discuss: classes as instance: continent, country, etc
 */