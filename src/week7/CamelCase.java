package week7;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
        System.out.println(camelCase("today is SUNDAY we are practicing"));
        System.out.println(camelCase2("JAVA will ruLE tHe wORLd"));
        System.out.println(camelCase3("JAVA will ruLE tHe wORLd"));
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

    public static String camelCase2(String str){ //  JAVA will ruLE tHe wORLd
        str = str.toLowerCase().trim();
        String[] strArr = str.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(strArr[0]);
        for(int i = 1; i < strArr.length; i++){
            result.append(strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1));
        }
        return result.toString();
    }

    public static String camelCase3(String str){
        str = str.toLowerCase().trim();
        StringBuilder result = new StringBuilder();
        for(int i = str.length() - 1; i > 0; i--){
            String eachChar = str.substring(i, i+1);
            if(str.charAt(i - 1) == ' '){
                eachChar = eachChar.toUpperCase();
                i--;
            }
            result.append(eachChar);
        }
        result.append(str.charAt(0)); // the first char is not checked in the loop
        result.reverse();
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
