package week9;

import java.util.ArrayList;

public final class Garden extends Land {

    // Garden is a Land
    // Garden has a ArrayList

    private String location;
    private ArrayList<Plant> plants;

    public Garden(double size, String location, String type, double growthRate) {
        super(size);
        this.location = location;
        this.plants = new ArrayList<>();
        this.plants.add(new Plant(type, growthRate));
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Plant> getPlants() {
        return plants;
    }

}

class Land{
    double size;

    public Land(double size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Garden g = new Garden(4.3, "backyard", "tomato", 1.3);
        System.out.println();
    }
}

class Plant{
    String type;
    double growthRate;

    public Plant(String type, double growthRate) {
        this.type = type;
        this.growthRate = growthRate;
    }
}