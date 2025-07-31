package Codes;

import java.util.Scanner;
public class narrow_type_convert {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a double value: ");
			double doubleVal = scanner.nextDouble();

			int intVal = (int) doubleVal;  // Explicit cast

			System.out.println("Original double value: " + doubleVal);
			System.out.println("Converted int value: " + intVal);
		}
    }
}