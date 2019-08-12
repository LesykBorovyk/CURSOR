import java.util.Scanner;

public class F_14 extends Destroyer {

    private int crew = 2;
    private double length = 19.1d;
    private double height = 4.88d;
    private double weight_empty = 19.838d;
    private int max_speed = 2485;
    private int flying_height = 16150;
    private int guided_missiles_AIM9 = 2;
    private int missiles_AIM54 = 6;
    private String engine = "General Electric F110-GE-400";


    @Override
    public void attack(AttackType type) {
        switch (type) {
            case GUIDED:
                if (guided_missiles_AIM9 > 0) {
                    System.out.println(getName() + " AIM-9 FIRE!");
                    guided_missiles_AIM9--;
                    System.out.println(guided_missiles_AIM9 + " left");
                } else {
                    System.out.println(getName() + " ERROR: there are no guided missiles AIM-9");
                }
                break;
            case NOT_GUIDED:
                if (missiles_AIM54 > 0) {
                    System.out.println(getName() + " AIM-54 FIRE!");
                    missiles_AIM54--;
                    System.out.println(missiles_AIM54 + " left");
                } else {
                    System.out.println(getName() + " ERROR: there are no missiles AIM-54");
                }
                break;
        }
    }

    @Override
    protected String getName() {
        return "F-14";
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter '777' to view commands");
        int hub;
        do {
            switch (hub = scanner.nextInt()) {
                case 777:
                    System.out.println("0 - exit");
                    System.out.println("1 - turn on engine");
                    System.out.println("2 - turn off engine");
                    System.out.println("3 - fly up");
                    System.out.println("4 - land");
                    System.out.println("5 - attack by guided missiles");
                    System.out.println("6 - attack by missiles");
                    System.out.println("Enter command:");
                    break;
                case 1:
                    engine_on();
                    break;
                case 2:
                    engine_off();
                    break;
                case 3:
                    fly_up();
                    break;
                case 4:
                    landing();
                    break;
                case 5:
                    attack(Destroyer.AttackType.GUIDED);
                    break;
                case 6:
                    attack(Destroyer.AttackType.NOT_GUIDED);
                    break;
            }
        } while (hub != 0);
    }
}
