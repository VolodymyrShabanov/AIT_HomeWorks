package home_work_38.view;

import home_work_38.models.User;
import home_work_38.services.UsersService;

import java.util.Scanner;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Menu {

   private UsersService usersService;

    public Menu(UsersService usersService) {
        this.usersService = usersService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Зарегистрировать пользователя.");
            System.out.println("2. Показать всех пользователей.");
            System.out.println("0. Выход.");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0: {
                    System.out.println("Выходим из программы...");
                    System.exit(0);
                } break;

                case 1: {
                    System.out.println("FirstName: ");
                    String firstName = scanner.nextLine();
                    System.out.println("LastName: ");
                    String lastName = scanner.nextLine();
                    System.out.println("email: ");
                    String email = scanner.nextLine();
                    System.out.println("password: ");
                    String password = scanner.nextLine();

                    usersService.register(firstName, lastName, email, password);
                } break;

                case 2: {
                    User[] users = usersService.getAllUsers();
                    for (int i = 0; i < users.length; i++) {
                        System.out.println(users[i].getFirstName() + " " + users[i].getLastName());
                    }
                }break;

            }
        }
    }
}
