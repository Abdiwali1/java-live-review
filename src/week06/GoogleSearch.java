package week06;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        // automation code that gives you the String back:
        String result = "About 3,940,000,000 results (1.39 seconds)";
        String[] parts = result.split(" ");
        System.out.println(Arrays.toString(parts));
        System.out.println(parts[1]);
        long resultNum = Long.parseLong(parts[1].replace(",", ""));
        System.out.println(resultNum);

        if(resultNum < 100_000_000){
            System.out.println("Good Search");
        } else {
            System.out.println("Narrow your search, too many results");
        }

        System.out.println(parts[3].substring(1));
        double time = Double.parseDouble(parts[3].substring(1));

        if(time <= 0.85){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }


    }
}
/*
GoogleSearch [Wrapper class, String, testing/automation idea]

    Create a program that will define a String that is given in a fixed format based on how google search results are displayed.

    format: About 3,940,000,000 results (0.39 seconds)

    Scenario: check if your search results are under 100 Million
        if the results are under print: Good Search
        if the results are over print: Narrow your search, too many results

    AC: User should be able to search in google and get results back in under 0.85 seconds or less
    Test Case:
        Given user opens the browser and navigates to google.com
        Then searches for {data}
        Verify if the time is less than or equal to 0.85 seconds

            > check the number of seconds it took for the results to see if the functionality is working properly
 */
