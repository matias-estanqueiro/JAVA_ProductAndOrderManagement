package UsersInterface;

import java.util.Scanner;

import static Products.ProductService.*;
import static Orders.OrderService.*;
import static Validators.Validator.*;

public class UserInterface {
    /**
     * Displays a menu with the given title and options.
     *
     * @param title the title of the menu
     * @param options the options to be displayed in the menu
     */
    public static void showMenu(String title, String[] options) {
        String separator = "====================================";
        int optionNumber = 0;

        System.out.println(separator);
        System.out.println(title);
        System.out.println(separator);

        for (String option : options) {
            optionNumber++;
            System.out.println(optionNumber + ") " + option);
        }
        if(title.contains("AND")) {
            System.out.println("0) EXIT");
        } else {
            System.out.println("0) BACK");
        }
        System.out.println(separator);
    }

    /**
     * Displays a product menu with the given title and options, and
     * allows the user to select an option from the menu.
     *
     * @param sc the Scanner object to read the user input
     * @param title the title of the product menu
     * @param options the options to be displayed in the product menu
     * @param maxOptions the maximum number of options in the product menu
     */
    public static void showProductMenu(Scanner sc, String title, String[] options, int maxOptions) {
        boolean inProductMenu = true;
        Scanner scProduct = new Scanner(System.in);

        showMenu(title, options);
        int optionSelected = optionValidator(sc, maxOptions);

        while(inProductMenu) {
            switch(optionSelected) {
                case 0:
                    inProductMenu = false;
                    System.out.println("Returning to Main Menu...");
                    break;
                case 1:
                    String name;
                    double price;
                    int stock;

                    System.out.println("Creating a new product...");
                    do {
                        System.out.print("Enter the product name: ");
                        name = scProduct.nextLine().trim().toUpperCase();
                        if (!isValidLettersNumbersDash(name)) {
                            System.out.println("Error: The name must contain only letters, numbers, spaces, and hyphens (-) and cannot be empty. Please try again.");
                        }

                    } while (!isValidLettersNumbersDash(name));
                    System.out.print("Enter the product price: ");
                   price = scProduct.nextDouble();
                    System.out.print("Enter the product stock: ");
                    stock = scProduct.nextInt();
                    createProduct();
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    searchAndUpdateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void showOrderMenu(Scanner sc, String title, String[] options, int maxOptions) {
        boolean inOrderMenu = true;

        showMenu(title, options);
        int optionSelected = optionValidator(sc, maxOptions);

        while(inOrderMenu) {
            switch(optionSelected) {
                case 0:
                    inOrderMenu = false;
                    System.out.println("Returning to Main Menu...");
                    break;
                case 1:
                    createOrder();
                    break;
                case 2:
                    listOrders();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
