package week09.access.a;

public class Computer {

    public static int year = 1998;

    public String os;
    protected int memory;
    String brand; // this has default access modifier - default is when no other access modifier is given
    private boolean hasWifi;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }

    // the same class
    public static void main(String[] args) {
        System.out.println(Computer.year);
        Computer obj = new Computer();
        obj.os = "Computer";
        obj.memory = 1000;
        obj.brand = "HP";
        obj.hasWifi = false;
        System.out.println(obj);
    }
}
