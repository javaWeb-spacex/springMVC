package com.sbx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/9 21:48
 * @description :
 * @version: :1.0.0
 */
@Controller
public class AnnotationController {
    @RequestMapping("/index")
    public String inde(){
        return "index";
    }
}
