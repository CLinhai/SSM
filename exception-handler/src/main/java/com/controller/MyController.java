package com.controller;

import com.exception.AgeException;
import com.exception.NameException;
import com.exception.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name, Integer age) throws UserException {
        ModelAndView mv = new ModelAndView();
        if (!"zs".equals(name)) {
            throw new NameException("姓名不正确!");
        }
        if (age == null || age > 80) {
            throw new AgeException("年纪太大啦!");
        }

        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");

        mv.setViewName("show");
        return mv;
    }
}
