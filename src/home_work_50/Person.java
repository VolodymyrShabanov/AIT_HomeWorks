package home_work_50;

import home_work_50.email_validate.EmailValidator;
import home_work_50.email_validate.EmailValidateException;
import home_work_50.password_validate.PasswordValidate;
import home_work_50.password_validate.PasswordValidateException;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            EmailValidator.validate(email);
            System.out.println("Email -> is correct!");
            this.email = email;
        } catch (EmailValidateException e) {
            System.out.println("Email -> not correct!");
            e.printStackTrace();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            PasswordValidate.validate(password);
            System.out.println("Password -> is correct!");
            this.password = password;
        } catch (PasswordValidateException e) {
            System.out.println("Password -> not correct!");
            e.printStackTrace();
        }
    }

}
