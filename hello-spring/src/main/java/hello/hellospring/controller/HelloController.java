package hello.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")    // tomcat서버에서 온 hello라는 요청에 대해 mapping한다
    public String hello(Model model) {
        // key : value -> data : hello
        model.addAttribute("data", "hello!!");
        return "hello"; // templates에 있는 hello.html로 가서 데이터를 리턴하라
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
}
