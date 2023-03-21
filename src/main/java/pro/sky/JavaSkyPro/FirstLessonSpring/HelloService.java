package pro.sky.JavaSkyPro.FirstLessonSpring;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class HelloService {
    public String helloBold() {
        return "<b>Hello world</b>";
    }
    public String hello(String userName) {
        return "<h1>Hello world</h1>" + userName;
    }
}
