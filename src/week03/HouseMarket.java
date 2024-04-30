package week03;

public class HouseMarket {
    public static void main(String[] args) {

        String name = "Cook";
        int averagePrice = 0;
        double rating = 0;
        boolean isGated = false, allowsPets = false;
        String report;
        boolean validData = true;

        switch (name){
            case "Hills":
                averagePrice = 89_000;
                rating = 4.0;
                isGated = false;
                allowsPets = true;
                break;
            case "Oaks":
                averagePrice = 75_000;
                rating = 3.5;
                isGated = false;
                allowsPets = true;
                break;
            case "Highland":
                averagePrice = 150_000;
                rating = 4.5;
                isGated = true;
                allowsPets = false;
                break;
            case "Canyon":
                averagePrice = 201_000;
                rating = 4.8;
                isGated = true;
                allowsPets = true;
                break;
            default:
                validData = false;
        }

        if(validData) {
            report = "The houses in the " + name + " on average value at " + averagePrice + ". This neighborhood is " + (isGated ? "gated" : "not gated") + " and the rating of the school distracts nearby is " + rating + " out of 5. For the pet owners you " + (allowsPets ? " are in luck. bring your pets." : " sorry, pets not allows here.");
        } else {
            report = "Sorry no data for " + name;
        }

        System.out.println(report);

    }
}

/*
HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhood

	create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts nearby is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	sample data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes
 */
