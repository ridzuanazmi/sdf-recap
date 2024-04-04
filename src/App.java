import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        List<String> personDetailList = new ArrayList<String>(); // Create an ArrayList object
        Map<String, String> personDetailMap = new HashMap<>();

        System.out.print("What is your name? \n> "); // Prompt the user to enter their name
        String name = scanner.next(); // Read user input

        if (name.length() > 0 && !name.isBlank()) {
            System.out.printf("Hello %s. Pleased to meet you.\n", name);
            personDetailList.add(0, name); // Add the name to the list
            personDetailMap.put("name", name); // Add the name to the map
        } else {
            System.out.println("You have not told me your name\n");
            System.exit(0); // Exit the program if no name is provided
        }

        System.out.print("What is your hobby? \n> ");
        String hobby = scanner.next().trim().toLowerCase();
        personDetailList.add(1, hobby);
        personDetailMap.put("hobby", hobby);
        switch (hobby.trim()) {
            case "swim":
                System.out.println("The nearest swimming complex is at Choa Chu Kang Sports Complex.");
                break;
            case "jogging":
                System.out.println("The nearest track is at Choa Chu Kang Sports Complex.");
                break;
            case "code":
                System.out.println("Go for it and practice!!!");
                break;
            default:
                System.out.println("I am not sure where you can do that.");
                break;
        }

        String job = "";
        while (job.length() <= 0) {
            System.out.print("What is your job? \n> ");
            job = scanner.next();
        }
        personDetailList.add(2, job);
        personDetailMap.put("job", job);
        System.out.printf("%s you work as a %s. That is interesting!\n", name, job);

        String phrase = "";
        System.out.print("Enter a phrase: \n>");
        phrase = scanner.next().trim();
        personDetailList.add(3, phrase);
        personDetailMap.put("phrase", phrase);
        for (int count = 1; count <= phrase.length(); count++) {
            System.out.println(phrase.substring(0, count));
        }
        System.out.printf("The details you have provided are: %s\n", personDetailList.toString());
        System.out.println(personDetailMap.toString());

        List<String> toDo = new LinkedList<>();
        String input = "";
        while (!input.equalsIgnoreCase("exit")) {
            System.out.print("Enter a task to do or type 'exit' to quit: \n>");
            input = scanner.next();
            if (!input.equalsIgnoreCase("exit")) {
                toDo.add(input);
            }
        }
        for (int i = 0; i < toDo.size(); i++) {
            System.out.printf("task (%s): %s\n", i + 1, toDo.get(i));
        }
        for (String task : toDo) {
            System.out.println("task: " + task);
        }

        scanner.close(); // Close the scanner
    }
}
