package solid;

import solid.srp.models.Order;
import solid.srp.models.SaveManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
        SaveManager saveManager = new SaveManager();
        saveManager.saveToJson(order);
    }
}
