package week06;

import java.util.Arrays;

public class LanguageCharacters {
    public static void main(String[] args) {
        // get character from english
        char[] englishChars = getCharacterFor("English");
        System.out.println(Arrays.toString(englishChars));

        // get character from Braille
        char[] brailleChars = getCharacterFor("Braille");
        System.out.println(Arrays.toString(brailleChars));

        //System.out.println((char)63844);

        char letter = '⠷';
        System.out.println((int) letter);

        // get character for a language we don't have
        System.out.println(Arrays.toString(getCharacterFor("polish")));

        // others ones
        System.out.println(Arrays.toString(getCharacterFor("greek")));
        System.out.println(Arrays.toString(getCharacterFor("arabic")));
        System.out.println(Arrays.toString(getCharacterFor("japanese")));

    }

    public static char[] getCharacterFor(String language){ //English: 33 - 126
        char start;
        char end;

        switch (language.toLowerCase()){
            case "english":
                start = 33;
                end = 126;
                break;
            case "greek":
                start = 884;
                end = 1011;
                break;
            case "arabic":
                start = 1548;
                end = 1790;
                break;
            case "chinese", "japanese", "korean":
                start = 63744;
                end = 64045;
                break;
            case "braille":
                start = 10240;
                end = 10495;
                break;
            default:
                return null; // returns null which is placeholder for an object
            // if the default I don't have any information about that language, but I must return something
        }

        char[] allCharacters = new char[end - start + 1]; // end - start is how many character total we have - size of the array + 1 to include the last character
        for(int i = 0; i < allCharacters.length; i++, start++){ // i is for the index of the array
            allCharacters[i] = start; // assigning each character to the array
        }
        return allCharacters;
    }

}
/*
LanguageCharacters [array, char, loop, method]

    Create a method that will accept a String for the language name. Based on the given language name return a char array of the characters that are used in that language. We will use ascii numbers

    Use the following ranges:

    English: 33 - 126

    Greek: 884 - 1011

    Arabic: 1548 - 1790

    Chinese, Japanese, Korean: 63744 - 64045
        (this group of characters are the: CJK Compatibility Ideographs)

    Braille: 10240 - 10495
 */