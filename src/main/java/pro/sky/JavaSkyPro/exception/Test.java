package pro.sky.JavaSkyPro.exception;

public class Test {
    public static void main(String[] args) {
        boolean result = Validator.validate("TEST_532132132132132132132131231232132143", "TEST_532132132132132132132131231232132143", "TEST_532132132132132132132131231232132143");
        if (result) {
            System.out.println("Все корректно");
        } else {
            System.out.println("Логин или пароль не корректны");
        }
    }
}
