/*
Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
 */

public class HW2 {
    //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
    private static boolean revert_eq(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        int l = s1.length()-1;

        for (int i = 0; i < s1.length(); i++) {
            if (s2.charAt(i) != s1.charAt(l-i))
                return false;
        }
        return true;
    }

    //*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    private static String revert_str(String s1){

        StringBuilder res = new StringBuilder(s1);

        return res.reverse().toString();
    }
    //Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
    private static String calc(Integer i1, Integer i2){
        Integer plus = i1 + i2;
        Integer minus = i1 - i2;
        Integer multiplication = i1 * i2;

        StringBuilder res = new StringBuilder();

        res.append(i1.toString() + " + " + i2.toString() + " = " + plus.toString() + " ");
        res.append(i1.toString() + " - " + i2.toString() + " = " + minus.toString() + " ");
        res.append(i1.toString() + " * " + i2.toString() + " = " + multiplication.toString());

        return res.toString();

    }

    //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

    private static String replace_eq(String s1){
        StringBuilder res = new StringBuilder(s1);

        while (true){
            int i = res.indexOf("=");
            if (i == -1) return res.toString();

            res.deleteCharAt(i);
            res.insert(i, "равно");

        }
    }

    //*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    private static String replace_eq_2(String s1){
        StringBuilder res = new StringBuilder(s1);

        while (true){
            int i = res.indexOf("=");
            if (i == -1) return res.toString();

            res.replace(i, i + 1, "равно");

        }
    }

    public static void main(String[] args) {

        System.out.println(revert_eq("asdf", "fdsa"));
        System.out.println(revert_eq("asdf", "fsa"));
        System.out.println(revert_eq("asdf", "gijo"));

        System.out.println(revert_str("fdsa"));

        System.out.println(calc(2,3));

        System.out.println(replace_eq(calc(2,3)));
        System.out.println(replace_eq_2(calc(2,3)));

    }
}
