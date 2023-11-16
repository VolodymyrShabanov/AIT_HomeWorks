package home_work_50.person.password_validate;

import java.util.Objects;

/**
 * Created by Volodymyr Sh on 16.11.2023
 * project name: AIT_HomeWorks
 */
public class PasswordValidate {
    private static String passwordOld;

    public static boolean validate(String password) throws PasswordValidateException {
    /*
    Требования к валидному password
    1. длина >= 8
    2. мин 1 цифра
    3. мин 1 маленькая буква
    4. мин 1 большая буква
    5. мин 1 спец. символ ("!%$@&")
     */
        if (password.length() < 8) throw new PasswordValidateException("length error");
        if (Objects.equals(passwordOld, password)) throw new PasswordValidateException("password already exist");

        boolean[] res = new boolean[4];
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                res[0] = true;
            }

            if (Character.isLowerCase(c)) {
                res[1] = true;
            }

            if (Character.isUpperCase(c)) {
                res[2] = true;
            }

            if ("!%$@&".indexOf(c) >= 0) {
                res[3] = true;
            }
        }

        return res[0] && res[1] && res[2] && res[3];
    }

    public static boolean setPassword(String password) throws PasswordValidateException {
        if (validate(password)) {
            passwordOld = password;
            return true;
        }
        throw new PasswordValidateException("symbol error");

    }

}
