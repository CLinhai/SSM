package com.handler;

import com.exception.AgeException;
import com.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    /*
           异常发生处理逻辑：
           1.需要把异常记录下来， 记录到数据库，日志文件。
             记录日志发生的时间，哪个方法发生的，异常错误内容。
           2.发送通知，把异常的信息通过邮件，短信，微信发送给相关人员。
           3.给用户友好的提示。
         */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception exception){

        //处理NameException的异常。
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是zs，其它用户不能访问");
        mv.addObject("ex",exception);
        mv.setViewName("nameError");
        return mv;
    }


    //处理AgeException
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception exception){
        //处理AgeException的异常。
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你的年龄不能大于80");
        mv.addObject("ex",exception);
        mv.setViewName("ageError");
        return mv;
    }

    //处理其它异常， NameException, AgeException以外，不知类型的异常
    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception){
        //处理其它异常
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你的年龄不能大于80");
        mv.addObject("ex",exception);
        mv.setViewName("defaultError");
        return mv;
    }

}
