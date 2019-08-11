public abstract class Destroyer {

    public enum AttackType {
        GUIDED, NOT_GUIDED
    }

    public void engine_on() {
        System.out.println(getName() + " Engine On");
    }

    public void fly_up() {
        System.out.println(getName() + " Fly up");
    }

    public void landing() {
        System.out.println(getName() + " Landed");
    }

    public abstract void attack(AttackType type);

    public void engine_off() {
        System.out.println(getName() + " Engine off");
    }

    protected abstract String getName();
}
