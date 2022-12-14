import java.util.HashMap;
import java.util.TreeMap;

public class HW5 {
    public static void main(String[] args) {
        //Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> tst = new HashMap<>();
        //Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        tst.put(1, "red");
        tst.put(2, "green");
        tst.put(3, "blue");
        //Изменить значения дописав восклицательные знаки.
        tst.replaceAll((k,v) -> v + "!");
        //*Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> tst2 = new TreeMap<>();
        tst2.put(1, "red");
        tst2.put(2, "green");
        tst2.put(3, "blue");
        //*Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        for (int i = 4; i <= 1000; i++) {
            tst2.put(i, "green");
        }
    }
}