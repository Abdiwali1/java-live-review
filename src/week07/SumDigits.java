package week07;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {

    public static void main(String[] args) {
        ArrayList<String> digits = new ArrayList<>(Arrays.asList("123", "52", "513"));
        System.out.println(sumDigits(digits));
    }

    public static ArrayList<Integer> sumDigits(ArrayList<String> digits){ //"123, "52", "513"

        ArrayList<Integer> sums = new ArrayList<>();

        for(String eachNumber : digits){ //123
            int currentSum = 0;
            String[] eachDigit = eachNumber.split(""); //[1, 2, 3]
            System.out.println("DEBUG: " + eachNumber + " " + Arrays.toString(eachDigit));
            for(String each : eachDigit){
              currentSum += Integer.parseInt(each);
            }
            sums.add(currentSum);
        }
        return sums;
    }

}

/*
SumDigits [Wrapper class, ArrayList, loop]

    Create a method that will accept an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Return that ArrayList with the sums

        Ex:
            Input:
            ["123, "52", "513"]
            Output:
            [6, 7, 9]
 */
