package com.server.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reminder")
public class ReminderControler {

    @RequestMapping(value = "/get" ,method = RequestMethod.GET)
    @ResponseBody
    public String getrem(){
        return "33333";
    }
}
