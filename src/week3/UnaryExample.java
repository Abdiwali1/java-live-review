package week3;

public class UnaryExample {
    public static void main(String[] args) {

        int x = 5;
        int y = x++; // post increment - does the operation first, then it updates

        System.out.println(x + " " + y);

        int a = 10;
        int b = ++a; // pre increment - update first then does the operation

        System.out.println(a + " " + b);

        int num = 3;
        num++;
        num++;
        num++;
        num++;
        System.out.println(num);

    }
}
