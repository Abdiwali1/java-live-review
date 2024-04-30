package week07;

public class UberReceipt {
    public static void main(String[] args) {

        String receipt = "Uber Receipts 2 days ago\n" +
                "Thanks for using Uber. Remember to rate your driver\n" +
                "The 25 mile trip took about 20 minutes\n" +
                "Your total was $25.19";


        int startIndexMiles = receipt.indexOf("The") + 4; // the plus 4 be the starting of the number
        int endIndexMiles = receipt.indexOf("mile") - 1; // - 1 not include the space after the number

        int numberOfMiles = Integer.parseInt(receipt.substring(startIndexMiles, endIndexMiles));

        int numberOfMinutes = Integer.parseInt(
                receipt.substring(
                        receipt.indexOf("about") + 6,
                        receipt.indexOf("minutes") // this is where the - 1 would but If you dont trim
                ).trim() // this time we used trim to remove the space after the number instead of the -1 like we did line 13
        );

        //int numberOfMinutes = Integer.parseInt(receipt.substring( receipt.indexOf("about") + 6, receipt.indexOf("minutes") - 1));
        //int numberOfMinutes = Integer.parseInt(receipt.substring( receipt.indexOf("about") + 6, receipt.indexOf("minutes")).trim());

        /* receipt.toLowerCase().trim().isEmpty(); // this is method chaining

        receipt
                .toLowerCase()
                .trim()
                .isEmpty();
        */

        double cost = Double.parseDouble(receipt.substring(receipt.indexOf('$') + 1));

        System.out.println("Miles: " + numberOfMiles);
        System.out.println("Minutes: " + numberOfMinutes);
        System.out.println("Cost: " + cost);

    }
}

/*
UberReceipt [String, indexes]

    create a program that will extract details from a receipt emailed to you from your uber ride
    extract the number of miles, number of minutes, and total cost

    here is an example receipt:

        String receipt = "Uber Receipts 2 days ago\n" +
                "Thanks for using Uber. Remember to rate your driver\n" +
                "The 5 mile trip took about 20 minutes\n" +
                "Your total was $25.19";
 */
