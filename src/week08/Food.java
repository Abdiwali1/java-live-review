package week08;

public class Food {

    public String name;
    public int quantity;
    public double unitPrice;
    public double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
/*

Food [class, object, constructor, array]

    create a class called Food
        define these instance variables
            name, quantity, unit price, total price

       constructors
            - create a constructor that creates a Food object with the name
            - create a constructor that creates a Food object with the name and quantity
            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

       methods:
            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
            - toString()
                return all the Food information

    Create a separate class to create and test the Food objects
        try making an array of Food objects
        find all the Food objects that start with 'a' and print the Food object
        find all the Food objects that have a total price over 20 and print the name of the food
 */