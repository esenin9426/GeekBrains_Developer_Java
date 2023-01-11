public class Main {

    public static void main(String[] args) {
        Comandor comandor = new Comandor("Vas", 250, new LongBow());
        Team<Archer> archerTeam = new Team<>(comandor);
        archerTeam.setWarriors(new Archer("L1", 180, new LongBow()));
        archerTeam.setWarriors(new Archer("L2", 150, new LongBow(), new BowShield()));
        System.out.println(archerTeam.getComandor());
        archerTeam.forEach(System.out::println);
        System.out.println(archerTeam.getAllDamage());
        System.out.println(archerTeam.getAllHealpoint());
        System.out.println(archerTeam.getMaxRadius());
        System.out.println("-----------------------------");

        Comandor comandor1 = new Comandor("Vas2", 250, new LongBow());
        Team<Barbarian> barbarianTeam = new Team<>(comandor1);
        barbarianTeam.setWarriors(new Barbarian("B1", 300, new Sekira()));
        barbarianTeam.setWarriors(new Barbarian("B2", 10, new Sekira(), new BarbarianShield()));
        System.out.println(barbarianTeam.getComandor());
        barbarianTeam.forEach(System.out::println);
        System.out.println(barbarianTeam.getAllDamage());
        System.out.println(barbarianTeam.getAllHealpoint());
        System.out.println(barbarianTeam.getMaxRadius());
        System.out.println("-----------------------------");

    }
}
