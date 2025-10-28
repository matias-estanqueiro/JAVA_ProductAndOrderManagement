import Orders.Order;
import Products.Product;

import static UsersInterface.UserInterface.*;
import static Validators.Validator.optionValidator;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static final String MAIN_MENU_TITLE = "PRODUCT AND ORDER MANAGEMENT SYSTEM";
    public static final String[] MAIN_MENU_OPTIONS = { "PRODUCT MANAGEMENT", "ORDER MANAGEMENT" };

    public static final String PRODUCT_MENU_TITLE = "PRODUCT MANAGEMENT SYSTEM";
    public static final String[] PRODUCT_MENU_OPTIONS = { "ADD PRODUCT", "LIST PRODUCTS", "SEARCH/UPDATE PRODUCT", "DELETE PRODUCT" };

    public static final String ORDER_MENU_TITLE = "ORDER MANAGEMENT SYSTEM";
    public static final String[] ORDER_MENU_OPTIONS = { "CREATE ORDER",  "LIST ORDERS" };

    public static final ArrayList<Product> products = new ArrayList<>();
    public static final ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionSelected;
        int mainOptionsLength = MAIN_MENU_OPTIONS.length;
        int productOptionsLength = PRODUCT_MENU_OPTIONS.length;
        int orderOptionsLength = ORDER_MENU_OPTIONS.length;

        boolean continueProgram = true;

        while(continueProgram) {
            showMenu(MAIN_MENU_TITLE, MAIN_MENU_OPTIONS);
            optionSelected = optionValidator(sc, mainOptionsLength);
            switch (optionSelected) {
                case 0:
                    continueProgram = false;
                    System.out.println("Goodbye! Thank you for using the product and order management system.");
                    break;
                case 1:
                    showProductMenu(sc, PRODUCT_MENU_TITLE, PRODUCT_MENU_OPTIONS, productOptionsLength);
                    break;
                case 2:
                    showOrderMenu(sc, ORDER_MENU_TITLE, ORDER_MENU_OPTIONS, orderOptionsLength);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}