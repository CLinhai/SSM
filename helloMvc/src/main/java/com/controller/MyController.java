package com.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/test")
public class MyController{

    @RequestMapping(value = "/myajax.do")
    public void doAjax(String name, Integer age,
                       HttpServletResponse response) throws IOException {
        System.out.println("===doReturnVoidAjax====, name="+name+"   age="+age);
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(student);

        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }

    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        System.out.println("处理some.do请求");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "欢迎使用springMvc开发");
        mv.addObject("fun", "使用的doSome方法");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/other.do",method = RequestMethod.POST)
    public ModelAndView doOther(){
        return new ModelAndView("other");
    }

    @RequestMapping(value = "/register.do")
    public ModelAndView register(@RequestParam(value = "myname") String name, int age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/receiveObject.do")
    public ModelAndView register(Student student){
        System.out.println("receiveParam, name="+student.getName()+"   age="+student.getAge());
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", student.getName());
        mv.addObject("myage", student.getAge());
        mv.addObject("myStudent", student);
        mv.setViewName("show");
        return mv;
    }






}
