package week03;

public class SwitchVsIf {
    public static void main(String[] args) {

        int temperature = 45;

        if(temperature == 80){
            System.out.println("its hot");
        } else if(temperature == 65){
            System.out.println("not too bad. go outside");
        } else if(temperature == 45){
            System.out.println("Wear a coat");
        } else {
            System.out.println("stay inside");
        }
        // if statement required 3 boolean to be checked
        // same but as a switch

        switch (temperature){
            case 80:
                System.out.println("its hot");
               break;
            case 65:
                System.out.println("not too bad. go outside");
                break;
            case 45:
                System.out.println("Wear a coat");
                break;
            default:
                System.out.println("stay inside");
        }

        // exact of above
        switch (temperature){
            case 80 ->  System.out.println("its hot");
            case 65 ->  System.out.println("not too bad. go outside");
            case 45 ->  System.out.println("Wear a coat");
            default ->  System.out.println("stay inside");
        };

        // returns a value
        String result = switch (temperature){
            case 80 -> "its hot";
            case 65 -> "not too bad. go outside";
            case 45 -> "Wear a coat";
            default -> "stay inside";
        };

        System.out.println(result);


    }
}
