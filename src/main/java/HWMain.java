public class HWMain {
    public static void main(String[] args) {
        CustomLincedList customLincedList = new CustomLincedList();
        customLincedList.add(1);
        customLincedList.add(2);
        customLincedList.add(5);

        customLincedList.forEach(System.out::println);

    }
}
