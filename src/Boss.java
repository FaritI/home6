public class Boss extends GameEntity{
 private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public Boss(int healts, int damage, Weapon weapon) {
        super(healts, damage);
        this.weapon =weapon;

    }
    public String printInfo(){
        return "healts:" +getHealts()+"Damage:"+getDamage() +
                "Weapon Type:" + weapon.getWeaponType()+
                "Weapon Name:" + weapon.getWeaponName();
    }
}
