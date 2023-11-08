package home_work_38.repositories;

import home_work_38.models.User;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class UsersRepository {
    private static final int MAX_USERS_COUNT = 10;
    private User[] users;
    private int usersCount;

    public UsersRepository() {
        this.users = new User[MAX_USERS_COUNT];
    }

    public void save(User user) {
        this.users[usersCount] = user;
        this.usersCount ++;
    }

    /**
     * Метод для проверки существования пользователя по email-у;
     * @param email пользователя;
     * @return если email зарегистрирован, то возвращает <code>true</code>
     * в противном случае <code>false</code>;
     * */
    public boolean isExistsByEmail(String email){
        for (int i = 0; i < usersCount; i++) {
            if (users[i].getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод возвращает всех пользователей из хранилища.
     * @return array пользователей.
     * */
    public User[] findAll() {
        User [] copy = new User[usersCount];
        for (int i = 0; i < usersCount; i++) {
            copy[i] = users[i];
        }
        return copy;
    }

}
