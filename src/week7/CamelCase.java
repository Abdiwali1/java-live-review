package week7;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
        System.out.println(camelCase("today is SUNDAY we are practicing"));
    }

    public static String camelCase(String str){ //  JAVA will ruLE tHe wORLd
        str = str.toLowerCase().trim();
        StringBuilder result = new StringBuilder();
        boolean makeUpper = false;

        /*

         java will run the world

         makeUpper = false

         result = javaWillR

         */

        for(int i = 0; i < str.length(); i++){
            //char eachChar = str.charAt(i);
            String eachChar = str.substring(i , i + 1);//(0, 1) (1, 2)

            if(eachChar.equals(" ")){
                makeUpper = true;
                continue; // this makes sure the space is not added to the result
            }

            if(makeUpper){
                eachChar = eachChar.toUpperCase();
                makeUpper = false;
            }

            result.append(eachChar); // if you used String instead of SB then you can just concatenate = result += eachChar
        }
        return result.toString();
    }

}

/*
CamelCase [loop, String, method]

    create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is uppercase and the rest of the word is in lowercase

    Exception: The first word starts with a lowercase

    Ex:
        Input:
            JAVA will ruLE tHe wORLd
        Output:
            javaWillRuleTheWorld
 */
