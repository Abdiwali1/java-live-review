package week04;

public class PrimeInRange {
    public static void main(String[] args) {
        primeInRange(50);
    }

    public static void primeInRange(int n){ /// n = 40

        for(int i = 2; i <= n; i++){ // iterate through all the numbers from 2 to n

            boolean isPrime = true;

            for(int j = 2; j < i; j++){  // check the divisibility by 2, 3, 4, etc
                //System.out.println(i + " % " + j);
                if(i % j == 0){ // if the number is evenly divisible then its NOT prime
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i + " ");
            }

        }

    }

    // same code but seperated as two methods:

    public static boolean isPrime(int num){
        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
               return false;
            }
        }
        return true;
    }

    public static void primeInRange2(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

}
/*

[IQ] Prime in range [nested loop, methods, conditional]

	create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

	a number is a prime number when it is only divisible by 1 and itself

	ex:
		Input:
			50
		Output:
			2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */