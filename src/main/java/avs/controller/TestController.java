package avs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="AVS") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }

}