package com.dailycodework.springbootbasic;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/v1")
public class BaseController {


    @GetMapping("test")
    @ResponseBody
    public String index() {
        return "bạn ten la gi";
    }
}
