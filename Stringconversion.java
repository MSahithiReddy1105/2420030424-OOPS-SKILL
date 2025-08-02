package codes;

import java.util.Scanner;

public class Stringconversion {
    public static void main(String[] args) {
        char[] letters = {'J', 'a', 'v', 'a'};
        String str1 = "Programming";

        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String inputStr = sc.nextLine();

			System.out.println("Character Array: " + new String(letters));
			System.out.println("String Object: " + str1);
			System.out.println("User Input: " + inputStr);
		}
        // Converting character array to String
        String newStr = new String(letters);
        System.out.println("Converted String from Char Array: " + newStr);
    }
}
