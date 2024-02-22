// Read string value and convert it uppercase or vice versa.

import java.util.Scanner;

class readstring {
    public static void main(String[] args) {
        String str;

        System.out.println("Enter the sentence: ");

        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();

        System.out.println("Entered sentence is: "
                + str);

        boolean isCorrectChoice = false;
        do {
            System.out.println("Choose conversion:");
            System.out.println("1. Uppercase");
            System.out.println("2. Lowercase");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    str = str.toUpperCase();
                    isCorrectChoice = true;
                    break;
                case 2:
                    str = str.toLowerCase();
                    isCorrectChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again...");
                    break;
            }
        } while (!isCorrectChoice);
        sc.close();
        // Display the converted sentence
        System.out.println("Converted sentence is: " + str);
    }
}