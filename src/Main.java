import static UsersInterface.UserInterface.showMenu;
import static Validators.Validator.optionValidator;

import java.util.Scanner;


public class Main {
    public static final String MAIN_MENU_TITLE = "PRODUCT AND ORDER MANAGEMENT SYSTEM";
    public static final String[] MAIN_MENU_OPTIONS = { "PRODUCT MANAGEMENT", "ORDER MANAGEMENT" };

    public static final String PRODUCT_MENU_TITLE = "PRODUCT MANAGEMENT SYSTEM";
    public static final String[] PRODUCT_MENU_OPTIONS = { "ADD PRODUCT", "LIST PRODUCTS", "SEARCH/UPDATE PRODUCT", "DELETE PRODUCT" };

    public static final String ORDER_MENU_TITLE = "ORDER MANAGEMENT SYSTEM";
    public static final String[] ORDER_MENU_OPTIONS = { "CREATE ORDER",  "LIST ORDERS" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionSelected;
        int mainOptionsLength = MAIN_MENU_OPTIONS.length;
        int productOptionsLength = PRODUCT_MENU_OPTIONS.length;
        int orderOptionsLength = ORDER_MENU_OPTIONS.length;

        showMenu(MAIN_MENU_TITLE, MAIN_MENU_OPTIONS);
        optionSelected = optionValidator(sc, mainOptionsLength);
        switch (optionSelected) {
            case 0:
                System.out.println("Goodbye! Thank you for using the product and order management system.");
                break;
            case 1:
                showMenu(PRODUCT_MENU_TITLE, PRODUCT_MENU_OPTIONS);
                optionSelected = optionValidator(sc, productOptionsLength);
                switch (optionSelected) {
                    case 0:
                        break;
                    case 1:
                        // Add Product Method()
                        break;
                    case 2:
                        // List Products Method()
                        break;
                    case 3:
                        // Search & Update Product Method
                        break;
                    case 4:
                        // Delete Product Method()
                        break;
                }
                break;
            case 2:
                showMenu(ORDER_MENU_TITLE, ORDER_MENU_OPTIONS);
                optionSelected = optionValidator(sc, orderOptionsLength);
                switch (optionSelected) {
                    case 0:
                        break;
                    case 1:
                        // Create Order Method()
                        break;
                    case 2:
                        // List Order sMethod()
                        break;
                }
                break;
        }

    }
}