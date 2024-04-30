package week06;

import java.util.Arrays;

public class AverageEach {
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 25}
        };

        double totalSum = 0;
        int totalLength = 0;

        for(int[] eachInner : nums){ // {3, 4, 5, 6},
            double sum = 0;

            for(int eachNum : eachInner){
                sum += eachNum;
                totalLength++;
            }

            System.out.println("average of: " + Arrays.toString(eachInner) + " is " + (sum / eachInner.length));
            totalSum += sum;
        }

        System.out.println("Average of all: " + (totalSum / totalLength));


    }
}
/*
AverageEach [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

    Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            average of: [3, 4, 5, 6] is 4.5
            average of: [5, 2, 6] is 4.3
            average of: [10, 40, 25] is 25.0
            average of all is 10.6
 */
