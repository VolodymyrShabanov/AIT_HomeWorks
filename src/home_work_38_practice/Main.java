package home_work_38_practice;

import home_work_38_practice.repositories.ProductsRepository;
import home_work_38_practice.repositories.UsersRepository;
import home_work_38_practice.services.ProductService;
import home_work_38_practice.services.UsersService;
import home_work_38_practice.view.Menu;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        UsersService usersService = new UsersService(usersRepository);

        ProductsRepository productsRepository = new ProductsRepository();
        ProductService productService = new ProductService(productsRepository);

        Menu menu = new Menu(usersService, productService);
        menu.run();


    }
}
