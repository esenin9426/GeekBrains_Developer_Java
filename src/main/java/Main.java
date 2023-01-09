public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Dimka",4,"Oleg"))
                .addAnimal(new Dog("Tuzik",4,"Petya"))
                .addAnimal(new Duck("Donald",2,"Ivan"))
                .addAnimal(new Eagle("Trut",2,"Sasha"))
                .addAnimal(new Penguin("Korol",2,"Antarktida"))
                .addAnimal(new Elephant("Slonik",4,"Africa"));
        System.out.println(zoo.toString());
        System.out.println("Как говорят животные:");
        System.out.println(zoo.talk());
        System.out.println("Скорости бега животных:");
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.toString()+"-" + i.runSpeed()+"km/h");
        }
        System.out.println();
        System.out.println("Скорость чемпиона: " + zoo.getChampionSpeed());
        System.out.println("Скорости полёта животных: ");
        for (Flyable i: zoo.getFlyable())
        {
            System.out.println(i.toString() +"-"+ i.flySpeed()+"km/h");
        }
        System.out.println();
        System.out.println("Скорость плавания животных: ");
        for (Swimable i: zoo.getSwimable())
        {
            System.out.println(i.toString()+"-"+i.swimSpeed()+"km/h");
        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());

    }
}