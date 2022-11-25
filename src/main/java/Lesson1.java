import java.util.ArrayList;
import java.util.Random;

public class Lesson1 {

    private static Integer Random_d(Integer min, Integer max){
        return new Random().nextInt(max - min) + min;
    }

    private static Integer msb(Integer number){
        return Integer.toBinaryString(number).length();
    }

    private static ArrayList<Integer> multiples(Integer number, Integer from, Integer to){
        ArrayList<Integer> res = new ArrayList<>();
        int d = 1;
        for (int i = from; i <= to; i += d) {
            if (i%number == 0){
                d = number;
                res.add(i);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Integer i = Random_d(-1000, 1000);
        Integer n = msb(i);
        ArrayList<Integer> m1 = multiples(n, i, (int) Short.MAX_VALUE);
        ArrayList<Integer> m2 = multiples(n, (int) Short.MIN_VALUE, i);

        System.out.println(i);
        System.out.println(n);
        System.out.println(m1);
        System.out.println(m2);
    }
}
