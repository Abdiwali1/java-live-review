package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WeatherReport {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));

        System.out.println("original " + temperatures);
        Collections.sort(temperatures);
        System.out.println("sorted " + temperatures);

        temperatures.remove(0);
        temperatures.remove(0);
        temperatures.remove(temperatures.size() - 1);
        temperatures.remove(temperatures.size() - 1);

        System.out.println("fixed data " + temperatures);

        double max = Collections.max(temperatures);
        double min = Collections.min(temperatures);
        double median = temperatures.get(temperatures.size() / 2);
        double average = 0;

        for(double each : temperatures){
            average += each;
        } // after this we have the sum

        average /= temperatures.size();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Median: " + median);
        System.out.println("Mean : " + average);

        System.out.println("prediction: " + (int)(average - 5) + " - " + (int)(average + 5));
        System.out.println("prediction: " + Math.floor(average - 5) + " - " +  Math.floor(average + 5));

    }
}
/*
WeatherReport [ArrayList, loop, operators]

    Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

        max temperature, min temperature, median (middle temperature), mean (average temperature)

        also, give a prediction temperature range for the next few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

        we can assume the amount of data will always be an odd number so there will be one median

    Ex:
        input:
            62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

            // excluded:  42.3, 43.0, 68.9, 77.3
            // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

        output:
            max: 62.1
            min: 44.8
            median: 53.4
            mean: 52.44
            predication: 47 - 57

 */
