package pro.sky.JavaSkyPro.exception;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Validator {
    private Validator() { // зачем мы это создали?

    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) { // Вот эта запись вообще не понятна WrongLoginException | WrongPasswordException e. Что за знак "|", что он дает. Вчто за "е" почему мы применили ее только к WrongPasswordException
            System.out.println(e.getMessage()); // в каком месте компилятор понял что означет e.getMessage()
            return false;
        }
    }

    public static void check(String login, String password, String confirmPassword) {
        throws WrongLoginException, WrongPasswordException{ // я не понял вот эту запись throws WrongLoginException, WrongPasswordException
            if (Objects.isNull(login) || login.length() > 20) {
                throw new WrongLoginException("Длина логина должна быть меньше или равна 20");
            }
            if (Objects.isNull(password) || login.length() >= 20) {
                throw new WrongPasswordException("Длина пароля должна быть меньше 20");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли должны совпадать");
            }
            Checker checker = ThreadLocalRandom.current().nextBoolean() ? // вот эти записи что делают ThreadLocalRandom.current().nextBoolean()
                    new RegexChecker() :
                    new LoopChecker();
            if (!checker.isValid(login)) {
                throw new WrongLoginException("Логин содержит не корректные значения");
            }
        }
    }
}


