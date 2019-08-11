public class F_14 extends Destroyer {

    private int crew = 2;
    private double length = 19.1d;
    private double height = 4.88d;
    private double weight_empty = 19.838d;
    private int max_speed = 2485;
    private int flying_height = 16150;
    public int guided_missiles_AIM9 = 2;
    private int missiles_AIM54 = 6;
    private String engine = "General Electric F110-GE-400";


    @Override
    public void attack(AttackType type) {
        switch (type) {
            case GUIDED:
                System.out.println(getName() + " Fire AIM-9");
                guided_missiles_AIM9--;
                break;
            case NOT_GUIDED:
                System.out.println(getName() + " Fire AIM-54");
                missiles_AIM54--;
                break;
        }
    }
    @Override
    protected String getName() {
        return "F-14";
    }
}
