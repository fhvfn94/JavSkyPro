package pro.sky.JavaSkyPro.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class Lesson {
    private final LessonService lessonService;

    public Lesson(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping
    public String getLesson() {
        return "Hello Lesson";
    }

    @GetMapping(path = "/practica")
    public String getPerson(@RequestParam("number") Integer number) {
        try {
            return lessonService.getPerson(number);
        } catch (BadNumberException a) {
            return "введите number от 0 до 2";
        }
    }
}
