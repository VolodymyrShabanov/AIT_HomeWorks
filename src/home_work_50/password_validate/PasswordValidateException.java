package home_work_50.password_validate;

/**
 * Created by Volodymyr Sh on 16.11.2023
 * project name: AIT_HomeWorks
 */
public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }
}
