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
                }else {
                    System.out.println(getName() + " ERROR: there are no guided missiles AIM-9");
                }
                break;
            case NOT_GUIDED:
                if (missiles_AIM54 > 0) {
                    System.out.println(getName() + " AIM-54 FIRE!");
                    missiles_AIM54--;
                    System.out.println(missiles_AIM54 + " left");
                }else{
                    System.out.println(getName() + " ERROR: there are no missiles AIM-54");
                }
                break;
        }
    }
    @Override
    protected String getName() {
        return "F-14";
    }
}
