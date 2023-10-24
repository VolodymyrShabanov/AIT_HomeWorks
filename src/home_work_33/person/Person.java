package home_work_33.person;

// Created by Volodymyr Sh on 23.10.2023
// project name: AIT_Lessons
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
                "email= '" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmeilValid(email)) {
            this.email = email;
        }
    }

    private boolean isEmeilValid(String email) {

        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        if (email.indexOf('.', indexAt) == -1) return false;

        if (email.indexOf('.') >= email.length() - 2) return false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isDigit(c)
                                            || c == '.'
                                            || c == '_'
                                            || c == '-'
                                            || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }
}
