package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "/hellotest1", method = RequestMethod.GET)
    public String helloTest1() {
        return "Hello";
    }

    @ResponseBody
    @RequestMapping(value = "/hellotest2", method = RequestMethod.GET)
    public String helloTest2() {
        return "Hello";
    }
}
