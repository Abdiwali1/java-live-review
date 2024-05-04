package week10.clothes;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        //itself
        TShirt tShirt1 = new TShirt("cotton");
        tShirt1.wear();

        //super class
        Clothes tShirt2 = new TShirt("cotton");
        tShirt2.wear();

        Object tShirt3 = new TShirt("cotton");
       // tShirt3.wear();
        Clothes ref = ((Clothes)tShirt3);
        ((Clothes)tShirt3).wear();

        // jacket objects

        Jacket jacket1 = new Jacket("leather");
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket("leather");
        jacket2.wear();
        //jacket2.putOnHood();

        HasHood jacket3 = new Jacket("leather");
        //jacket3.wear();
        jacket3.putOnHood();

        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(tShirt1);
        clothes.add(tShirt2);
        //clothes.add(tShirt3);
        clothes.add(jacket1);
        clothes.add(jacket2);
       // clothes.add(jacket3);
        clothes.add(new TShirt("leather"));

        for(Clothes each  : clothes){
            each.wear();
        }

        System.out.println("-------");

        clothes.forEach(each -> each.wear());


    }
}

/*
	create a class Store
	create a main method and create TShirt and Jacket objects
	create an ArrayList of Clothes. Add the different objects
	iterate through the ArrayList and call the wear() method
 */