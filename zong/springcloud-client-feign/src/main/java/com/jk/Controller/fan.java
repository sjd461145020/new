package com.jk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("aaa")
public class fan {

    @RequestMapping("add")
    public String add(){
        return "add";
    }
}
