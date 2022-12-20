import java.util.*;

public class HW6 {
    public static void main(String[] args) {
        CustomTreeSet customTreeSet = new CustomTreeSet();

        for (int i = 0; i < 10; i++) {
            customTreeSet.add(new Random().nextInt(1000)-500);
        }
        System.out.println(customTreeSet.toString());
    }
}