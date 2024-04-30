package week05;

public class SmsParts {
    public static void main(String[] args) {
        String str = "Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}";

        int senderStart = str.indexOf('<') + 1;
        int senderEnd = str.indexOf('>');
        int numberStart = str.indexOf('[') + 1;
        int numberEnd = str.indexOf(']');
        int messageStart = str.indexOf('{') + 1;
        int messageEnd = str.indexOf('}');

        String sender = str.substring(senderStart, senderEnd);
        String number = str.substring(numberStart, numberEnd);
        String message = str.substring(messageStart, messageEnd);

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);


    }
}
/*
SmsParts [substring, indexOf]

	Create a program that will has a message String in this exact format:

		Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

	The content of name, number and message can vary, so based on the format extract those parts and output them.

	Ex:
	Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

	Output:
		Sender: Omer Karahan
		Number: 202-123-3456
		Message: I love programming and problem solving
 */