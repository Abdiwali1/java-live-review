package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class UseFood {
    public static void main(String[] args) {

        Food food = null; // this is a reference that isn't assigned an object

        new Food("Pasta"); // this is an object, but without a reference

        Food pizza = new Food("Pizza", 2, 5.99);
        System.out.println(pizza);

        Food fries = new Food("fries");
        System.out.println(fries);
        fries.quantity = 3;
        fries.unitPrice = 1.99;
        System.out.println(fries);
        fries.calculatePrice();
        System.out.println(fries);

        //Food[] foods = new Food[size]
        Food[] foods = {
                pizza,
                fries,
                new Food("Oranges", 10, 2.55),
                new Food("Apples", 20, 5.99),
                new Food("Chicken", 3, 8.99),
                new Food("Avocado", 15, 15.99),
                new Food("Baklava", 30, 12.99),
        };

        ArrayList<Food> allFoods = new ArrayList<>(); // just to compare, we didn't do anything with this one

        System.out.println(Arrays.toString(foods));

        System.out.println("------------------------");

        // Q: how can I iterate through all the food objects ?

        for(Food each : foods){
            if(each.name.toLowerCase().startsWith("a")){
                System.out.println(each);
            }
        } // substring(0,1).equalsIgnoreCase("a")

        System.out.println("------------------------");
        for(Food each : foods){
            if(each.totalPrice > 80){
                System.out.println(each.name);
            }
        }

    }
}
/*
    Create a separate class to create and test the Food objects
        try making an array of Food objects
        find all the Food objects that start with 'a' and print the Food object
        find all the Food objects that have a total price over 20 and print the name of the food
 */