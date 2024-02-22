//add to binery string

import java.util.Scanner;

public class AddBinary {
    static String add_Binary(String x, String y) {

        int num1 = Integer.parseInt(x, 2);
        // converting binary string into integer(decimal
        // number)

        int num2 = Integer.parseInt(y, 2);
        // converting binary string into integer(decimal
        // number)

        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum

        String result = Integer.toBinaryString(sum);
        // Converting that resultant decimal into binary
        // string

        return result;
    }

    static boolean isValidBinary(String binary) {
        // Use regular expression to match binary strings consisting of only 0s and 1s
        return binary.matches("[01]+");
    }

    static String getBinary(Scanner scn ,String txt) {
        String str;
        boolean isValid = false;

        do {
            System.out.println("Enter " + txt + " binary numbers:");
            str = scn.nextLine();
            isValid = isValidBinary(str);
            if (!isValid)
                System.out.println("Invalid input. Try again!");

            } while (!isValid);
            
            System.out.println("Entered Binary strings is : " + str);

        return str;
    }

    public static void main(String[] args) {
        String str1, str2;

        Scanner scn = new Scanner(System.in);
        str1 = getBinary(scn,"First");
        str2 = getBinary(scn,"Second");
        String str3 = add_Binary(str1, str2);
        System.out.println("Sum of Binary strings is : " + str3);
        scn.close();
    }
}
