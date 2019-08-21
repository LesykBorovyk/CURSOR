import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        start(scanner);


    }

    private static void start(Scanner scan) {
        String hub;
        System.out.println("Hello! Please enter one of functions:");
        System.out.println("1.Prime");
        System.out.println("2.Factorial");
        do {
            switch (hub = scan.nextLine()) {
                case "Prime":
                    try {
                        prime(scan);
                    }catch (ArithmeticException e){
                        System.out.println("Exeption: number is not prime");
                    }
                    break;
                case "Factorial":
                    System.out.println("Enter number:");
                    factorial(scan.nextInt());
                    break;
                case "exit":
                    System.out.println("GoodBye");
                default:
                    System.out.println("Please enter one of functions:");
                    System.out.println("1.Prime");
                    System.out.println("2.Factorial");
                    break;
            }
        } while (hub != "exit");

    }

    // Exeption StackOverFlow if enter number < 1
    private static int factorial(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Throw exeption if enter not prime number
    private static void prime(Scanner scanner) {
        int num;
        System.out.println("To return to main menu enter -1");

        do {
            System.out.println("Enter number:");
            num = scanner.nextInt();
            if (num == -1) {

                System.out.println();

            } else if (num <= 1) {
                throw new ArithmeticException();

            } else if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        throw new ArithmeticException();
                    }
                }
                System.out.println(num + " is prime");
            }
        } while (num != -1);
    }
}
