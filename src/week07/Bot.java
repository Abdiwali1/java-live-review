package week07;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) { //come back 12: 25

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        StringBuilder log = new StringBuilder();
        log.append("LOG:").append("\n");
        int interactions = 0;

        System.out.println("Hello. I am a bot");
        do {
            System.out.println("what do you want to talk about?");
            String userInput = input.nextLine().trim().toLowerCase();
            String output;
            switch (userInput) {
                case "hello":
                    output = "world";
                    break;
                case "what is your age", "age":
                    output = "I was programmed in 2024";
                    break;
                case "who created you":
                    output = "I was created by Saim";
                    break;
                case "menu", "what can we talk about":
                    output = "hello, age, who created you, menu, off";
                    break;
                case "off":
                    output = "haha you cannot turn me off I am invincible";
                    break;
                case "shutdown":
                    output = "SHUTTING DOWN";
                    isRunning = false;
                    break;
                default:
                    output = "I don't understand";
            }
            System.out.println("> " + output);
            interactions++;
            log.append(userInput).append("\n>").append(output).append("\n");
        } while(isRunning);

        log.append("Total number of interaction: ").append(interactions);
        System.out.println(log);

    }
}
/*
Bot [while, Scanner, conditional]

	create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot

	user says | > bot responds

	hello | > world
	what is your age | > I was programmed in 2024
	who created you | > I was created by Saim (use your name)
	what can we talk about | > print a menu of the options the bot can respond to

	off | > haha you cannot turn me off I am invincible
	shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)

	bonus: keep track how many times you interacted with the bot
	bonus: keep a log of the conversation

 */
