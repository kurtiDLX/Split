import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        String stringSplit[] = {""};
        System.out.print("Enter a sentence: ");
        string = scanner.nextLine();
        System.out.println("\nyour sentence: " + string);
        System.out.println("\nchange? y/n");
        String change = scanner.nextLine();
        if (change.equals("y")) {
            stringSplit = string.split(" ");
            for (int i = 0; i < stringSplit.length; i++) {
                System.out.println(i + ": " + stringSplit[i]);
            }

            System.out.print("choice word: ");
            int choiceWord = scanner.nextInt();
            System.out.print("change: ");
            scanner.nextLine();
            String changeWord = scanner.nextLine();
            stringSplit[choiceWord] = changeWord;
            System.out.println("you changed the word in the sentence");
        } else {
            System.out.println("Okay :(");
        }
        String finalString = String.join(" ", stringSplit);
        System.out.println("\nYour final sentence: " + finalString);
    }
}