package week05;

public class Kitchen {
    public static void main(String[] args) {

        Recipe pizza = new Recipe();
        // Recipe pizza -> reference (variable name) -> stack
        //  new Recipe(); -> the actual object -> stored in the heap

        Recipe pasta = null;
        // Q: did I make a new reference? yes
        // Q: did I make a new Recipe object? no
        String s = null;

        new Recipe(); // Q: what is this? I created a new Recipe object, but with no reference

        pizza = null; // Q: what happened here? reassigned the reference to null, which means the object (created on line 6) is no unreferenced, so it eligible for gc

        Recipe baklava = new Recipe();
        baklava.name = "Baklava";
        baklava.ingredients = "flour, pistachios, sugar, walnut, phyllo";
        baklava.servingSize = 10;
        baklava.cost = 25;
        System.out.println(baklava);

        System.out.println(baklava.costPerPerson());

    }
}
