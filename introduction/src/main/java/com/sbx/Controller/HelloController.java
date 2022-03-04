package com.sbx.Controller;

import com.sbx.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/5 0:30
 * @description :
 * @version: :1.0.0
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public  String index(){
        //返回视图名称
        return "index";
    }
}
