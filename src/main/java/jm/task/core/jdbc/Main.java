package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alexander", "Chernuhin", (byte) 25);
        userService.saveUser("Sarra", "Avraama", (byte) 120);
        userService.saveUser("Jesus", "God's Son", (byte) 33);
        userService.saveUser("Avraam", "Father of many", (byte) 175);


        System.out.println(userService.getAllUsers());
        userService.getAllUsers();
        userService.dropUsersTable();

    }
}