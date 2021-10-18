package ds.com.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping({"","/"})
    public String home(Model model){
        model.addAttribute("myName","염인식");
        return "/index";
    }
}
