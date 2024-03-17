package week3;

public class PeriodicTableElements {
    public static void main(String[] args) {

        int atomicNumber = 75;
        String group;

        if(atomicNumber >= 1 && atomicNumber <= 118){

            boolean alkaliMetals = atomicNumber == 3 || atomicNumber == 11 || atomicNumber == 19 || atomicNumber == 37 || atomicNumber == 55 || atomicNumber == 87;

            boolean alkalineEarthMetals = atomicNumber == 4 || atomicNumber == 12 || atomicNumber == 20 ||atomicNumber == 38 ||atomicNumber == 56 || atomicNumber == 88;

            boolean transitionMetals = (atomicNumber >= 21 && atomicNumber <= 30)
                    || (atomicNumber >= 39 && atomicNumber <= 48)
                    || atomicNumber == 57
                    || (atomicNumber >= 72 && atomicNumber <= 80)
                    || (atomicNumber >= 104 && atomicNumber <= 112);

            boolean nobleGas = atomicNumber == 2 || atomicNumber == 10 || atomicNumber == 18 ||atomicNumber == 36 ||atomicNumber == 54 || atomicNumber == 86 || atomicNumber == 118;


            if (alkaliMetals){
                group = "Alkali Metals";
            } else if (alkalineEarthMetals){
                group = "Alkaline Earth Metals";
            } else if(transitionMetals){
                group = "Transition Metals";
            } else if(nobleGas) {
                group = "Nobel Gas";
            } else {
                group = "Sorry group for " + atomicNumber + " is not in the system yet";
            }

        } else {
            group = atomicNumber + " is invalid. Atomic numbers must be between 1 - 118";
        } // nested ends here

        System.out.println(group);
    }
}
/*

Periodic Table Elements [nested if, boolean]

    The periodic table defines the elements. Define a number that you want to check and then create a program that will consider that number to be the atomic number of an element. Based on the information below print which group the element belongs to

    check if the atomic number is valid. It should between: 1 - 118
    if the number is valid check for the group otherwise print: $number is invalid. Atomic numbers must be between 1 - 118

    data for atomic numbers and groups:
        groups  | atomic numbers

        alkali metals | 3, 11, 19, 37, 55, 87
        alkaline earth metals | 4, 12, 20, 38, 56, 88
        transition metals | 21 - 30, 39 - 48, 57, 72 - 80, 104 - 112
        noble gas | 2, 10, 18, 36, 54, 86, 118

    if any other number is given print: Sorry group for $number is not in the system yet
 */
