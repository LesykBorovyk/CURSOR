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
                System.out.println(getName() + " Fire R98");
                guided_missiles_R98--;
                break;
            case NOT_GUIDED:
                System.out.println(getName() + " Fire R60");
                missiles_R60--;
                break;
        }
    }

    @Override
    protected String getName() {
        return "Su-15";
    }
}
