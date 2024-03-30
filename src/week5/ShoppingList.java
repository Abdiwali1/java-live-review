package week5;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
//        input.nextLine();
//        System.out.println(input.nextLine());

        String shoppingList = "============= Shopping List =============\n";
        String yesOrNo;

        do {
            System.out.println("Enter the next item:");
            String item = input.nextLine();

            shoppingList += "*\t" + item + "\n"; // shoppingList += input.nextLine();

            do {// this loop will run when yesOrNo value is NOT yes or no
                System.out.println("Do you want to add more items? yes or no");
                yesOrNo = input.nextLine();
            }while (!(yesOrNo.equals("yes") || yesOrNo.equals("no")));

        } while (yesOrNo.equals("yes"));

        System.out.println(shoppingList);

    }
}

/*
Shopping List [do while, String, Scanner]

	create a program that create a shopping list for the user. The program will ask the user to enter the items one by one.

	the flow:
		ask the user for the item
		add item to the shopping list
		ask user if they want to add more items

	when the user is done creating the list print it

 */