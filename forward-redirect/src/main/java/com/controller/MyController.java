package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
        @RequestMapping(value = "/doForward.do")
        public ModelAndView doSome(){
            ModelAndView mv = new ModelAndView();
            mv.addObject("msg", "欢迎使用springMVC开发");
            mv.addObject("fun", "执行的是doSome方法");
            //转发到WEB-INF下
            mv.setViewName("forward:/WEB-INF/view/show.jsp");
            return mv;
        }

    @RequestMapping(value = "/doRedirect.do")
    public ModelAndView doWithRedirect(String name,Integer age){
        //处理some.do请求了。 相当于service调用处理完成了。
        ModelAndView mv  = new ModelAndView();
        //数据放入到 request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //重定向
        mv.setViewName("redirect:/hello.jsp");
        //http://localhost:8080/ch08_forard_redirect/hello.jsp?myname=lisi&myage=22

        //重定向不能访问/WEB-INF资源
//        mv.setViewName("redirect:/WEB-INF/view/show.jsp");
        return mv;
    }
}
