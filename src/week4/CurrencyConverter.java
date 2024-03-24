package week4;

public class CurrencyConverter {

    public static void main(String[] args) {
        double yenAmount = convertTo("yen", 50);
        System.out.println(yenAmount);
        System.out.println(yenAmount + 100);
        System.out.println("------");

        System.out.println(convertTo("won", 50));

    }

    public static double convertTo(String currencyType, double amount) {
        return switch (currencyType) {
            case "euro" -> amount * 0.92;
            case "yen" -> amount * 149.13;
            case "lira" -> amount * 32.34;
            case "won" -> amount * 1_336.45;
            case "rupee" -> amount * 278.70;
            default -> amount;
        };
    }

    public static double convertTo2(String currencyType, double amount) {
        double result = amount;
        switch (currencyType) {
            case "euro":
                result = amount * 0.92;
                break;
            case "yen":
                result = amount * 149.13;
                break;
            case "lira":
                result = amount * 32.34;
                break;
            case "won":
                result = amount * 1_336.45;
                break;
            case "rupee":
                result = amount * 278.70;
                break;
        }
        return result;
    }

    public static double convertTo3(String currencyType, double amount) {

        switch (currencyType) {
            case "euro":
                return amount * 0.92;
            case "yen":
                return amount * 149.13;
            case "lira":
                return amount * 32.34;
            case "won":
                return amount * 1_336.45;
            case "rupee":
                return amount * 278.70;
            default:
                return amount;
        }

    }

}
/*
Currency Converter [methods, conditional, operators]

	create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number

	Use the following sample rates for currency conversions
		1 dollar = 0.92 euro
		1 dollar = 149.13 yen
		1 dollar = 32.34 lira
		1 dollar = 1,336.45 won
		1 dollar = 278.70 rupee

	Note: Don't worry about decimal formats, focus on the code to create these conversions

	Follow up: think about how this method could be improved

		Ex:
			Input: euro, 100
			Output: 92

		Ex:
			Input: yen, 50
			Output: 7456.5
 */