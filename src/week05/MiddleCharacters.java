package week05;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next(); //input.next().toLowerCase().trim();
        word = word.toLowerCase();
        word = word.trim();

        System.out.println(word);
        // apple
        // 01234
        // 5 / 2 -> 2

        // substring(0,1) -> first character as String
        // charAt(0) -> first character as a char

        int length = word.length();
        int middleIndex = length / 2;

        // java   monday
        // 0123
        //  4 / 2 - > 2

        String middle;
        String beginning;
        String end;

        if(length % 2 == 0){
            int firstMiddleIndex = middleIndex - 1;

            beginning = word.substring(0, firstMiddleIndex);
            middle = word.substring(firstMiddleIndex, middleIndex + 1).toUpperCase();
            end = word.substring(middleIndex + 1);

        } else {
            middle = "" + word.charAt(middleIndex);
           // String middle1 = word.substring(middleIndex, middleIndex + 1); // (2, 3)
            middle = middle.toUpperCase();

            beginning = word.substring(0, middleIndex);
            end = word.substring(middleIndex + 1);
        }

        System.out.println(beginning + middle + end);
    }
}

/*
MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa
 */