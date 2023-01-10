public class User implements Comparable<User>{

    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinates = new Personal();

    public Personal getSubordinates() {
        return subordinates;
    }


    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public User(String firstName, String lastName, int age, Personal subordinates) {
        this(firstName, lastName, age);
        this.subordinates = subordinates;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User other) {
        String t = this.firstName+this.lastName;
        String o = other.firstName+other.lastName;
        return t.compareTo(o);

        //return this.age - other.age;
    }
}
