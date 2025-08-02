package codes;

import java.util.Scanner;

public class Stringbuilder {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());

        System.out.print("Enter second string: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        System.out.println("First StringBuilder: " + sb1);
        System.out.println("Second StringBuilder: " + sb2);

        sb2.append(sb1); // Joining first string to second
        System.out.println("After Joining:");
        System.out.println("First StringBuilder: " + sb1);  // Unchanged
        System.out.println("Second StringBuilder: " + sb2); // Modified
    }
}