package ru.rsreu.exercice01;

import ru.rsreu.exercice01.models.Auto;
import ru.rsreu.exercice01.models.User;
import ru.rsreu.exercice01.services.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UserService userService = new UserService();
        /*User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari","red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        user.setName("Sasha");
        userService.updateUser(user);*/
        User user = userService.findUser(2);
        System.out.println(user);
    }
}