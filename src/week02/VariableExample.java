package week02;

public class VariableExample {
    public static void main(String[] args) {

        int one = 40;
        long two = 50;

//        long three = 3_000_000_000;   this does not compile because 3 billion is too big for an int to hold. int is the default type for whole number
        long three = 3_000_000_000L;

//        float price = 12.99;  12.99 is double. double cannot be stored into a float automatically. double is bigger than float, so we tell the compiler this is not double it is a float

        float price = 12.99F;

        float price2 = 10; // 10 is int, int is smaller than float, so no problem
        System.out.println(price2);

    }
}
