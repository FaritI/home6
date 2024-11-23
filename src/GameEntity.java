public class GameEntity {
    private  int healts;
    private int damage;

    public int getHealts() {
        return healts;
    }

    public void setHealts(int healts) {
        this.healts = healts;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;

    }

    public GameEntity(int healts, int damage) {
        this.healts = healts;
        this.damage = damage;
    }
}
