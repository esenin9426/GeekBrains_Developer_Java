import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HW3 {
/*
*Сортировка списка.
*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
 */


    //Поиска элемента в списке по строке.
    private static boolean findElement(ArrayList s, String f) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) == f) {
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        System.out.println(list);

        //Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ArrayList<String> s = new ArrayList<String>(Arrays.asList("red green blue yellow black".split(" ")));
        for (int i = 0; i < s.size(); i++) {
            s.set(i, s.get(i) + "!");
        }
        System.out.println(s);
        //Удалить третий элемент из списка.
        s.remove(3-1);
        System.out.println(s);

        //Вставить элемент в список в первой позиции.
        String tmp = "pink!";
        s.add(0, tmp);
        System.out.println(s);

        //Извлечь элемент (по указанному индексу) из заданного списка.
        s.remove(1);
        System.out.println(s);

        //Обновить определенный элемент списка по заданному индексу.
        s.set(1, s.get(1) + "!");
        System.out.println(s);

        //Поиска элемента в списке по строке.
        String f = "pink!";
        if (findElement(s, f)) System.out.println("Элемент найден))");
        else System.out.println("Элемент не найден((");

        //Создать новый список и добавить в него несколько елементов первого списка.

        ArrayList s2 = new ArrayList();
        s2.add(s.get(1));

        //Удалить из первого списка все элементы отсутствующие во втором списке.
        for (int i = 0; i < s.size(); i++) {
            if(!findElement(s2, s.get(i))) s.remove(i);
        }
        //*Сортировка списка.
        s.sort(Collections.reverseOrder());
        System.out.println(s);
    }
}
