package com.sbx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/9 19:00
 * @description :
 * @version: :1.0.0
 */
@Controller
public class TestExceptionController {
    @RequestMapping("/ExceptionHandler")
    public  String exceptionHandler(){
        System.out.println(10/0);
        return "success";
    }
}
