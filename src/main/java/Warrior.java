public abstract class Warrior <T extends Weapon>{
    private String name;
    private int healpoint;
    private T weapon;
    private Shield shield = null;


    public Warrior(String name, int healpoint, T weapon) {
        this.name = name;
        this.healpoint = healpoint;
        this.weapon = weapon;
    }

    public Warrior(String name, int healpoint, T weapon, Shield shield) {
        this.name = name;
        this.healpoint = healpoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    @Override
    public String toString() {
        if(shield == null)
            return " name=" + name +
                ", healpoint=" + healpoint +
                ", weapon=" + weapon;
        return " name='" + name + '\'' +
                ", healpoint=" + healpoint +
                ", weapon=" + weapon +
                ", shield=" + shield;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealpoint() {
        return healpoint;
    }

    public void setHealpoint(int healpoint) {
        this.healpoint = healpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
