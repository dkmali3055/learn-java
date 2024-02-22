import java.util.Scanner;

/**
 * Innerconversion
 */
class Innerconversion {

    
}

public class conversion {

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static int printMenu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to conversion program.");
        System.out.println("How do you want to use this program ?");
        
        int choice = -1;
        
        while (choice < 1 || choice > 3) {
            System.out.println("Select an option:");
            System.out.println("1. Convert binary to octal.");
            System.out.println("2. Convert octal to decimal.");
            System.out.println("3. Convert decimal to octal.");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
            
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        
        switch (choice) {
            case 1:
                System.out.println("You selected: Convert binary to octal.");
                // Call your binary to octal conversion method/function here
                break;
            case 2:
                System.out.println("You selected: Convert octal to decimal.");
                // Call your octal to decimal conversion method/function here
                break;
            case 3:
                System.out.println("You selected: Convert decimal to octal.");
                // Call your decimal to octal conversion method/function here
                break;
        }
        
        scanner.close();
        return choice;
    }

    public static void main(String[] args) {
        clearScreen();
        System.out.println("Welcome to the conversion program.");
        System.out.println(
                "How do you want to use this program ?( Navigate options using a or z, For upward a and z for downward.)");
        printMenu();
    }

}
