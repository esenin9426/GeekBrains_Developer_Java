import java.util.ArrayList;
import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> first_name = new ArrayList();
        Integer age = -1;
        while (true) {
            System.out.print("enter your first name, last name, age, gender()(enter end for finish):");
            String tmp = scanner.nextLine();
            if(tmp.equals("end")){
                break;
            }
            String[] name = tmp.split(" ");

            try {
                age = Integer.valueOf(name[3]);
            }
            catch (NumberFormatException ex){
                System.out.println("age is false, try again");
                continue;
            }
            Integer last = first_name.size() -1;
            Integer start = 0;
            if(first_name.size() == 0 || Integer.valueOf(first_name.get(last)[3]) < age) {
                first_name.add(name);
                continue;
            }
            if(Integer.valueOf(first_name.get(0)[3]) > age) {
                first_name.add(0, name);
                continue;
            }
            while (start < last){
                Integer m = start + (last - start)/2;
                if(age > Integer.valueOf(first_name.get(m)[3]) && age < Integer.valueOf(first_name.get(m+1)[3])){
                    first_name.add(m, name);
                    break;
                }
                if(age > Integer.valueOf(first_name.get(m)[3])){
                    last = m;
                }
                if(age < Integer.valueOf(first_name.get(m)[3])){
                    start = m;
                }
            }

        }

        for (String[] i:
             first_name) {
            for (String j:
                 i) {
                System.out.print(j + " ");
            }
            System.out.println();
        };
    }
}
