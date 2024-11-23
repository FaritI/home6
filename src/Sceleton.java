public class Sceleton extends Boss {

    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public Sceleton(int healts, int damage, Weapon weapon, int arrowCount) {
        super(healts, damage, weapon);
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "Arrow count" + arrowCount;
    }
}
