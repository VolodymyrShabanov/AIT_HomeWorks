package home_work_38;

import home_work_38.repositories.UsersRepository;
import home_work_38.services.UsersService;
import home_work_38.view.Menu;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        UsersService usersService = new UsersService(usersRepository);
        Menu menu = new Menu(usersService);
        menu.run();


    }
}
