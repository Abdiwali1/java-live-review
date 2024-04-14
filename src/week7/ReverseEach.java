package week7;

public class ReverseEach {

    public static void main(String[] args) {
        System.out.println(reverseEach("hello world today is java"));
    }

    public static String reverseEach(String str){
        String sentence = "";
        String[] words = str.split(" ");
        for(String each : words){
            sentence += reverse(each) + " ";
        }
        return sentence.trim();
    }

    public static String reverse(String str){ // class.method
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}

/*
ReverseEach [array, loop, String]

    Create a method that will accept a String that is a sentence. Reverse each given word, but maintain the order of the words. Return the reversed version

    Ex:
        can you join the team  ->  nac uoy nioj eht meat
 */