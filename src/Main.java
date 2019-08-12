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
                    su_15.action();
                    System.out.println("Choose destroyer or exit");
                    break;
                case "F-14":
                    f_14.action();
                    System.out.println("Choose destroyer or exit");
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
}
