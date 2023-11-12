package home_work_38_practice.view;

import home_work_38_practice.models.Product;
import home_work_38_practice.models.User;
import home_work_38_practice.services.ProductService;
import home_work_38_practice.services.UsersService;

import java.util.Scanner;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Menu {

    private UsersService usersService;

    private ProductService productService;

    public Menu(UsersService usersService, ProductService productService) {
        this.usersService = usersService;
        this.productService = productService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============= MENU ==============");
            System.out.println("1. Зарегистрировать пользователя.");
            System.out.println("2. Показать всех пользователей.");
            System.out.println("=================================");

            System.out.println("3. Создать новый продукт.");
            System.out.println("4. Показать все продукты.");
            System.out.println("5. Показать продукт по Id.");
            System.out.println("6. Продукты по Названию");
            System.out.println("7. Продукты по Описанию");
            System.out.println("8. Продукты в диапазоне цен (min / max)");
            System.out.println("9. Удалить продукт по Id.");
            System.out.println("=================================");

            System.out.println("0. Выход.");
            try {


                int command = scanner.nextInt();
                scanner.nextLine();

                switch (command) {
                    case 0: {
                        clearConsole();
                        System.out.println("Выходим из программы...");
                        System.exit(0);
                    }
                    break;

                    case 1: {
                        clearConsole();
                        registerUser(scanner);
                    }
                    break;

                    case 2: {
                        clearConsole();
                        showAllUser(scanner);
                    }
                    break;

                    case 3: {
                        clearConsole();
                        createdNewProduct(scanner);
                    }
                    break;

                    case 4: {
                        clearConsole();
                        showAllProducts(scanner);
                    }
                    break;

                    case 5: {
                        clearConsole();
                        showProductById(scanner);
                    }
                    break;

                    case 6: {
                        clearConsole();
                        showProductsByTitle(scanner);
                    }
                    break;

                    case 7: {
                        clearConsole();
                        showProductsByDescription(scanner);
                    }
                    break;

                    case 8: {
                        clearConsole();
                        showProductsByPrice(scanner);
                    }
                    break;

                    case 9: {
                        clearConsole();
                        deleteProductsById(scanner);
                    }
                    break;

                    default:
                        System.err.println("Incorrect menu number entered! Please try again.");

                }

            } catch (java.util.InputMismatchException e) {
                System.err.println("Input error. Please enter an integer.");
                scanner.nextLine();
            }

            System.out.println("_________________________________");
            System.out.println("Press enter to continue...");
            scanner.nextLine();

            clearConsole();


        }
    }

    private void registerUser(Scanner scanner) {
        System.out.println("Выбран пункт - 1. Зарегистрировать пользователя.");
        System.out.println("FirstName: ");
        String firstName = scanner.nextLine();
        System.out.println("LastName: ");
        String lastName = scanner.nextLine();
        System.out.println("email: ");
        String email = scanner.nextLine();
        System.out.println("password: ");
        String password = scanner.nextLine();

        usersService.register(firstName, lastName, email, password);
    }

    private void showAllUser(Scanner scanner) {
        System.out.println("Выбран пункт - 2. Показать всех пользователей.");
        User[] users = usersService.getAllUsers();
        for (int i = 0; i < users.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i + 1).append("). ")
                    .append(users[i].getFirstName())
                    .append(" || ")
                    .append(users[i].getLastName())
                    .append(";");
            System.out.println(sb);
            //System.out.println((i+1)+ "). " + users[i].getFirstName() + " || " + users[i].getLastName() );
        }
    }

    private void createdNewProduct(Scanner scanner) {
        System.out.println("Выбран пункт - 3. Создать новый продукт.");
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("prise: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("description: ");
        String description = scanner.nextLine();
        Product newProduct = productService.createNeuProduct(title, price, description);
        if (newProduct == null) return;
        System.out.println(newProduct);
    }

    private void showAllProducts(Scanner scanner) {
        System.out.println("Выбран пункт - 4. Показать все продукты.");
        printProductsArray(productService.allProducts());
    }

    private void showProductById(Scanner scanner) {
        System.out.println("Выбран пункт - 5. Продукт по Id.");
        System.out.println("Enter the Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product showProduct = productService.getProductById(id);
        if (showProduct == null) {
            return;
        }

        System.out.println(showProduct);
    }

    private void showProductsByTitle(Scanner scanner) {
        System.out.println("Выбран пункт - 6. Продукты по Названию");
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        printProductsArray(productService.getProductsByTitle(title));
    }

    private void showProductsByDescription(Scanner scanner) {
        System.out.println("Выбран пункт - 7. Продукты по Описанию");
        System.out.println("Enter the description: ");
        String description = scanner.nextLine();
        printProductsArray(productService.getProductsByDescription(description));
    }

    private void showProductsByPrice(Scanner scanner) {
        System.out.println("Выбран пункт - 8. Продукты в диапазоне цен (min / max)");
        System.out.println("Enter the min price: ");
        double min = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the max price: ");
        double max = scanner.nextDouble();
        scanner.nextLine();
        printProductsArray(productService.getProductsByPrice(min, max));
    }

    private void deleteProductsById(Scanner scanner) {
        System.out.println("Выбран пункт - 9. Удалить продукт по Id.");
        System.out.println("Enter the Id product which you want to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product deleteProduct = productService.deleteProductById(id);
        if (deleteProduct == null) return;

        System.err.println("Was delete: " + deleteProduct);

    }

    private void printProductsArray(Product[] products) {
        if (products == null) {
            return;
        }

        if (products.length == 0) {
            System.err.println("Nothing was found for your query!");
            return;
        }

        for (Product product : products) {
            System.out.printf(product + ";\n");
        }
        System.out.println();
    }

    public void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

}
