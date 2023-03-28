package pro.sky.JavaSkyPro.exception;

public class RegexChecker implements Checker {

    @Override
    public boolean isValid(String s) {
        return s.matches("^\\w+$");
    } // Вот это что делает?  s.matches("^\\w+$")
}
