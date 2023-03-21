package pro.sky.JavaSkyPro.exception;

public class Person {
    private String name;
    private String surname;
    private int passport;
    private int professionIndex;

    public Person(String name, String surname, int passport, int professionIndex) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionIndex = professionIndex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPassport() {
        return passport;
    }

    public int getProfessionIndex() {
        return professionIndex;
    }
}
