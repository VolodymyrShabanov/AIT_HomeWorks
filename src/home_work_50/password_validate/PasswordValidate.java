package home_work_50.password_validate;

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

        if (!res[0]) {
            throw new PasswordValidateException("no digit in password");
        }

        if (!res[1]) {
            throw new PasswordValidateException("no lowerCase");
        }

        if (!res[2]) {
            throw new PasswordValidateException("no upperCase");
        }

        if (!res[3]) {
            throw new PasswordValidateException("absent !%$@&");
        }

        return true;
    }
}


