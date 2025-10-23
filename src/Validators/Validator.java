package Validators;

import java.util.Scanner;

public class Validator {
    /**
     * Validates the user input for a menu option.
     *
     * @param sc the Scanner object to read the user input
     * @param maxOptions the maximum number of options in the menu
     * @return the validated option number
     */
    public static int optionValidator(Scanner sc, int maxOptions) {
        int option;

        System.out.print("Select the desired option: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.print("Invalid option. The selected option must be a number: ");
                sc.next();
            }
            option = sc.nextInt();
            if (option < 0 || option > maxOptions) {
                System.out.print("Invalid option. Please enter a number between 0 and " + maxOptions + ": ");
            }
        } while (option < 0 || option > maxOptions);
        sc.nextLine();

        return option;
    }
}
