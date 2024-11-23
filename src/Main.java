public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss(500,50, new Weapon(WeaponType.KASTET,"kastet"));
        System.out.println(boss.printInfo());

        Sceleton sceleton=new Sceleton(50,5,new Weapon(WeaponType.LUK,"Luk"),30);
        Sceleton sceleton2=new Sceleton(30,15,new Weapon(WeaponType.MECH,"Mech"),1);
        System.out.println(sceleton.printInfo());
        System.out.println(sceleton2.printInfo());

    }


}
