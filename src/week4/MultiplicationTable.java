package week4;

public class MultiplicationTable {

    public static void main(String[] args) {
        multiTableFor(6);
        System.out.println("-------");
        multiTableFor(4, 15);
    }

    public static void multiTableFor(int n){
        multiTableFor(n, 10);
    }

    public static void multiTableFor(int n, int end){
        for (int i = 1; i <= end; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

//    public static void multiTableFor(int n){
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }
//    }
//
//    public static void multiTableFor(int n, int end){
//        for (int i = 1; i <= end; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }
//    }

}

/*
Multiplication Table [methods, loops, operators]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
			...

 */

/*
Multiplication Table II [methods, overloading, loops, operators]

	overload the previous multiplication table method to accept the number for the table and also the ending point for the multiplication(the default was before was 10)

		ex: inputs: 3, 20
			result would print the multiplication table of 3 up until 20
				3 x 1 = 3
				...
				3 x 20 = 60
 */
