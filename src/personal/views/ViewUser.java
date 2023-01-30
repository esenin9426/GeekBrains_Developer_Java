package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("Имя: ");
                    String lastName = prompt("Фамилия: ");
                    String phone = prompt("Номер телефона: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(id);
                        System.out.println(user);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    List<User> users = userController.userList();
                    users.forEach(i -> System.out.println(i + "\n"));
                    break;
                case UPDATE:
                    String idUpdate = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(idUpdate);
                        System.out.println(user.toString());
                        userController.updateUser(idUpdate);

                    } catch (Exception e) {
                        System.out.println(e);
                        break;
                    }
                    finally {
                        break;
                    }
                case DELETE:
                    String idDelete = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(idDelete);
                        System.out.println(user.toString());
                        userController.deleteUser(user.getId());

                    } catch (Exception e) {
                        System.out.println(e);
                        break;
                    }
                    finally {
                        break;
                    }

            }
        }
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
