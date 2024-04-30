package week06;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        //- Find and print all the first and last characters

        for(String country : countries) {  // country every element
            System.out.println(country.charAt(0) + " " + country.charAt(country.length() - 1));
        }

        //- Find the largest and smaller countries based on the length of their names
        String[] result = {countries[0], countries[0]}; // 2 elements: first element will be the smallest, second element will be the largest

        //{Brazil, Brazil} -> this is a better default than new String[2] this gives null object

        for(int i = 0; i < countries.length; i++) { //for(String country : countries) {
            if(countries[i].length() > result[1].length()){ // max logic -> largest
                result[1] = countries[i];
            }

            if(countries[i].length() < result[0].length()) {// smallest
                result[0] = countries[i];
            }
            System.out.println();
        }

        // as for loop
//        for(String country : countries) {
//            if(country.length() > result[1].length()){ // max logic -> largest
//                result[1] = country;
//            }
//
//            if(country.length() < result[1].length()){ // smallest
//                result[0] = country;
//            }
//        }

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);


    }
}

/*
Countries [array, String, loops]

    Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'
 */