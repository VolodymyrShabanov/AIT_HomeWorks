package home_work_34.person;

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
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    private boolean isEmailValid(String email) {

        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        if (email.indexOf('.', indexAt) == -1) return false;

        if (email.indexOf('.') >= email.length() - 2) return false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(isAlphabeticLatin(c) || Character.isDigit(c)
                    || c == '.'
                    || c == '_'
                    || c == '-'
                    || c == '@')) {
                return false;
            }
        }
        return true;
    }
    // добавил проверку на латиницу
    private boolean isAlphabeticLatin(char c){
        return (c > 'A' && c < 'Z' || c > 'a' && c < 'z');
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }


    private boolean isPasswordValid(String password) {
        //        длина >= 8
        if (password.length() < 8) return false;

        boolean[] res = new boolean[4];
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if ((Character.isDigit(c))) {
                res[0] = true;
            }
            if ((Character.isLowerCase(c))) {
                res[1] = true;
            }
            if ((Character.isUpperCase(c))) {
                res[2] = true;
            }
            if ("!%$@&".indexOf(c) >= 0) {
                res [3] = true;
            }
        }

        return res[0] && res[1] && res[2] && res[3];

        //// это моя реализация!!!
////        мин 1 цифра
//        boolean isDigit = false;
////        мин 1 маленькая буква
//        boolean isLowerCase = false;
////        мин 1 большая буква
//        boolean isUpperCase = false;
////        мин 1 спец.символ ("!%$@&")
//        boolean isSpecialSymbol = false;
//        for (int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            if ((Character.isDigit(c))) {
//                isDigit = true;
//            }
//            if ((Character.isLowerCase(c))) {
//                isLowerCase = true;
//            }
//            if ((Character.isUpperCase(c))) {
//                isUpperCase = true;
//            }
//            if (c == '!' || c == '%' || c == '$' || c == '@' || c == '&') {
//                isSpecialSymbol = true;
//            }
//        }
//
//        if (!(isDigit && isLowerCase && isUpperCase && isSpecialSymbol)) {
//            return false;
//        }
//        return true;
    }
}
