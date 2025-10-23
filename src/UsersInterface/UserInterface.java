package UsersInterface;

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
}
