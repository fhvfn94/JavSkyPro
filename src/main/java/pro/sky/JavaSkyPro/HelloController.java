package pro.sky.JavaSkyPro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping
    public String helloBold() {
        return helloService.helloBold();
    }
    @GetMapping(path = "/hello")
    public String hello(@RequestParam("name") String userName) {
        return helloService.hello(userName);
    }
}
