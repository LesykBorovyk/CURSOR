public abstract class Destroyer {

    protected enum AttackType {
        GUIDED, NOT_GUIDED
    }

    protected void engine_on() {
        System.out.println(getName() + " Engine On");
    }

    protected void fly_up() {
        System.out.println(getName() + " In the air");
    }

    protected void landing() {
        System.out.println(getName() + " Landed");
    }

    protected abstract void attack(AttackType type);

    protected void engine_off() {
        System.out.println(getName() + " Engine off");
    }

    protected abstract String getName();

    protected abstract void action(String action);
}
