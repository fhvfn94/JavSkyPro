package pro.sky.JavaSkyPro.exception;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Validator {
    private Validator() {

    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void check(String login, String password, String confirmPassword) {
        throws WrongLoginException, WrongPasswordException{
            if (Objects.isNull(login) || login.length() > 20) {
                throw new WrongLoginException("Длина логина должна быть меньше или равна 20");
            }
            if (Objects.isNull(password) || login.length() >= 20) {
                throw new WrongPasswordException("Длина пароля должна быть меньше 20");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли должны совпадать");
            }
            Checker checker = ThreadLocalRandom.current().nextBoolean() ?
                    new RegexChecker() :
                    new LoopChecker();
            if (!checker.isValid(login)) {
                throw new WrongLoginException("Логин содержит не корректные значения");
            }
        }
    }
}


