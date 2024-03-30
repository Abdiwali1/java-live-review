package week5;

public class Recipe {

    public String name;
    public String ingredients;
    public int servingSize;
    public double cost;

    public double costPerPerson(){
        return cost / servingSize;
    }

    public String toString(){
        return "Recipe for " + name + " will require these ingredients:\n\t" + ingredients + "\nThis dish will serve " + servingSize + " people and cost a total of $" + cost;
    }

}

/*
Recipe [object type]

    Create a class called Recipe
    declare these instance variables:
        name, ingredients, serving size, cost

    create a method called costPerPerson that will return a double. Calculate the amount each person would need to pay to make this recipe - use the serving size and cost values

    create a toString() that shows the information in the following format:
        Recipe for $name will require these ingredients:
                $all_ingredients
        This dish will serve $serving_size and cost a total of $ $cost to make

    create a different class and create some Recipe objects

 */