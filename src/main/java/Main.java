import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine",12));
        tovary.add(new Product("dust",10));
        tovary.add(new Soda("kind", 19, "grapes"));

        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println(mach2);
        System.out.println(mach2.findByName("kind"));
        System.out.println(mach2.findByPrice(12));
        System.out.println(mach2.findByPriceRange(9,13));
        System.out.println("==========================HOMEWORK=================================================\n");

        List<Product> konfetki = new ArrayList<>();

        konfetki.add(new Candy("mlechny put\'", 16, "chocolate", "moloko"));
        konfetki.add(new Candy("nagrada", 19, "chocolate", "coconut"));
        konfetki.add(new Candy("giant cock on a stick", 15, "caramel", "sugar")); // петyшок на палочке
        konfetki.add(new Candy("horoshiy parizh", 19, "jelly", "apple"));
        konfetki.add(new Veggies("Jose", 22, "Jalapeno on a Stick"));
        konfetki.add(new Veggies("Ricardo", 12, "Carolina Pepper"));
        konfetki.add(new Milk("happy Milkman", 20));

        VendingMachine mach3Turbo = new VendingMachine(konfetki);
        System.out.println(mach3Turbo);
    }
}
