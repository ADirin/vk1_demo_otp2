import org.example.localization.OutputGenration;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Locale locale = new Locale("fa", "IR");

      /*  ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", locale);
        String wish1= resourceBundle.getString("wish");
        String greetings1= resourceBundle.getString("greeting");
        System.out.println(greetings1+", "+ wish1);
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getCountry());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Select the language to display the message");
        System.out.println("1. English");
        System.out.println("2. Persian");
        System.out.println("3. Finland");
        int choice = input.nextInt();
        OutputGenration opt = new OutputGenration();

        switch (choice) {
            case 1:
                opt.printTheLanguage("en", "US");
                break;

            case 2:
                opt.printTheLanguage("fa","IR");
                break;
            case 3:
                opt.printTheLanguage("fi", "FI");
                break;
                default:
                    opt.printTheLanguage("en", "US");

        }


    }
}
