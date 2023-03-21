package pro.sky.JavaSkyPro.exception;

import org.springframework.stereotype.Service;

@Service
public class LessonService implements LessonIml {
    Person[] people = {
            new Person("John", "White", 123, 0),
            new Person("Jordan", "Black", 987, 1),
            new Person("Bill", "Collins", 321, 7)
    };

    String[] professions = {
        "it-developer",
        "dentist",
        "doctor"
    };

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number > people.length) {
            throw new BadNumberException();
        }
        person = people[number];
        String indexPeople = person.getName() + " " + person.getSurname() + " " + person.getPassport() + " " + professions[person.getProfessionIndex()];
        return indexPeople;
    }
}
