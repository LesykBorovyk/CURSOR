import java.util.List;

public class Main {

    public static void main(String[] args) {
        Destroyer su_15 = new Su_15();
        Destroyer f_14 = new F_14();

        su_15.engine_on();
        su_15.fly_up();
        su_15.attack(Destroyer.AttackType.GUIDED);
        su_15.attack(Destroyer.AttackType.NOT_GUIDED);
        su_15.landing();
        su_15.engine_off();

        System.out.println("");

        f_14.engine_on();
        f_14.fly_up();
        f_14.attack(Destroyer.AttackType.GUIDED);
        f_14.attack(Destroyer.AttackType.NOT_GUIDED);
        f_14.landing();
        f_14.engine_off();
    }
}
