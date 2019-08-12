import java.util.Scanner;

public class Su_15 extends Destroyer {

    private int crew = 1;
    private double length = 22.03d;
    private double height = 4.843d;
    private double weight_empty = 10.874d;
    private int max_speed = 2230;
    private int flying_height = 13000;
    private int guided_missiles_R98 = 2;
    private int missiles_R60 = 4;
    private String engine = "Tumansky R-11";


    @Override
    public void attack(AttackType type) {
        switch (type) {
            case GUIDED:
                if (guided_missiles_R98 > 0) {
                    System.out.println(getName() + " R98 FIRE!");
                    guided_missiles_R98--;
                    System.out.println(guided_missiles_R98 + " left");
                } else {
                    System.out.println(getName() + " ERROR: there are no guided missiles R98");
                }
                break;
            case NOT_GUIDED:
                if (missiles_R60 > 0) {
                    System.out.println(getName() + " R60 FIRE!");
                    missiles_R60--;
                    System.out.println(missiles_R60 + " left");
                } else {
                    System.out.println(getName() + " ERROR: there are no missiles R60");
                }
                break;
        }
    }

    @Override
    protected String getName() {
        return "Su-15";
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 'help' to view commands");
        String hub;
        do {
            switch (hub = scanner.nextLine()) {
                case "help":
                    System.out.println("1.exit");
                    System.out.println("2.turn on engine");
                    System.out.println("3.turn off engine");
                    System.out.println("4.fly up");
                    System.out.println("5.land");
                    System.out.println("6.attack by guided missiles R98");
                    System.out.println("7.attack by missiles R60");
                    System.out.println("Enter command:");
                    break;
                case "turn on engine":
                    engine_on();
                    break;
                case "turn off engine":
                    engine_off();
                    break;
                case "fly up":
                    fly_up();
                    break;
                case "land":
                    landing();
                    break;
                case "attack by guided missiles R98":
                    attack(Destroyer.AttackType.GUIDED);
                    break;
                case "attack by missiles R60":
                    attack(Destroyer.AttackType.NOT_GUIDED);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Error: wrong command");
                    System.out.println("Enter command:");
                    break;
            }
        } while (!hub.equals("exit"));
    }
}
