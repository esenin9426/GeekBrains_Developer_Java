import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{

    List<T> warriors = new ArrayList<>();
    Comandor comandor;

    public Team(Comandor comandor){
        this.comandor = comandor;
    }


    public List<T> getWarriors() {
        return warriors;
    }

    public void setWarriors(T warriors) {
        this.warriors.add(warriors);
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void setComandor(Comandor comandor) {
        this.comandor = comandor;
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage(){
        int sumDamage = 0;
        for (T items: this
             ) {
            sumDamage+= items.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealpoint(){
        int sumHealpoint = 0;
        for (T items: this
        ) {
            sumHealpoint+= items.getHealpoint();
        }
        return sumHealpoint;
    }

    public int getMaxRadius(){
        int max = 0;
        for (T items: this
             ) {
            Weapon weapon = items.getWeapon();
            if(weapon instanceof Bow){
                Bow bow = (Bow) weapon;
                if(bow.range() > max) {
                    max = bow.range();}
            }
        }
        return max;
    }
}
