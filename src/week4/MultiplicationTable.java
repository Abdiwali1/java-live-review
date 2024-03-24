package week4;

public class MultiplicationTable {

    public static void main(String[] args) {
        multiTableFor(6);
    }

    public static void multiTableFor(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

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
