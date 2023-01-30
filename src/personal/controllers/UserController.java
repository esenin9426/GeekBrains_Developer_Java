package personal.controllers;

import personal.model.Repository;
import personal.model.User;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> userList(){
        List<User> result = repository.getAllUsers();
        return result;
    }

    public User updateUser(String userId) throws Exception {
        List<User> userList = repository.getAllUsers();
        for (User i: userList) {
            if (i.getId().equals(userId)){
                System.out.print("Введите новое имя: ");
                Scanner scanner = new Scanner(System.in);
                i.setFirstName(scanner.nextLine());
                System.out.print("Введите новую Фамилию: ");
                Scanner scanner_2 = new Scanner(System.in);
                i.setLastName(scanner_2.nextLine());
                System.out.print("Введите ноый номер: ");
                Scanner scanner_3 = new Scanner(System.in);
                i.setPhone(scanner_3.nextLine());
                validateUser(i);
                repository.updateUser(i);
                return i;
            }
        }
        throw new Exception("User not found");

    }

    public void deleteUser(String userID) throws Exception{
        repository.deleteUser(userID);

    }

    private void validateUser(User user) throws Exception{
        if(user.getId().isEmpty())
            throw new Exception("Id is empty");
        if(user.getFirstName().contains(" "))
            throw new Exception("FirstName has space");
        if(user.getLastName().contains(" "))
            throw new Exception("LastName has space");
        if(user.getPhone().contains(" "))
            throw new Exception("Phone has space");
    }
}
