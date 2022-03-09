package com.sbx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/9 14:16
 * @description :
 * @version: :1.0.0
 */
@Controller
public class InterceptorController {
    @RequestMapping("/Interceptor")
    public String Interceptor(){
        return "success";
    }
}
