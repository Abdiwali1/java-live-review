package week3;

public class OperatorPractice {
    public static void main(String[] args) {

        int num = 490;
        System.out.println(num % 10); // reads the last digit
        System.out.println(num % 100);
        System.out.println(num % 1000);

        System.out.println(4 % 10); // if you ever have small number % bigger number the result is always the smaller number

        System.out.println(1/2);
        System.out.println(1/2.0);

        int a = 10;

        boolean bool =  a < 20 && a > 5;
        boolean bool2 =  a < 5 && a > 0;

        System.out.println(true || 5 / 0 == 0); //  the second expression would cause a program, but it doesn't execute because the result of the boolean is determined by the true (first expression)

        int z = 5; // 5 -> 6 -> 5 -> 6
        int y = z++ * 2 - --z / 2 + ++z;
        //      5   * 2 - 5 / 2 + 6
        //         10 - 5 / 2 + 6
        //          10 - 2 + 6
        //             14

        System.out.println(z + " " + y);

        int m = 5; // 5 -> 6 -> 5 -> 6
        int n = ++m * 2 - m-- / 2 + m++;
        //        6 * 2 - 6 / 2 + 5
        //          12  - 6 / 2 + 5
        //          12  - 3 + 5
        //          14
        System.out.println(m + " " + n);
    }
}
