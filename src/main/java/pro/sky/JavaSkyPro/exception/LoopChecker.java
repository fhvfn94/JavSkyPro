package pro.sky.JavaSkyPro.exception;

public class LoopChecker implements Checker {
    public static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789_";
    @Override
    public boolean isValid(String s) {
        char[] chars = s.toCharArray(); //  это что сделать из строки  ALLOWED_CHARACTERS массив из чаров?
        for (char symbol:chars) {
            if (!ALLOWED_CHARACTERS.contains(Character.toString(symbol))) { // Что за contains? что он делает? (!ALLOWED_CHARACTERS.contains(Character.toString(symbol)))
                return false;
            }
        }
        return true;
    }
}
