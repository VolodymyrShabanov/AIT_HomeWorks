package home_work_38_practice.services;

import home_work_38_practice.models.User;
import home_work_38_practice.repositories.UsersRepository;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;

    }


    public void register(String firstName, String lastName, String email, String password){
        if (usersRepository.isExistsByEmail(email)) {
            System.err.println("Пользователь с таким email уже зарегистрирован.");
            return;
        }
        User user = new User(firstName, lastName, email, password);
        System.out.println("The user is register: " + user.getFirstName() + " || " + user.getLastName());
        usersRepository.save(user);
    }


    public User[] getAllUsers(){
        return usersRepository.findAll();
    }


}
