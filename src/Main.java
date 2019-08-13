import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        startConversation();

    }

    private static void startConversation() {
        Destroyer su_15 = new Su_15();
        Destroyer f_14 = new F_14();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Enter name of destroyer (Su-15 or F-14):");
        String name;
        do {
            switch (name = scanner.nextLine()) {
                case "Su-15":
                    makeAction(su_15, scanner);
                    break;
                case "F-14":
                    makeAction(f_14, scanner);
                    break;
                case "exit":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Error: wrong name");
                    System.out.println("Enter name:");
                    break;
            }
        } while (!name.equals("exit"));

    }

    private static void makeAction(Destroyer destroyer, Scanner scanner) {
        String action;
        System.out.println("enter 'help' to view commands");
        do {
            action = scanner.nextLine();
            destroyer.action(action);
        } while (!action.equals("exit"));
        System.out.println("Choose destroyer or exit");
    }
}
