package week5;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(countHi(input.nextLine()));
        System.out.println(countHi("ahhhbchidefhihellohiiiiworld"));
        System.out.println(countHi2("ahhhbchidefhihellohiiiiworldhi"));

        System.out.println(countHi2("aahiahiaaahh"));

    }

    public static int countHi2(String str){ // iterate through each character and compare with the character next to it
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }
        }
        return count;
    }

    public static int countHi(String str){ // while loop to run as long as there is "hi" in the String
        int count = 0;
        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi", "");
        }
        return count;
    }

}
/*
Count Hi [method, loop, String]

	create a method that will accept a String and count how many times the word "hi" is found in the String. return the count

		ex:
			input: aahiahiaaahh
			output: 2
				"hi" was found 2 times

			input: ahhhbchidefhihellohiiiiworld
			output: 3
				"hi" was found 3 times

	extra: overload the method to search for any word, not just "hi"

 */