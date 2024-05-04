package week10;

public class Test {
    public static void main(String[] args) {
       // throw new OutOfTimeException();
        try {
            testing();
        } catch (InvalidData e) {
            throw new RuntimeException(e);
        }
    }

    public static void testing() throws InvalidData{
        throw new InvalidData();
    }


}
