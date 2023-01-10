import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("D", "B", 1);
        User u2 = new User("A", "R", 20);
        User u3 = new User("V", "T", 3);

        Personal personal = new Personal();

        personal.addUser(u1).
                addUser(u2).
                addUser(u3);
        for (User item: personal) {
            System.out.println(item);
        }

        Collections.sort(personal.getUsers());

        personal.forEach(System.out::println);

        User boss = new User("Di", "Bill", 1, personal);
        User BigBoss = new User("My", "Duck", 1, personal);

        Company company = new Company(BigBoss);

        for (User item: company
             ) {
            System.out.println(item);
        }
    }
}
