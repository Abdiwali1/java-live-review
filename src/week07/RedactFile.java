package week07;

import java.util.ArrayList;
import java.util.Arrays;

public class RedactFile {

    public static void main(String[] args) {
        System.out.println("-".repeat(3));
        System.out.println("*".repeat(5));
        System.out.println("java".repeat(4));

        System.out.println();
        String text = "Agent Shadow, a seasoned operative with a reputation for discretion, embarked on a mission to dismantle an international syndicate threatening global security. Intelligence suggested that the syndicate, code name Silhouette was orchestrating a series of cyber-attacks to gain control of sensitive government databases. Posing as a wealthy entrepreneur, Agent Shadow infiltrated a high-profile gala where Silhouette's enigmatic leader, known only as Ghost, was rumored to make an appearance. Disguised in a sleek tuxedo, Agent Shadow discreetly mingled with the elite attendees, extracting valuable information about the syndicate's next move. As the night unfolded, Agent Shadow intercepted encrypted messages hinting at a secret meeting location. Employing her skills in cryptography, she deciphered the coordinates pointing to an abandoned warehouse on the outskirts of the city. The warehouse, it seemed, served as Silhouette's operational base. Under the cover of darkness, Agent Shadow infiltrated the warehouse, discovering advanced surveillance equipment and a command center for the cyber-attacks. In a hidden chamber, she stumbled upon a dossier containing the names of compromised agents within various intelligence agencies. With the gathered evidence, Agent Shadow transmitted a secure report to headquarters, exposing Silhouette's plans and outlining a strategy for a coordinated take down. The race against time had begun, as global security hung in the balance, and Agent Shadow prepared for the final confrontation with the elusive Ghost.";

        ArrayList<String> hide = new ArrayList<>(Arrays.asList("Shadow", "dismantle", "syndicate", "Silhouette", "Ghost", "warehouse", "darkness", "cyber-attacks"));

        System.out.println(redact(text, hide));

    }

    public static String redact(String text, ArrayList<String> hidden){
        String[] allWord = text.split(" ");
        StringBuilder redacted = new StringBuilder();

        for(String eachWord : allWord){

            String current = eachWord.replace(",", "").replace(".", "").replace("'s", "").trim();

            if(hidden.contains(current)){
                String dashes = ("-").repeat(current.length());
                redacted.append(dashes);
            } else {
                redacted.append(eachWord);
            }

            redacted.append(" ");

        }
        return redacted.toString();
    }

}

/*

RedactFile [ArrayList, array, loop, String]

    create a method that will have two parameters. The first parameter is a String of important information. The second parameter is an ArrayList of the words that need to be redacted or hidden. Go through each word of the String and hide the words that were given. Return the text in the redacted format.

    for example if text has a word "hello" and that is one of the words that should be hidden you can replace that word with "-----"

 	bonus: the redaction length should match the length of the original word

    Ex:
    	text = Hello world. we will learn java. first program is hello world
    	hide = "hello", "java"

    	output: ----- world. we will learn ----. first program is ----- world

    sample data:
        text = "Agent Shadow, a seasoned operative with a reputation for discretion, embarked on a mission to dismantle an international syndicate threatening global security. Intelligence suggested that the syndicate, code name Silhouette was orchestrating a series of cyber-attacks to gain control of sensitive government databases. Posing as a wealthy entrepreneur, Agent Shadow infiltrated a high-profile gala where Silhouette's enigmatic leader, known only as Ghost, was rumored to make an appearance. Disguised in a sleek tuxedo, Agent Shadow discreetly mingled with the elite attendees, extracting valuable information about the syndicate's next move. As the night unfolded, Agent Shadow intercepted encrypted messages hinting at a secret meeting location. Employing her skills in cryptography, she deciphered the coordinates pointing to an abandoned warehouse on the outskirts of the city. The warehouse, it seemed, served as Silhouette's operational base. Under the cover of darkness, Agent Shadow infiltrated the warehouse, discovering advanced surveillance equipment and a command center for the cyber-attacks. In a hidden chamber, she stumbled upon a dossier containing the names of compromised agents within various intelligence agencies. With the gathered evidence, Agent Shadow transmitted a secure report to headquarters, exposing Silhouette's plans and outlining a strategy for a coordinated take down. The race against time had begun, as global security hung in the balance, and Agent Shadow prepared for the final confrontation with the elusive Ghost."

        hide = "Shadow", "dismantle", "syndicate", "Silhouette", "Ghost", "warehouse", "darkness", "cyber-attacks"
 */
