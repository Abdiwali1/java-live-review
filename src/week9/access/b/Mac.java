package week9.access.b;

import week9.access.a.Computer;

public class Mac extends Computer {
    // from a subclass. different package
    public static void main(String[] args) {
        System.out.println(Mac.year);
        Mac obj = new Mac();
        obj.os = "Computer";
        obj.memory = 1000;
//        obj.brand = "HP";
//        obj.hasWifi = false;
        System.out.println(obj);
    }
}
