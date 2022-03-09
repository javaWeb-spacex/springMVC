package com.sbx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/6 17:40
 * @description :
 * @version: :1.0.0
 */
@Controller
public class ViewController {

    @RequestMapping("/view")
    public String view(){
        return "view";
    }

    @RequestMapping("/thymeleafView")
    public String thymeleafView(){
        return "success";
    }

    @RequestMapping("/forward")
    public String forward(){
        return "forward:/thymeleafView";
    }

    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/thymeleafView";
    }
}
