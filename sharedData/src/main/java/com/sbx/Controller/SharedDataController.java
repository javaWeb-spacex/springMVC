package com.sbx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/6 0:21
 * @description :
 * @version: :1.0.0
 */
@Controller
public class SharedDataController {

    @RequestMapping("/sharedData")
    public String sharedData(){
        return "index";
    }
}
