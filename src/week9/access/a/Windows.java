package week9.access.a;

public class Windows extends Computer{
    // from a subclass. same package
    public static void main(String[] args) {
        System.out.println(Computer.year);
        Windows obj = new Windows();
        obj.os = "Computer";
        obj.memory = 1000;
        obj.brand = "HP";
//        obj.hasWifi = false;
        System.out.println(obj);
    }
}
