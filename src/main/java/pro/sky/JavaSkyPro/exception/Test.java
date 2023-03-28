package pro.sky.JavaSkyPro.exception;

public class Test {
    public static void main(String[] args) {
        boolean result = Validator.validate("test_123", "TEST_543", "Test_987");
        if (result) {
            System.out.println("Все корректно");
        } else {
            System.out.println("Логин или пароль не корректны");
        }
    }
}
