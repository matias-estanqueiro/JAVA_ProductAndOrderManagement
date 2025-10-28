package Validators;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    private static final String LETTERS_NUMBERS_DASH_REGEX = "^[a-zA-Z0-9\\s-]+$";

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

    public static boolean isValidLettersNumbersDash(String input) {
        String sanitizedInput = input.trim();

        if (sanitizedInput.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(LETTERS_NUMBERS_DASH_REGEX);
        return pattern.matcher(sanitizedInput).matches();
    }
}
