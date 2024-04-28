package week9.access.a;

public class RunnerA {
    // using the object that was subclass - same package
    public static void main(String[] args) {
        Windows obj = new Windows();
        System.out.println(Windows.year);
        obj.os = "Computer";
        obj.memory = 1000;
        obj.brand = "HP";
//        obj.hasWifi = false;
        System.out.println(obj);
    }
}
